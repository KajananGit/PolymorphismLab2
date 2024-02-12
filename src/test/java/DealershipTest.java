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
        assertThat(dealership.countStock()).isEqualTo(1);
    }

    @Test
    public void canUpdateTill(){
        dealership.updateTill(100);
        assertThat(dealership.getTill()).isEqualTo(100);
    }

    @Test
    public void canSellVehicle(){
        dealership.addNewStock(car);
        dealership.sellVehicle(car);
        assertThat(dealership.countStock()).isEqualTo(0);
        assertThat(dealership.getTill()).isEqualTo(75000);
    }




}
