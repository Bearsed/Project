package com.louis.mango.dao;

import com.louis.mango.model.Brand;

public interface BrandMapper {
    Brand selectByPrimaryKey(Long id);
}
