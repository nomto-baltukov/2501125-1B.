import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int last, start;

        int sum = 0;



        while (true) {
            System.out.print("어디 부터 더할까요?");
            start = keyboard.nextInt();
            System.out.print("어디 까지 더할까요?");
            last = keyboard.nextInt();

            if(start >= last) {
                System.err.println("ERROR: start가 last 보다 작아야 함");
            } else {
                break;
            }
        }

        for (int i = start; i <= last; i++) {
            sum += i;
        }

        System.out.printf("%d + %d + ... + %d = %d\n", start, start + 1, last,  sum);
    }
}