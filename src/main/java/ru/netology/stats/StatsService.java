package ru.netology.stats;

public class StatsService {

    //    Сумма всех продаж
    public long allSales(long[] sale) {
        long sum = 0;

        for (int i = 0; i < sale.length; i++) {
            sum += sale[i];

        }
        return sum;
    }

    //    Средняя сумма всех продаж
    public double averageSales(long[] sale) {
        double averageSum = allSales(sale);

        return averageSum / sale.length;
    }

    //    Месяц в котором был максимум продаж
    public int maxSales(long[] sale) {
        int maxMonth = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    //    Месяц в котором был минимум продаж
    public int minSales(long[] sale) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //    Количество месяцев, в которых продажи были ниже среднего
    public int numberMonthsBelowAverageSales(long[] sale) {
        int counter = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSales(sale)) {
                counter++;
            }
        }
        return counter;
    }

    //    Количество месяцев, в которых продажи были выше среднего
    public int numberMonthsHigherAverageSales(long[] sale) {
        int counter = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSales(sale)) {
                counter++;
            }
        }
        return counter;
    }
}
