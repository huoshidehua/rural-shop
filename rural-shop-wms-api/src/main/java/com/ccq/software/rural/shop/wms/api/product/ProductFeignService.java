package com.ccq.software.rural.shop.wms.api.product;

import com.ccq.software.rural.shop.common.model.wms.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="rural-shop-wms")
public interface ProductFeignService {

    @RequestMapping(value = "/wms/product/findById/{id}",method = RequestMethod.GET)
    List<Product> findById(@PathVariable("id") Long id);
}
