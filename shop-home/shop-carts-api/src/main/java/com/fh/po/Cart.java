package com.fh.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Cart implements Serializable {

    private Integer productId;

    private String productName;

    private String mainImg;

    private BigDecimal price;

    private Integer count;

    private BigDecimal subtotal;

    private Boolean isCheck;

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

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean Ischeck) {
        isCheck = Ischeck;
    }
}
