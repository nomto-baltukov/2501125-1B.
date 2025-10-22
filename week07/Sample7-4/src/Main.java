import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("정수 입력: ");
        num = keyboard.nextInt();

        // 조건 연산자 사용
        result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("조건연산자 결과 → %d는 %s입니다.\n", num, result);

        // if문 사용
        if (num % 2 == 0) {
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.printf("if문 결과 → %d는 %s입니다.\n", num, result);

        // switch문 사용 (결과에 따라 다른 문장 출력)
        switch (result) {
            case "짝수":
                System.out.println("switch 판단: 입력한 수는 짝수입니다.");
                break;
            case "홀수":
                System.out.println("switch 판단: 입력한 수는 홀수입니다.");
                break;
            default:
                System.out.println("switch 판단 불가: 잘못된 값입니다.");
                break;
        }

    }
}
