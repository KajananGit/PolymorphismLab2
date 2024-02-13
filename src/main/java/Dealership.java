import interfaces.ISell;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<ISell> stock;
    private int till;

    public Dealership(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }


    public int getTill(){
        return till;
    }
    public int countStock(){
        return stock.size();
    }

    public void addNewStock(ISell product){
        stock.add(product);
    }

    public void updateTill(int amount){
        till += amount;
    }
    public void sellProduct(ISell product){
        int price = product.getPrice();
        stock.remove(product);
        updateTill(price);
    }


}
