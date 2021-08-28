import static org.junit.jupiter.api.Assertions.*;


class SalesTest {
    @org.junit.jupiter.api.Test
    void sumSalesTest() {
        Sales service = new Sales();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;


        // вызываем целевой метод:
        long actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mediumSalesTest() {
        Sales service = new Sales();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;


        // вызываем целевой метод:
        long actual = service.mediumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void minSalestest() {
        Sales service = new Sales();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;


        // вызываем целевой метод:
        long actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSalesTest() {
        Sales service = new Sales();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;


        // вызываем целевой метод:
        long actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void underMediumTest() {
        Sales service = new Sales();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;


        // вызываем целевой метод:
        int actual = service.underMedium(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void moreMediumTest() {
        Sales service = new Sales();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;


        // вызываем целевой метод:
        int actual = service.moreMedium(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

