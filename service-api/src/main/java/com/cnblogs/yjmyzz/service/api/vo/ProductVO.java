package com.cnblogs.yjmyzz.service.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yangjunming on 2017/6/24.
 */
@Data
public class ProductVO implements Serializable {

    private String name;
    private BigDecimal price;
}
