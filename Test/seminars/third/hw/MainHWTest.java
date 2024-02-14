package seminars.third.hw;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static seminars.third.hw.MainHW.evenOddNumber;
import static seminars.third.hw.MainHW.numberInInterval;

public class MainHWTest {

    @Test
    public void evenOddNumberTest() {
        assertTrue(evenOddNumber(2)); // Проверка ветви кода, если число четное
        assertFalse(evenOddNumber(1)); // Проверка ветви кода, если число нечетное
    }

    @Test
    public void numberInIntervalTest() {
        assertTrue(numberInInterval(50)); // Проверка ветви кода, если число принадлежит интервалу (25;100)
        assertFalse(numberInInterval(25)); // Проверка ветви кода, если число не принадлежит интервалу (25;100)
    }
}