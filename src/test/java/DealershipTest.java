import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DealershipTest {

    Dealership dealership;
    Vehicle car;
    Motorbike motorbike; // gets treated like a Vehicle class type
    @BeforeEach
    public void setUp(){
        dealership = new Dealership("BMW London");
        car = new Car(4, "Petrol", "Combustion", 75000, 30000, 520, true, 4, true, true);
        motorbike = new Motorbike(2, "Petrol", "Combustion", 25000, 7500, 180, false, true);

    }


    @Test
    public void canGetTill(){
        assertThat(dealership.getTill()).isEqualTo(0);
    }

    @Test
    public void canCountStock(){
        assertThat(dealership.countStock()).isEqualTo(0);
    }

    @Test
    public void canAddNewStock(){
        dealership.addNewStock(car);
        dealership.addNewStock(motorbike);
        assertThat(dealership.countStock()).isEqualTo(2);
    }

    @Test
    public void canUpdateTill(){
        dealership.updateTill(100);
        assertThat(dealership.getTill()).isEqualTo(100);
    }

    @Test
    public void canSellVehicle(){
        dealership.addNewStock(car);
        dealership.addNewStock(motorbike);
        dealership.sellProduct(motorbike);
        assertThat(dealership.countStock()).isEqualTo(1);
        assertThat(dealership.getTill()).isEqualTo(25000);
    }




}
