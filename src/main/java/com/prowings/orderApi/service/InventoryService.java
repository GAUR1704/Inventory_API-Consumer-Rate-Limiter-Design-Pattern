package com.prowings.orderApi.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public String checkInventory() {
        return "Inventory checked successfully!";
    }
}
