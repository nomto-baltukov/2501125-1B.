import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours;       // 근무 시간
        int salary;      // 총 급여
        int basePay = 11500; // 시급
        int extraPay = 0;    // 초과 근무 수당

        System.out.print("주당 근무 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours <= 40) {
            // 40시간 이하: 기본급만
            salary = basePay * hours;
        } else {
            // 40시간 초과: 1.5배 수당
            extraPay = (int) (basePay * 1.5 * (hours - 40));
            salary = (basePay * 40) + extraPay;
        }

        System.out.printf("주당 근무 시간: %d시간\n", hours);
        System.out.printf("기본 시급: %,d원\n", basePay);
        System.out.printf("총 급여: %,d원\n", salary);

    }
}
