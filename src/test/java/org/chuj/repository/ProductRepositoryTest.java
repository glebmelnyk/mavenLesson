package org.chuj.repository;

import org.chuj.model.Product;
import org.chuj.repository.impl.ProductRepoImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ProductRepositoryTest {
    private ProductRepository repository;

    @BeforeEach
    void setUp() {
        repository = new ProductRepoImpl();
    }

    @Test
    void deleteMethodTest() {
        Product bread = new Product();
        bread.setId(1);
        Product maslo = new Product();
        maslo.setId(2);
        ArrayList<Product> collection = new ArrayList<>();
        collection.add(bread);
        collection.add(maslo);
        ArrayList<Product> testColect = repository.removeProdById(collection, 1);
        assertEquals(1, testColect.size());

    }

    @Test
    void deleteMethodTest2() {
        Product bread = new Product();
        bread.setId(1);
        Product maslo = new Product();
        maslo.setId(2);
        ArrayList<Product> collection = new ArrayList<>();
        collection.add(bread);
        collection.add(maslo);
        ArrayList<Product> testColect = repository.removeProdById(collection, 1);
        assertEquals(maslo, testColect.get(0));

    }

    @Test
    void deleteMethodTest3() {
        Product bread = new Product();
        bread.setId(1);
        Product maslo = new Product();
        maslo.setId(2);
        ArrayList<Product> collection = new ArrayList<>();
        collection.add(bread);
        collection.add(maslo);
        ArrayList<Product> testColect = repository.removeProdById(collection, 1);
        assertNotEquals(bread, testColect.get(0));
    }

    @Test
    void findMethodTest3() {
        Product bread = new Product();
        bread.setId(1);
        Product maslo = new Product();
        maslo.setId(2);
        ArrayList<Product> collection = new ArrayList<>();
        collection.add(bread);
        collection.add(maslo);
        Product product = repository.findProdById(collection, 1);
        assertEquals(bread, product);
    }
}
