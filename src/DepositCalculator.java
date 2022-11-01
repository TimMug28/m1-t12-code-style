import java.util.Scanner;


public class DepositCalculator  {

    public static void main (String[] args) {
        new DepositCalculator ().calculationOfDeposit();
    }

    double calculateComplexPercent (double a, int d) {
        double pay = a * Math.pow((1 + 0.06 / 12), 12 * d);

        return setRandom(pay);
    }

    double calculateSimplePercent (double doubleAmount, int depositPeriod) {
        return setRandom(doubleAmount + doubleAmount * 0.06 * depositPeriod);
    }

    double setRandom (double value) {
        double Scale = Math.pow (10, 2);

        return Math.round(value * Scale) / Scale;
    }

    void calculationOfDeposit () {
        int period;
        int action;
        int amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt( );
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double out = 0;

        if (action == 1) {
            out = calculateSimplePercent(amount, period);
        } else if (action == 2) {
            out = calculateComplexPercent(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }
}
