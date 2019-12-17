import BowlingGame.BowlingGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void zeroPins() {
        rollMany(20, 0);
        Assert.assertEquals(0, bowlingGame.score());
    }

    @Test
    public void onePins() {
        rollMany(20, 1);
        Assert.assertEquals(20, bowlingGame.score());
    }

    public void rollMany(int times, int pins) {
        for (int i = 0; i < times; i++) {
            bowlingGame.roll(pins);
        }
    }
}
