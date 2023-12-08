package com.will.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.will.models.StockOperation;


public interface StockOperationRepository extends JpaRepository<StockOperation, UUID>{

}
