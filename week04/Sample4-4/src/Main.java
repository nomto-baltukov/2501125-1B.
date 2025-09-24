import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int won = 0;
        float convert;
        float dollar = 0.0f;

        System.out.print("오늘의 dollar 환울은 ? ");
        convert = keyboard.nextFloat();

        System.out.print("원화 알마를 dollar 로 환전할까 ? ");
        won = keyboard.nextInt();

        dollar = won / convert;

        System.out.printf("총 dollar 수량: %s ", dollar);
    }
}