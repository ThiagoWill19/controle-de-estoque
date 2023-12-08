package com.will.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.will.models.StockItem;


public interface StockItemRepository extends JpaRepository<StockItem, UUID>{

}
