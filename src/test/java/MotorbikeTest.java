import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorbikeTest {

    Motorbike motorbike;

    @BeforeEach
    public void setUp(){
        motorbike = new Motorbike(2, "Petrol", "Combustion", 25000, 180, false, true);
    }

    @Test
    public void canAccelerate(){
        assertThat(motorbike.accelerate()).isEqualTo("Zooom");
    }

    @Test
    public void canBreak(){
        assertThat(motorbike.breaking()).isEqualTo("Squeek... Stopped!");
    }

    @Test
    public void canHonk(){
        assertThat(motorbike.honk()).isEqualTo("Toot toot!");
    }




}
