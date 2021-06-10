package LabTest1;

public class Item <A,B>{
    //store item and its price
    private A item;
    private B price;

    public Item(A item, B price) {
        this.item = item;
        this.price = price;
    }

    public A getItem() {
        return item;
    }

    public void setItem(A item) {
        this.item = item;
    }

    public B getPrice() {
        return price;
    }

    public void setPrice(B price) {
        this.price = price;
    }
}
