package com.ecamarketplace.catalog_service.controller;

import com.ecamarketplace.catalog_service.dto.CatalogRequest;
import com.ecamarketplace.catalog_service.entity.CatalogItem;
import com.ecamarketplace.catalog_service.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dusan
 * @date 8/20/2026
 */

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @PostMapping("/add")
    public String addItem(@RequestBody CatalogRequest request) {
        return catalogService.addCatalogItem(request);
    }

    @GetMapping("/all")
    public List<CatalogItem> getAllItems() {
        return catalogService.getAllItems();
    }
}
