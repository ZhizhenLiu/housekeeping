package com.housekeeping.bean;

/**
 * description: Product
 * date: 2021/3/4 16:03
 * author: zhizhenLiu
 * version: 1.0
 */
public class Product {
    private Long id;
    private String introduce;
    private String price;
    private String photo;
    private Integer sales;
    private Long categorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Long getCategorId() {
        return categorId;
    }

    public void setCategorId(Long categorId) {
        this.categorId = categorId;
    }
}
