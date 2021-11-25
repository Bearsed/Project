package com.louis.mango.controller;

import com.louis.mango.config.RespBean;
import com.louis.mango.model.Product;
import com.louis.mango.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/selectByPrimaryKey")
    public Product selectByPrimaryKey(Long id){
        return productService.selectByPrimaryKey(id);
    }

    @DeleteMapping(value = "/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Long id){
        return productService.deleteByPrimaryKey(id);
    }

    @PutMapping
    public int updateByPrimaryKey(@RequestBody Product product){
        return productService.updateByPrimaryKey(product);
    }

    @PostMapping(value = "/insert")
    public int insert(@RequestBody Product product){
        return productService.insert(product);
    }

    @GetMapping(value = "/findByPage")
    public RespBean findByPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "1") Integer pageSize){
        return productService.findByPage(pageNum,pageSize);
    }
}
