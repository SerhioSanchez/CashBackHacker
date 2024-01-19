package ru.netology.CashBackHacker;

import org.testng.annotations.Test;
import ru.netology.ru.netology.CashBackHacker.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThanThousand() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void testRemainOverThanThousand() {
        int amount = 1200;
        int expected = 800;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainThousand() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}