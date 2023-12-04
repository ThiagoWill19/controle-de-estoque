package com.will.models;

import com.will.models.enums.ItemCategory;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Item {
	
	private String name;
	
    private String description;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private ItemCategory category;

    
    public Item(){

    }

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}
    
    
}
