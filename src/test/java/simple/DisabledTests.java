package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {

    @Test
    @Disabled("Not relevant ATM")
    public void disTest1() {
        assertTrue(false);
    }

    @Test
    @Disabled
    public void disTest2(){
        assertTrue(false);
    }


    @Test
    @Disabled
    public void disTest3(){
        assertTrue(false);
    }
}
