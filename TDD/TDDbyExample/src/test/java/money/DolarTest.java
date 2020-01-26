package money;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class DolarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, is(10));
        product = five.times(3);
        assertThat(product.amount, is(15));
    }

    @Test
    public void testEquality() {
        assertThat(new Dollar(5), is(equalTo(new Dollar(5))));
        assertThat(new Dollar(5), is(not(equalTo(new Dollar(6)))));
    }
}
