import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        double s, area;
        String result;

        System.out.print("삼각형 세 변의 길이 (정수) 입력 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 삼각형 성립 조건 확인
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            // 헤론의 공식 사용
            s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format("삼각형이 성립합니다. 넓이 = %.2f", area);
        } else {
            result = "삼각형이 성립하지 않습니다.";
        }

        System.out.println(result);
        keyboard.close();
    }
}
