package com.ecamarketplace.catalog_service.service;

import com.ecamarketplace.catalog_service.dto.CatalogRequest;
import com.ecamarketplace.catalog_service.entity.CatalogItem;
import com.ecamarketplace.catalog_service.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dusan
 * @date 8/20/2026
 */

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public String addCatalogItem(CatalogRequest request) {
        CatalogItem item = CatalogItem.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

        catalogRepository.save(item);
        return "Catalog item saved successfully!";
    }

    public List<CatalogItem> getAllItems() {
        return catalogRepository.findAll();
    }
}
