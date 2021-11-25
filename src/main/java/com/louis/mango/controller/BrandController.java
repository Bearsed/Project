package com.louis.mango.controller;

import com.louis.mango.model.Brand;
import com.louis.mango.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping(value="/findByid")
    public Brand findByLable(@RequestParam Long id) {
        return brandService.selectById(id);
    }
}
