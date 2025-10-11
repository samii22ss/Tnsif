package com.example.shoppingmall.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;
    private String shopName;
    private String shopCategory;
    private String shopStatus;
    private String leaseStatus;

    public Shop() {}
    public Shop(String shopName, String shopCategory, String shopStatus, String leaseStatus) {
        this.shopName = shopName;
        this.shopCategory = shopCategory;
        this.shopStatus = shopStatus;
        this.leaseStatus = leaseStatus;
    }
    public Long getShopId() { return shopId; }
    public void setShopId(Long shopId) { this.shopId = shopId; }
    public String getShopName() { return shopName; }
    public void setShopName(String shopName) { this.shopName = shopName; }
    public String getShopCategory() { return shopCategory; }
    public void setShopCategory(String shopCategory) { this.shopCategory = shopCategory; }
    public String getShopStatus() { return shopStatus; }
    public void setShopStatus(String shopStatus) { this.shopStatus = shopStatus; }
    public String getLeaseStatus() { return leaseStatus; }
    public void setLeaseStatus(String leaseStatus) { this.leaseStatus = leaseStatus; }
}