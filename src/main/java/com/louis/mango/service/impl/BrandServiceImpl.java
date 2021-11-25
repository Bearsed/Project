package com.louis.mango.service.impl;

import com.louis.mango.dao.BrandMapper;
import com.louis.mango.model.Brand;
import com.louis.mango.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Brand selectById(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
