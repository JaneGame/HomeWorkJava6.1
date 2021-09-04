public class Sales {
    int month = 0;
    int choiceMonth =0;

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long mediumSales(long[] sales) {
        Sales service = new Sales();
        long sum = service.sumSales(sales);
        long medium = sum / 12;
        return medium;
    }

    public int minSales(long[] sales) {
        for (long sale : sales) {

            if (sale <= sales[choiceMonth]) {
                choiceMonth = month;
            }
            month = month + 1;
        }
        return choiceMonth + 1;
    }

    public int maxSales(long[] sales) {
        for (long sale : sales) {

            if (sale >= sales[choiceMonth]) {
                choiceMonth = month;
            }
            month = month + 1;
        }
        return choiceMonth + 1;
    }


    public int underMedium(long[] sales) {
        Sales service = new Sales();
        long medium = service.mediumSales(sales);
        for (long sale : sales) {
            if (sale < medium) {
                choiceMonth += 1;
            }
        }
        return choiceMonth;
    }

    public int moreMedium(long[] sales) {
        Sales service = new Sales();
        long medium = service.mediumSales(sales);
        for (long sale : sales) {
            if (sale > medium) {
                choiceMonth += 1;
            }
        }
        return choiceMonth;
    }
}
