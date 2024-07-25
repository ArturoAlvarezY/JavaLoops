import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;


import org.junit.jupiter.api.Test;

import dev.arturo.models.Multiply;

public class MultiplyTest {
    @Test
    void testMultiplytable() {
        Multiply multiply = new Multiply(5);

        assertThat(multiply.Multiplytable(), contains(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50));
        
    }
}
