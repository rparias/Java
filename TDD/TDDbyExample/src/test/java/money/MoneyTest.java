package money;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertThat(Money.dollar(10), is(five.times(2)));
        assertThat(Money.dollar(15), is(five.times(3)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertThat(Money.franc(10), is(five.times(2)));
        assertThat(Money.franc(15), is(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5), is(equalTo(Money.dollar(5))));
        assertThat(Money.dollar(5), is(not(equalTo(Money.dollar(6)))));
        assertThat(Money.franc(5), is(equalTo(Money.franc(5))));
    }

    @Test
    public void testCurrency() {
        assertThat(Money.dollar(1).currency(), is("USD"));
        assertThat(Money.franc(1).currency(), is("CHF"));
    }
}
