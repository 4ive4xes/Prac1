import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Практическое задание №1. Вариант 2. Студент Субботин Дмитрий Вячеславович. Группа РИБО-05-21");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество месяцев: ");
        final int time = scanner.nextInt();
        System.out.print("Введите годовой процент: ");
        final double percent = scanner.nextInt();
        System.out.print("Введите сумму, которую хотите внести во вклад: ");
        double userSum = scanner.nextInt();

        for (int month = 0; month < time; month++){
            double userProfit = userSum * (percent / 100) / 365 * 30;
            userSum += userProfit;
            System.out.printf("Прибыль за %d месяц: %.2f рублей. Итоговая сумма на данный месяц = %.2f рублей\n", month+1, userProfit, userSum);
        }

        System.out.printf("Итоговая сумма вклада за %d месяцев равна %.2f рублей", time, userSum);
    }

}
