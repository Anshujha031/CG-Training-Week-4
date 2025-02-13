package org.example.WarehousingSystem;

public class WarehousingMain {
    public static void main(String[] args) {
        Storage<Electronics> el = new Storage<>();
        el.addItem(new Electronics("Laptop"));
        el.addItem(new Electronics("LCD"));

        Storage<Groceries> g = new Storage<>();
        g.addItem(new Groceries("Wheat"));
        g.addItem(new Groceries("Rice"));

        Storage<Furniture> f = new Storage<>();
        f.addItem(new Furniture("Table"));
        f.addItem(new Furniture("Chair"));


        System.out.println("Electronics : ");

        WarehouseUtil.displayItems(el.getItems());
        System.out.println("Groceries : ");
        WarehouseUtil.displayItems(g.getItems());
        System.out.println("Furniture : ");
        WarehouseUtil.displayItems(f.getItems());

    }
}
