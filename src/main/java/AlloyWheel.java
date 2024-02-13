import interfaces.ISell;

public class AlloyWheel implements ISell {
    private String materialType;
    private int noOfSpokes;
    private int price;
    private int cost;

    public AlloyWheel(String materialType, int noOfSpokes, int price, int cost){
        this.materialType = materialType;
        this.noOfSpokes = noOfSpokes;
        this.price = price;
        this.cost = cost;
    }


    @Override
    public int calculateProfit() {
        return this.price - this.cost;
    }
}
