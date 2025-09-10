import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 재료
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        int weight = 0;
        String gender = "";
        // Data 입력
        System.out.print("이름을 입력해주세요: ");
        name = scanner.nextLine();

        System.out.printf("%s 님의 나이를 입력해주세요: ", name);
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("%s 님의 성별을 입력해주세요: ", name);
        gender = scanner.nextLine();

        // 처리
        // 출력
        System.out.printf("%s 님, %d 살, %s\n", name, age, gender);
    }
}