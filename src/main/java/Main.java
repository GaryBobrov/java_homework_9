import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sale = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
//        System.out.println(Arrays.toString(sale));

        long allSales = service.allSales(sale);
        System.out.println("Сумма всех продаж: " + allSales);

        double averageSales = service.averageSales(sale);
        System.out.println("Средняя сумма всех продаж: " + averageSales);

        int maxSales = service.maxSales(sale);
        System.out.println("Месяц в котором был максимум продаж: " + maxSales);

        int minSales = service.minSales(sale);
        System.out.println("Месяц в котором был минимум продаж: " + minSales);

        int numberMonthsBelowAverageSales = service.numberMonthsBelowAverageSales(sale);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + numberMonthsBelowAverageSales);

        int numberMonthsHigherAverageSales = service.numberMonthsHigherAverageSales(sale);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + numberMonthsHigherAverageSales);
    }
}
