package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    //Негативное внесение средств -1
    @Test
    public void startBorderMinusOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = -1;

        int expected = -1;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    //Внесение средств 0
    @Test
    public void startBorderNull() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    //Внесение средств 1
    @Test
    public void startBorderOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int excpected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, excpected);
    }

    //Внесение средств 400
    @Test
    public void averageValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 400;

        int excpected = 600;
        int actual = service.remain(amount);
        assertEquals(actual, excpected);
    }

    //Внесение средств 999
    @Test
    public void endBorderNineNineNine() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int excpected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, excpected);
    }

    //Внесение средств 1000
    @Test
    public void endBorderThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int excpected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, excpected);
    }

    //Внесение средств 1001
    @Test
    public void endBorderThousandOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int excpected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, excpected);
    }

    //Внесение средств 4001
    @Test
    public void endBorderForThousandOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 4001;

        int excpected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, excpected);
    }
}