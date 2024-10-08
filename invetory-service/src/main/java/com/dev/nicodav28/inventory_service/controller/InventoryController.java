package com.dev.nicodav28.inventory_service.controller;

import com.dev.nicodav28.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class InventoryController {
    
    private final InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    @ResponseBody(HttpStatus.OK)
    public boolean isInStock(@PathVariable String skuCode) {
        return true;
    }

}
