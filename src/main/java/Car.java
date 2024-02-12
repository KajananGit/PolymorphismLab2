public class Car extends Vehicle{

    private boolean hasPanroof;
    private int noOfWindows;
    private boolean hasNavigation;
    private boolean hasBluetooth;

    public Car(int maxCapacity, String fuelType, String motorType, int price, int maxSpeedBHP, boolean hasPanroof, int noOfWindows, boolean hasNavigation, boolean hasBluetooth) {
        super(maxCapacity, fuelType, motorType, price, maxSpeedBHP);
        this.hasPanroof = hasPanroof;
        this.noOfWindows = noOfWindows;
        this.hasNavigation = hasNavigation;
        this.hasBluetooth = hasBluetooth;
    }


    public String playMusic(){
        return "Travis Scott";
    }


}
