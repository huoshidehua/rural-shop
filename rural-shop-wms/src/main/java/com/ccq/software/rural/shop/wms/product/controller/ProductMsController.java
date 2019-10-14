package com.ccq.software.rural.shop.wms.product.controller;

import com.ccq.software.rural.shop.common.model.wms.Product;
import com.ccq.software.rural.shop.common.model.wms.ProductExample;
import com.ccq.software.rural.shop.wms.api.product.ProductFeignService;
import com.ccq.software.rural.shop.wms.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductMsController implements ProductFeignService {


    @Autowired
    private ProductMapper productMapper;



    @Override
    public List<Product> findById(@PathVariable("id") Long id) {

        List<Product> products = productMapper.selectByExample(new ProductExample());

        return products;
    }
}
