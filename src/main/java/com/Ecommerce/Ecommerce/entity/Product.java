package com.Ecommerce.Ecommerce.entity;

import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer productId;
    private  String productName;
    private double productPrice;
    private Categury productCategory;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Categury getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Categury productCategory) {
        this.productCategory = productCategory;
    }
}
