package money;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class DolarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(five.amount, is(10));
    }
}
