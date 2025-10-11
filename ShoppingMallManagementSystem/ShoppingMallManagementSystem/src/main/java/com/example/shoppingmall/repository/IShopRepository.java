package com.example.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shoppingmall.entity.Shop;

public interface IShopRepository extends JpaRepository<Shop, Long> {}