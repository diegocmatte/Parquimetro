/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import parquimetro.Parquimetro;

/**
 *
 * @author 08104810
 */
public class ParquimetroTest {

    public ParquimetroTest() {
    }
    private Parquimetro parq;

    @Before
    public void setUp() throws Exception {
        parq = new Parquimetro();
        parq.insereMoeda(100);
    }

    @Test
    public void testInsereMoeda() {
        parq.insereMoeda(1);
        parq.insereMoeda(5);
        parq.insereMoeda(10);
        parq.insereMoeda(25);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        assertEquals(291, parq.getSaldo());
    }

    @Test
    public void testGetSaldo() {
        int actual = parq.getSaldo();
        assertEquals(100, actual);
    }

    @Test
    public void testEmiteTicket() {
        parq.insereMoeda(50);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        boolean actual = parq.emiteTicket();
        assertEquals(true, actual);
    }

    @Test
    public void testDevolve() {
        parq.insereMoeda(50);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        parq.emiteTicket();
        int actual = parq.devolve();
        assertEquals(100, actual);
    }
}
