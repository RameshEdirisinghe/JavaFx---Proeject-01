package org.example.model;

public class Items {
    private String id;
    private String name;
    private int qty;
    private Double price;
    private String dsc;

    public Items(String id, String name, int qty, Double price, String dsc) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.dsc = dsc;
    }

    public Items() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        dsc = dsc;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", Dsc='" + dsc + '\'' +
                '}';
    }
}
