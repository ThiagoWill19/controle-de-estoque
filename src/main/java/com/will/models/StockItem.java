package com.will.models;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockItem extends Item{
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	private int quantity;
	
    private Date entryDate;

    
    public StockItem(){
        
    }

    public StockItem(String name, int quantity, String description, Date entryDate){
        super(name, description);
        this.quantity = quantity;
        this.entryDate = entryDate;
    }

    
    public void setEntryDate(Date entryDate){
        this.entryDate = entryDate;
    }

    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getEntryDate(){
        return this.entryDate;
    }

    public String getId(){
        return this.id.toString();
    }
}
