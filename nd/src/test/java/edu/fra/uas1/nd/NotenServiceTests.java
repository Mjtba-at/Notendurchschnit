package edu.fra.uas1.nd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.fra.uas1.nd.notenService.NotenService;

@SpringBootTest
public class NotenServiceTests {

    @Autowired
    private NotenService notenService;

    @Test
    public void testNotenDurchschnitt() {
        int[] noten = {80, 75, 90, 85, 70};
        double expectedDurchschnitt = 80.0;

        double actualDurchschnitt = notenService.berechnenDurchschnitt (noten);

        assertThat(actualDurchschnitt).isEqualTo(expectedDurchschnitt);
    }
}

