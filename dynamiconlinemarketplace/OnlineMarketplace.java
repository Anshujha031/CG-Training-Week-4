package org.example.dynamiconlinemarketplace;

public class OnlineMarketplace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("Java Programming", 50.0));
        bookCatalog.addProduct(new Book("Data Structures", 40.0));

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 20.0));
        clothingCatalog.addProduct(new Clothing("Jeans", 45.0));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 500.0));
        gadgetCatalog.addProduct(new Gadget("Headphones", 100.0));

        // Applying discounts
        DiscountUtils.applyDiscount(bookCatalog.getAllProducts().get(0), 10);
        DiscountUtils.applyDiscount(clothingCatalog.getAllProducts().get(1), 15);
        DiscountUtils.applyDiscount(gadgetCatalog.getAllProducts().get(0), 5);
    }
}
