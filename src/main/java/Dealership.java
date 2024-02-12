import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> stock;
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

    public void addNewStock(Vehicle vehicle){
        stock.add(vehicle);
    }

    public void updateTill(int amount){
        till += amount;
    }
    public void sellVehicle(Vehicle vehicle){
        int price = vehicle.getPrice();
        stock.remove(vehicle);
        updateTill(price);
    }


}
