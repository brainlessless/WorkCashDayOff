import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Количество рабочих дней : ");
       int workDays = scanner.nextInt();
        System.out.print("Количество выходов в выходной : ");
        int dayOffWork = scanner.nextInt();
        int dayCash = 60000 / workDays;
        double dayOffCash = (dayCash * 1.25) * dayOffWork;
        System.out.println("В этом месяце вы дополнительно заработаете " + dayOffCash + " рублей");

    }
}