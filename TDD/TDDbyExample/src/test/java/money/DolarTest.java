package money;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class DolarTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertThat(Money.dollar(10), is(five.times(2)));
        assertThat(Money.dollar(15), is(five.times(3)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertThat(new Franc(10), is(five.times(2)));
        assertThat(new Franc(15), is(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5), is(equalTo(Money.dollar(5))));
        assertThat(Money.dollar(5), is(not(equalTo(Money.dollar(6)))));
        assertThat(Money.franc(5), is(equalTo(Money.franc(5))));
        assertThat(Money.franc(5), is(not(equalTo(Money.franc(6)))));
        assertThat(Money.franc(5), is(not(equalTo(Money.dollar(6)))));
    }
}
