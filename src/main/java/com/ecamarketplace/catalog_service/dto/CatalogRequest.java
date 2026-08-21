package com.ecamarketplace.catalog_service.dto;

import lombok.Data;

/**
 * @author Dusan
 * @date 8/20/2026
 */

@Data
public class CatalogRequest {
    private String title;
    private String description;
    private double price;
}