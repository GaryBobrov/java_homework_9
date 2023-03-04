package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();

        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expectedDay = 180;
        long actualDay = service.allSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        double expectedDay = 15;
        double actualDay = service.averageSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedDay = 9;
        int actualDay = service.minSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedDay = 8;
        int actualDay = service.maxSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedDay = 5;
        int actualDay = service.numberMonthsBelowAverageSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindHigherAverageSales() {
        StatsService service = new StatsService();

        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedDay = 5;
        int actualDay = service.numberMonthsHigherAverageSales(sale);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}