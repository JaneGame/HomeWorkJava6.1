public class Sales {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long mediumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long medium = sum / 12;
        return medium;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int underMedium(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long medium = sum / 12;
        int underMedium = 0;
        for (long sale : sales) {
            if (sale < medium) {
                underMedium += 1;
            }
        }
        return underMedium;
    }

    public int moreMedium(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long medium = sum / 12;
        int moreMedium = 0;
        for (long sale : sales) {
            if (sale > medium) {
                moreMedium += 1;
            }
        }
        return moreMedium;
    }
}
