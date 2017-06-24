package com.cnblogs.yjmyzz.db.aspect;

import com.cnblogs.yjmyzz.db.annotation.ProductMaster;
import com.cnblogs.yjmyzz.db.annotation.ProductSlave;
import com.cnblogs.yjmyzz.db.annotation.StudyMaster;
import com.cnblogs.yjmyzz.db.annotation.StudySlave;
import com.cnblogs.yjmyzz.db.datasource.DbContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MasterSlaveAspect implements Ordered {

    public static final Logger logger = LoggerFactory.getLogger(MasterSlaveAspect.class);


    /**
     * 切换到product主库
     *
     * @param proceedingJoinPoint
     * @param productMaster
     * @return
     * @throws Throwable
     */
    @Around("@annotation(productMaster)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, ProductMaster productMaster) throws Throwable {
        try {
            logger.info("set database connection to product-master only");
            DbContextHolder.setDbType(DbContextHolder.DbType.PRODUCT_MASTER);
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            DbContextHolder.clearDbType();
            logger.info("restore database connection");
        }
    }


    /**
     * 切换到product从库
     *
     * @param proceedingJoinPoint
     * @param productSlave
     * @return
     * @throws Throwable
     */
    @Around("@annotation(productSlave)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, ProductSlave productSlave) throws Throwable {
        try {
            logger.info("set database connection to product-slave only");
            DbContextHolder.setDbType(DbContextHolder.DbType.PRODUCT_SLAVE);
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            DbContextHolder.clearDbType();
            logger.info("restore database connection");
        }
    }

    /**
     * 切换到study主库
     *
     * @param proceedingJoinPoint
     * @param studyMaster
     * @return
     * @throws Throwable
     */
    @Around("@annotation(studyMaster)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, StudyMaster studyMaster) throws Throwable {
        try {
            logger.info("set database connection to study-master only");
            DbContextHolder.setDbType(DbContextHolder.DbType.STUDY_MASTER);
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            DbContextHolder.clearDbType();
            logger.info("restore database connection");
        }
    }

    /**
     * 切换到study从库
     *
     * @param proceedingJoinPoint
     * @param studySlave
     * @return
     * @throws Throwable
     */
    @Around("@annotation(studySlave)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, StudySlave studySlave) throws Throwable {
        try {
            logger.info("set database connection to study-slave only");
            DbContextHolder.setDbType(DbContextHolder.DbType.STUDY_SLAVE);
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            DbContextHolder.clearDbType();
            logger.info("restore database connection");
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

