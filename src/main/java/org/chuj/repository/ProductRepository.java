package org.chuj.repository;

import org.chuj.model.Product;

import java.util.ArrayList;

public interface ProductRepository {
    ArrayList<Product> removeProdById(ArrayList<Product> prodList, int id);
    Product findProdById(ArrayList<Product> prodList, int id);
}
