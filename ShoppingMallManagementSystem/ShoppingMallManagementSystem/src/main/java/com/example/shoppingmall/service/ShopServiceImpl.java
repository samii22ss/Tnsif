package com.example.shoppingmall.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shoppingmall.entity.Shop;
import com.example.shoppingmall.repository.IShopRepository;

@Service
public class ShopServiceImpl implements IShopService {
    @Autowired
    private IShopRepository repo;
    public Shop addShop(Shop shop) { return repo.save(shop); }
    public Shop updateShop(Shop shop) { return repo.save(shop); }
    public Shop searchShopById(Long id) { return repo.findById(id).orElse(null); }
    public boolean deleteShop(Long id) { if (repo.existsById(id)) { repo.deleteById(id); return true; } return false; }
    public List<Shop> getAllShops() { return repo.findAll(); }
}