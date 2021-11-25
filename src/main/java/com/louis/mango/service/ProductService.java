package com.louis.mango.service;

import com.louis.mango.config.RespBean;
import com.louis.mango.model.Product;

public interface ProductService {
    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    Product selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Product record);

    RespBean findByPage(Integer pageNum, Integer pageSize);
}
