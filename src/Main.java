import java.time.Year;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;

        while (total <= 2459000) {
            month++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthPer1000 = 17;
        int mortalityPer1000 = 8;

        for (int year = 0; year <= 10; year++) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population = population + population / 1000 * (birthPer1000 - mortalityPer1000);
        }
        System.out.println();

        System.out.println("Задача 4");
        int sum = 15000;
        double percentage = 0.07;
        int target = 12_000_000;
        double increment = 0;
        int months = 0;

        for (int j = 0; sum < target; j++) {
            sum += increment;
            increment = sum * percentage;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + sum + " рублей");
            months = j;
        }
        System.out.println("Василию потребуется " + months + " месяцев для накопления " + target + " рублей");
        System.out.println();

        System.out.println("Задача 5");
        int sumEx5 = 15000;
        double percentageEx5 = 0.07;
        int targetEx5 = 12_000_000;
        double incrementEx5 = 0;

        for (int j = 1; sumEx5 < targetEx5; j++) {
            incrementEx5 = sumEx5 * percentageEx5;
            sumEx5 += incrementEx5;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + sumEx5 + " рублей");
            }
        }
        System.out.println();

        System.out.println("Задача 6");
        int sumEx6 = 15000;
        double percentageEx6 = 0.07;
        int period = 9;
        double incrementEx6 = 0;

        for (int j = 1; j <= (period * 12); j++) {
            incrementEx6 = sumEx6 * percentageEx6;
            sumEx6 += incrementEx6;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + sumEx6 + " рублей");
            }
        }
        System.out.println();


        System.out.println("Задача 7");
        int firstFriday = 4;

        for (int j = firstFriday; j <= 31; j++) {
            if ((j - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + j + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();

        System.out.println("Задача 8");
        int yearStart = Year.now().getValue() - 200;
        int yearEnd = Year.now().getValue() + 100;

        for (int j = yearStart; j <= yearEnd; j++) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }
    }
}