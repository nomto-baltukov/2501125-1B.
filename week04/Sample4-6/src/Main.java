import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base;
        int height;
        float area;

        System.out.print("삼각형의 밑변 길이 입력 : ");
        base = keyboard.nextInt();

        System.out.print("삼각형의 높이 입력 : ");
        height = keyboard.nextInt();

        // 삼각형의 넓이 계산: 넓이 = 0.5 * 밑변 * 높이
        area = 0.5f * base * height;

        System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이는 %.2f 입니다.\n", base, height, area);
    }
}
