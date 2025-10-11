package com.example.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.shoppingmall.entity.Shop;
import com.example.shoppingmall.service.IShopService;
import java.util.List;

@RestController
@RequestMapping("/api/shops")
@CrossOrigin("*")
public class ShopController {
    @Autowired
    private IShopService service;
    @PostMapping
    public Shop addShop(@RequestBody Shop shop) { return service.addShop(shop); }
    @PutMapping
    public Shop updateShop(@RequestBody Shop shop) { return service.updateShop(shop); }
    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable Long id) { return service.searchShopById(id); }
    @DeleteMapping("/{id}")
    public String deleteShop(@PathVariable Long id) { return service.deleteShop(id) ? "Deleted Successfully" : "Shop Not Found"; }
    @GetMapping
    public List<Shop> getAllShops() { return service.getAllShops(); }
}