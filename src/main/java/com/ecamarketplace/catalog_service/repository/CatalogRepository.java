package com.ecamarketplace.catalog_service.repository;

import com.ecamarketplace.catalog_service.entity.CatalogItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dusan
 * @date 8/20/2026
 */

@Repository
public interface CatalogRepository extends MongoRepository<CatalogItem, String> {
    // Custom query methods can be added here in the future
}
