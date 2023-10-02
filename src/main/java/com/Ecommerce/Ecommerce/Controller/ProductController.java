package com.Ecommerce.Ecommerce.Controller;

import com.Ecommerce.Ecommerce.Service.ProductService;
import com.Ecommerce.Ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("product")
    public String addProduct(Product myProduct)
    {
        return productService.addProduct(myProduct);
    }
    @GetMapping("products")
    public Map<Integer,Product> getall()
    {
        return productService.getall();
    }
}
