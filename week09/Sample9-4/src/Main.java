import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int num;
        final int COUNT = 10;

        int count = 0;
        while (count < COUNT) {
            System.out.print("양의 정수 입력: ");
            num = keyboard.nextInt();

            if (num < 0) {
                System.out.println("ERROR: 양의 정수 입력");
                System.in.read(); // ← 굳이 필요하지 않음 (입력 버퍼와 관련 문제 유발 가능)
            } else {
                sum += num;
                count++;
            }
        }

        double avg = (double) sum / COUNT;

        System.out.printf("합계 = %,d \n", sum);
        System.out.printf("평균: %.2f\n", avg);
    }
}
