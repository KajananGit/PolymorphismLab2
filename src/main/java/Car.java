public class Car extends Vehicle{

    private boolean hasPanroof;
    private int noOfWindows;
    private boolean hasNavigation;
    private boolean hasBluetooth;

    public Car(int maxCapacity, String fuelType, String motorType, int price, int cost, int maxSpeedBHP, boolean hasPanroof, int noOfWindows, boolean hasNavigation, boolean hasBluetooth) {
        super(maxCapacity, fuelType, motorType, price, cost, maxSpeedBHP);
        this.hasPanroof = hasPanroof;
        this.noOfWindows = noOfWindows;
        this.hasNavigation = hasNavigation;
        this.hasBluetooth = hasBluetooth;
    }


    @Override
    public String honk(){
        return "BEEP BEEP!";
    }

    public String playMusic(){
        return "Travis Scott";
    }



}
