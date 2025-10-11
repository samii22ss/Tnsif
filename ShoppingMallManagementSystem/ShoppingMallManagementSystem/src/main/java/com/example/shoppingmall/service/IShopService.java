package com.example.shoppingmall.service;

import java.util.List;
import com.example.shoppingmall.entity.Shop;

public interface IShopService {
    Shop addShop(Shop shop);
    Shop updateShop(Shop shop);
    Shop searchShopById(Long id);
    boolean deleteShop(Long id);
    List<Shop> getAllShops();
}