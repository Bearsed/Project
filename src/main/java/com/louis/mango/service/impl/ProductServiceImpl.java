package com.louis.mango.service.impl;

import com.louis.mango.config.RespBean;
import com.louis.mango.dao.BrandMapper;
import com.louis.mango.dao.ProductMapper;
import com.louis.mango.model.Brand;
import com.louis.mango.model.Product;
import com.louis.mango.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Product record) {
        return productMapper.insert(record);
    }

    @Override
    public Product selectByPrimaryKey(Long id) {
        Product product = productMapper.selectByPrimaryKey(id);
        Brand brand = brandMapper.selectByPrimaryKey(product.getBrandId());
        product.setBrandName(brand.getName());
        return product;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return productMapper.updateByPrimaryKey(record);
    }

    @Override
    public RespBean findByPage(Integer pageNum, Integer pageSize) {
        if (pageNum != null && pageSize != null) {
            pageNum = (pageNum - 1) * pageSize;
        }
        List<Product> list = productMapper.selectByPage(pageNum,pageSize);
        for (Product product : list) {
            Brand brand = brandMapper.selectByPrimaryKey(product.getBrandId());
            product.setBrandName(brand.getName());
        }
        Long count = productMapper.selectCount();
        RespBean bean = new RespBean();
        bean.setData(list);
        bean.setTotal(count);
        return bean;
    }
}
