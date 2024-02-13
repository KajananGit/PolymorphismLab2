import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AlloyWheelTest {

    AlloyWheel alloyWheel;

    @BeforeEach
    public void setUp(){
        alloyWheel = new AlloyWheel("BBS", 5, 5000, 1800);
    }

    @Test
    public void canCalculateProfit(){
        assertThat(alloyWheel.calculateProfit()).isEqualTo(3200);
    }

}
