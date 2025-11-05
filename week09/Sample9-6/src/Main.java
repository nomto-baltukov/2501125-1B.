import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int num;


        for(; true; ) {
            System.out.println("양의 정수 입력");
            num = keyboard.nextInt();

            if (num > 0) {
                break;
            } else {
                System.err.println("ERROR: 양의 정수 입력");
                System.in.read();
            }
        }

        int total = 0;
        int count = 0;


        while (num != 0) {
            int result = num % 10;
            total += result;
            count++;
            num /= 10;
        }

        System.out.printf("총합: %d, 자릿수: %d\n", total, count);
    }
}
