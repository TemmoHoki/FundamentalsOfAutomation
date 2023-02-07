package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

import javax.swing.border.Border;

public class CashbackHackServiceTest {


    //JUnit4
    //Негативное внесение средств -1
    @Test
    public void junit4StartBorderMinusOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = -1;

        int actual = service.remain(amount);
        int expected = 0;
    }

    //Внесение средств 0
    @Test
    public void junit4StartBorderNull() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 0;
    }

    //Внесение средств 1
    @Test
    public void junit4StartBorderOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int excpected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 400
    @Test
    public void junit4AverageValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 400;

        int excpected = 600;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 999
    @Test
    public void junit4EndBorderNineNineNine() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int excpected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 1000
    @Test
    public void junit4EndBorderThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int excpected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 1001
    @Test
    public void junit4EndBorderThousandOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int excpected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 4001
    @Test
    public void junit4EndBorderForThousandOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 4001;

        int excpected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }


    //JUnit Jupiter
    //Негативное внесение средств -1
    @org.junit.jupiter.api.Test
    public void jupiterStartBorderMinusOne() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertThrows(NotFoundException.class, () -> service.remain(-1));
    }

    //Внесение средств 0
    @org.junit.jupiter.api.Test
    public void jupiterStartBorderNull() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertThrows(NotFoundException.class, () -> service.remain(0));
    }

    //Внесение средств 1
    @org.junit.jupiter.api.Test
    public void jupiterStartBorderOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int excpected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 400
    @org.junit.jupiter.api.Test
    public void jupiterAverageValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 400;

        int excpected = 600;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 999
    @org.junit.jupiter.api.Test
    public void jupiterEndBorderNineNineNine() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int excpected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 1000
    @org.junit.jupiter.api.Test
    public void jupiterEndBorderThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int excpected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 1001
    @org.junit.jupiter.api.Test
    public void jupiterEndBorderThousandOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int excpected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

    //Внесение средств 4001
    @org.junit.jupiter.api.Test
    public void jupiterEndBorderForThousandOne() {
        CashbackHackService service = new CashbackHackService();

        int amount = 4001;

        int excpected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, excpected);
    }

}