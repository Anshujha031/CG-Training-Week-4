package org.example.WarehousingSystem;

    // Generic class for storage with bounded type parameter
import java.util.ArrayList;
import java.util.List;

    class Storage<T extends WarehouseItems> {
        private List<T> items = new ArrayList<>();

        public void addItem(T item) {
            items.add(item);
        }

        public T retrieveItem(int index) {
            if (index >= 0 && index < items.size()) {
                return items.remove(index);
            }
            return null;
        }

        public List<T> getItems() {
            return items;
        }
    }

    // Utility class for displaying items
    class WarehouseUtil {
        public static void displayItems(List<? extends WarehouseItems> items) {
            for (WarehouseItems item : items) {
                System.out.println(item);
            }
        }
    }

