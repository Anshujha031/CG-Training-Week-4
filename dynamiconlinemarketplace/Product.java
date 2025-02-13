package org.example.dynamiconlinemarketplace;


    import java.util.ArrayList;
import java.util.List;


    abstract class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + " - " + name + ": $" + price;
        }
    }

    // Specific product categories
    class Book extends Product {
        public Book(String name, double price) {
            super(name, price);
        }
    }

    class Clothing extends Product {
        public Clothing(String name, double price) {
            super(name, price);
        }
    }

    class Gadget extends Product {
        public Gadget(String name, double price) {
            super(name, price);
        }
    }


