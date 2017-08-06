package com.cnblogs.yjmyzz.dao.mapper;

import com.cnblogs.yjmyzz.dao.model.Product;
import com.cnblogs.yjmyzz.dao.vo.ProductParam;
import com.cnblogs.yjmyzz.util.MyMapper;

import java.util.List;

public interface ProductMapper extends MyMapper<Product> {
    Product getFirst();

    List<Product> selectByParam(ProductParam param);
}