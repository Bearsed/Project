package com.louis.mango.dao;

import com.louis.mango.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    Product selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Product record);

    List<Product> selectByPage(@Param("pageNum") Integer page, @Param("pageSize") Integer size);

    Long selectCount();
}
