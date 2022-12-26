package data;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmallCodeTest {

    public void TestingEquals () {
        SmallCode sm1 = new SmallCode ("code");
        SmallCode sm2 = new SmallCode ("code");
        assertTrue(sm1.equals(sm2));
    }
}
