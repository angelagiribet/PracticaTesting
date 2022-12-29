import data.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publicadministration.*;
import DoubleTestClasses.*;
import citizenmanagementplatform.*;

public class EnterPINTest {
    UnifiedPlatform unifiedPlatform;

    @BeforeEach
    void initialize() {
        unifiedPlatform = new UnifiedPlatform();
        unifiedPlatform.setJusticeMinistry(new JusticeMinistryDouble());
    }

    @Test
    void testingInitalization() {}

}
