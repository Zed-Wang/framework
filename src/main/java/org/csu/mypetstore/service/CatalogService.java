package org.csu.mypetstore.service;

import org.csu.mypetstore.domain.Category;
import org.csu.mypetstore.domain.Item;
import org.csu.mypetstore.domain.Product;
import org.csu.mypetstore.persistence.CategoryMapper;
import org.csu.mypetstore.persistence.ItemMapper;
import org.csu.mypetstore.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ItemMapper itemMapper;

    public Category getCategory(String categoryId) {
        return categoryMapper.getCategory(categoryId);
    }

    public List<Product> getProductListByCategory(String category) {
        return productMapper.getProductListByCategory(category);
    }

    public Product getProduct(String productId) {
        return productMapper.getProduct(productId);
    }

    public int getInventoryQuantity(String itemId) {
        return itemMapper.getInventoryQuantity(itemId);
    }

    public List<Item> getItemListByProduct(String productId) {
        return itemMapper.getItemListByProduct(productId);
    }

    public Item getItem(String itemId) {
        return itemMapper.getItem(itemId);
    }
}
