import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int degree;
        float result;

        System.out.print("섭씨 온도 입력: "); // Небольшая правка в тексте
        degree = keyboard.nextInt();

        result = degree * (9.0f / 5) + 32;

        System.out.printf("섭씨 %d도는 화씨 %.2f도입니다.\n", degree, result);
    }
}
