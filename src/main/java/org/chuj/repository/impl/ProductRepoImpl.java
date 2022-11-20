package org.chuj.repository.impl;

import org.chuj.model.Product;
import org.chuj.repository.ProductRepository;

import java.util.ArrayList;

public class ProductRepoImpl implements ProductRepository {

    @Override
    public ArrayList<Product> removeProdById(ArrayList<Product> prodList, int id) {
        for (Product product : prodList) {
            if (product.getId() == id) {
                prodList.remove(product);
            }
        }

        return prodList;
    }

    @Override
    public Product findProdById(ArrayList<Product> prodList, int id) {
        for (Product product : prodList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
