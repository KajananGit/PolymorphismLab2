import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car(4, "Petrol", "Combustion", 75000, 30000, 520, true, 4, true, true);
    }

    @Test
    public void canAccelerate(){
        assertThat(car.accelerate()).isEqualTo("Vroom");
    }

    @Test
    public void canBreak(){
        assertThat(car.breaking()).isEqualTo("Squeek... Stopped!");
    }

    @Test
    public void canHonk(){
        assertThat(car.honk()).isEqualTo("BEEP BEEP!");
    }

    @Test
    public void canPlayMusic(){
        assertThat(car.playMusic("Don Toliver", "Private Landing")).isEqualTo("Artist: Don Toliver" + "\n" + "Song: Private Landing");
    }

    @Test
    public void canCalculateProfit(){
        assertThat(car.calculateProfit()).isEqualTo(45000);
    }



}
