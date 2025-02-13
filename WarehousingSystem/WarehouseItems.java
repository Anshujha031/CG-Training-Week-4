package org.example.WarehousingSystem;

public abstract class WarehouseItems {
    private String name;
    public WarehouseItems(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }

}

class Electronics extends WarehouseItems{
    public Electronics(String name){
        super(name);
    }

}

class Groceries extends WarehouseItems{
    public Groceries(String name){
        super(name);
    }
}

class Furniture extends WarehouseItems{
    public Furniture(String name){
        super(name);
    }
}
