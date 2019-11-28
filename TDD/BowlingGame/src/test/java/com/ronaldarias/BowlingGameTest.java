package com.ronaldarias;

import com.ronaldarias.BowlingGame.BowlingGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    /**
     * Test para probar si todos los lanzamientos se van por la canaleta
     */
    @Test
    public void testGutterGame() {
        rollMany(20, 0);

        Assert.assertEquals(0, bowlingGame.score());
    }

    /**
     * Test para probar si todos los lanzamientos son acertados
     */
    @Test
    public void testAllOnes() {
        rollMany(20, 1);

        Assert.assertEquals(20, bowlingGame.score());
    }

    /**
     * Test para probar si hace un spare (10 pines en 2 turnos)
     * Spare suma 10 en dos turnos mas el puntaje del siguiente turno
     */
    @Test
    public void testOneSpare() {
        //primeros 2 lanzamientos que hacen 10 para el spare
        rollSpare();

        //siguiente lanzamiento por el spare
        bowlingGame.role(3);

        //17 lanzamientos restantes en 0
        rollMany(17, 0);

        //para que pase deberia ser 16 = ((10 + 3) + 3)
        Assert.assertEquals(16, bowlingGame.score());
    }

    /**
     * Test para probar si se hace un strike (10 pines en 1 turno)
     * Strike sume 10 en un turno mas el puntaje de los siguientes 2 turnos
     */
    @Test
    public void testOneStrike() {
        rollStrike();
        bowlingGame.role(3);
        bowlingGame.role(4);
        rollMany(16, 0);

        //para que pase deberia ser 24 = ((10 + 3 + 4) + 3 + 4)
        Assert.assertEquals(24, bowlingGame.score());
    }

    /**
     * Test para realizar un puntaje total de 300
     */
    @Test
    public void testPerfectGame() {
        rollMany(12, 10);

        //para que pase deberia ser 300
        Assert.assertEquals(300, bowlingGame.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            bowlingGame.role(pins);
        }
    }

    private void rollSpare() {
        bowlingGame.role(5);
        bowlingGame.role(5);
    }

    private void rollStrike() {
        bowlingGame.role(10);
    }
}
