import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;

        System.out.println("리터 수량 입력 ");
        litter = keyboard.nextFloat();

        System.out.println("운행한 거리 입력 ");
        km = keyboard.nextFloat();


        System.out.printf("자동차 서비된 연료 : %.1f Litter \n", litter);
        System.out.printf("자동차 운행 거리 : %.1f Km\n", km);
        System.out.printf("연비: %.2f\n", result);
    }
}