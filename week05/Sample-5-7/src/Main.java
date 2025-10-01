import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char type = ' ';
        int width = 0;
        int height = 0;
        int area = 0;

        System.out.print("사각형 타입 입력 (예: R, S 등): ");
        type = keyboard.next().charAt(0);  // read a single char

        System.out.print("사각형의 가로 길이 입력 (Cm): ");
        width = keyboard.nextInt();

        System.out.print("사각형의 세로 길이 입력 (Cm): ");
        height = keyboard.nextInt();

        area = width * height;

        System.out.printf("**** %c 사각형 넓이 ***** \n", type);
        System.out.printf("\t 가로 길이 : %,d Cm\n", width);
        System.out.printf("\t 세로 길이 : %,d Cm \n", height);
        System.out.printf("\t 넓이 : %,d \u33a0\n", area);

        keyboard.close();
    }
}
