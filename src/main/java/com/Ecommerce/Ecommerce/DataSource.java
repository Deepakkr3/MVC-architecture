package com.Ecommerce.Ecommerce;

import com.Ecommerce.Ecommerce.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {
    @Bean
    Map<Integer, Product> getdataSource()
    {
        return new HashMap<>();
    }
}
