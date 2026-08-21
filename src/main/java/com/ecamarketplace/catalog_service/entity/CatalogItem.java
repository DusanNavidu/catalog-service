package com.ecamarketplace.catalog_service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

/**
 * @author Dusan
 * @date 8/20/2026
 */

@Document(collection = "catalog_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CatalogItem {

    @Id
    private String id; // MongoDB uses String for IDs by default

    private String title;

    private String description;

    private double price;
}
