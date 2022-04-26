package ru.netology.service;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void remain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void remain1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }
}