import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String text;
        StringBuilder result = new StringBuilder();

        System.out.print("영어 문장 입력: ");
        text = keyboard.nextLine();

        // 영어 알파벳만 추출
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result.append(c);
            }
        }

        System.out.printf("원문 : %s\n", text);
        System.out.printf("영문자만 : %s\n", result.toString());
    }
}
