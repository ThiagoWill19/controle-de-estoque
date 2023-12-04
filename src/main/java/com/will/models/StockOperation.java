package com.will.models;

import java.util.Date;
import java.util.UUID;

import com.will.models.enums.StockOperationType;

public class StockOperation {
	
	private UUID id;
	private String operator;
	private StockOperationType stockOperationType;
	private Date operationDate;
	private String itemId;
	private int quantity;
	
	public StockOperation(String operator, StockOperationType operation, Date operationDate, String itemId, int quantity) {
		this.operator = operator;
		this.stockOperationType = operation;
		this.operationDate = operationDate;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
	public StockOperation() {
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public StockOperationType getStockOperationType() {
		return stockOperationType;
	}

	public void setStockOperationType(StockOperationType stockOperationType) {
		this.stockOperationType = stockOperationType;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
