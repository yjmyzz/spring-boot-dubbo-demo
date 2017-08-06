package com.cnblogs.yjmyzz.dao.mapper.product;

import com.cnblogs.yjmyzz.dao.model.product.Product;
import com.cnblogs.yjmyzz.util.MyMapper;

public interface ProductMapper extends MyMapper<Product> {
    Product getFirst();
}