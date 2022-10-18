package com.acompany;

public class Product {
    private int productId;
    private String title;
    private int price;
    private String createDate;

    public Product() {}

    public Product(int productId, String title, int price, String createDate) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.createDate = createDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
