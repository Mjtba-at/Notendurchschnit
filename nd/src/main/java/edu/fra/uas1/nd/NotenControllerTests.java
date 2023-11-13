package edu.fra.uas1.nd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.fra.uas1.nd.controller.NotenController;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class NotenControllerTests {

    @Autowired
    private NotenController notenController;

    @Test
    public void testNotenDurchschnitt() {
        int[] noten = {80, 75, 90, 85, 70};
        double expectedDurchschnitt = 80.0;

        double actualDurchschnitt = notenController.notenDurchschnitt(noten);

        assertThat(actualDurchschnitt).isEqualTo(expectedDurchschnitt);
    }
}

