package data;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocPathTest {

    public void TestingEquals () {
        DocPath dp1 = new DocPath ("path");
        DocPath dp2 = new DocPath ("path");
        assertTrue(dp1.equals(dp2));
    }
}
