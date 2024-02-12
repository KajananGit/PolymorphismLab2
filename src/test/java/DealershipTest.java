import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DealershipTest {

    Dealership dealership;
    Vehicle car;
    @BeforeEach
    public void setUp(){
        dealership = new Dealership("BMW London");
        car = new Car(4, "Petrol", "Combustion", 75000, 520, true, 4, true, true);
    }


    @Test
    public void canCountStock(){
        assertThat(dealership.countStock()).isEqualTo(null);
    }

    @Test
    public void canAddNewStock(){
        dealership.addNewStock(car);
        assertThat(dealership.countStock().getSize()).isEqualTo(1);
    }

    @Test
    public void canSellVehicle(){
        dealership.addNewStock(car);
        dealership.sellVehicle(car);
        assertThat(dealership.countStock()).isEqualTo(null);
    }

    @Test
    public void canUpdateTill(){
        dealership.addNewStock(car);
        dealership.sellVehicle(car);
        assertThat(dealership.updateTill()).isEqualTo(75000);
    }


}