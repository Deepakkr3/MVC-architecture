package com.Ecommerce.Ecommerce.Service;

import com.Ecommerce.Ecommerce.entity.Product;
import com.Ecommerce.Ecommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public  String addProduct(Product myProduct) {
        productRepo.getProductMap().put(myProduct.getProductId(),myProduct);
        return  "added";

    }

    public Map<Integer,Product> getall() {
        return productRepo.getProductMap();

    }
}
