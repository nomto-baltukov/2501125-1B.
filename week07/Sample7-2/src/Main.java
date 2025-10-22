import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("장수 입력: ");
        num = keyboard.nextInt();

        // 조건 연산자 사용
        result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("%d는 %s입니다.\n", num, result);

        // if문으로 같은 기능 구현
        if (num % 2 == 0) {
            System.out.println("if문 판단: 짝수입니다.");
        } else {
            System.out.println("if문 판단: 홀수입니다.");
        }
    }
}
