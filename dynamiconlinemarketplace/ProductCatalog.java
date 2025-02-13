package org.example.dynamiconlinemarketplace;

import java.util.*;
    class ProductCatalog<T extends Product> {
        private List<T> products;

        public ProductCatalog() {
            products = new ArrayList<>();
        }

        public void addProduct(T product) {
            System.out.println("Adding product: " + product.getName());
            products.add(product);
        }

        public List<T> getAllProducts() {
            return products;
        }
    }

class DiscountUtils {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Applied " + percentage + "% discount on " + product.getName() + ". New Price: $" + product.getPrice());
    }
}
