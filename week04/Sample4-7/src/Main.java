import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float height, weight; // 키(cm), 몸무게(kg)
        float feet, pound;    // 변환된 키(ft), 몸무게(lb)

        final float FEETUNIT = 30.48f;     // 1피트 = 30.48cm
        final float POUNDUNIT = 0.453592f; // 1파운드 = 0.453592kg

        System.out.print("당신의 키 입력 (cm) : ");
        height = keyboard.nextFloat(); // 키 입력 받기

        System.out.print("당신의 몸무게 입력 (kg) : ");
        weight = keyboard.nextFloat(); // 몸무게 입력 받기

        // cm → ft 변환
        feet = height / FEETUNIT;

        // kg → lb 변환
        pound = weight / POUNDUNIT;

        // 결과 출력
        System.out.printf("당신의 키는 %.2f cm (%.2f ft) 이고,\n", height, feet);
        System.out.printf("당신의 몸무게는 %.2f kg (%.2f lb) 입니다.\n", weight, pound);
    }
}
