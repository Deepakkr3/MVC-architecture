package com.Ecommerce.Ecommerce.repo;

import com.Ecommerce.Ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class ProductRepo {
    @Autowired
    Map<Integer, Product> productMap;

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }
}
