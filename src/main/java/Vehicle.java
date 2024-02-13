import interfaces.ISell;

public abstract class Vehicle implements ISell {
    private int maxCapacity;
    private String fuelType;
    private String motorType;
    private int price;
    private int cost;
    private int maxSpeedBHP;

    public Vehicle(int maxCapacity, String fuelType, String motorType, int price, int cost, int maxSpeedBHP){
        this.maxCapacity = maxCapacity;
        this.fuelType = fuelType;
        this.motorType = motorType;
        this.price = price;
        this.cost = cost;
        this.maxSpeedBHP = maxSpeedBHP;
    }


    public int getPrice(){
        return price;
    }

    public String accelerate(){
        return "Vroom";
    }

    public String breaking(){
        return "Squeek... Stopped!";
    }

    public String honk(){
        return "Toot toot!";
    }

    public int calculateProfit(){
        return this.price - this.cost;
    }

}
