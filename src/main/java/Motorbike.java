public class Motorbike extends Vehicle{
    private boolean hasExtraStorage;
    private boolean hasLeatherTrim;

    public Motorbike(int maxCapacity, String fuelType, String motorType, int price, int cost, int maxSpeedBHP, boolean hasExtraStorage, boolean hasLeatherTrim ) {
        super(maxCapacity, fuelType, motorType, price, cost, maxSpeedBHP);
        this.hasExtraStorage = hasExtraStorage;
        this.hasLeatherTrim = hasLeatherTrim;
    }

    @Override
    public String accelerate(){
        return "Zooom";
    }


}
