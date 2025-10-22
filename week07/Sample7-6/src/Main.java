import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int result = 0; // 초기화

        System.out.print("정수 입력 (1~9999): ");
        num = keyboard.nextInt();

        // 입력값 범위 확인
        if (!(num >= 1 && num < 10000)) {
            System.err.println("ERROR: 입력 범위는 1~9999 입니다.");
            keyboard.close();
            return; // 잘못된 입력 시 종료
        }

        // 자릿수별 10의 보수 계산
        if (num >= 1000) {
            result = 9999 - num + 1;
        } else if (num >= 100) {
            result = 999 - num + 1;
        } else if (num >= 10) {
            result = 99 - num + 1;
        } else {
            result = 9 - num + 1;
        }

        // 결과 출력
        System.out.printf("입력한 정수 %,d의 10의 보수는 %,d입니다.\n", num, result);
    }
}
