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
        assertThat(new Dollar(10), is(five.times(2)));
        assertThat(new Dollar(15), is(five.times(3)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertThat(new Franc(10), is(five.times(2)));
        assertThat(new Franc(15), is(five.times(3)));
    }

    @Test
    public void testEquality() {
        assertThat(new Dollar(5), is(equalTo(new Dollar(5))));
        assertThat(new Dollar(5), is(not(equalTo(new Dollar(6)))));
        assertThat(new Franc(5), is(equalTo(new Franc(5))));
        assertThat(new Franc(5), is(not(equalTo(new Franc(6)))));
        assertThat(new Franc(5), is(not(equalTo(new Dollar(5)))));
    }
}
