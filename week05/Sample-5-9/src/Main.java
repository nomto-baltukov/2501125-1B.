import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        char gender;
        float weight = 0f, weight1 = 0f;

        System.out.print("당신의 키 Meter 입력: ");
        height = keyboard.nextFloat();

        System.out.print("당신의 성별 (남 = M, 여 = F) 입력: ");
        gender = keyboard.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            weight = (height * 100 - 100) * 0.9f;
            System.out.printf("키가 %.1f m인 남자의 표준 체중은 %.2f Kg 입니다\n", height, weight);
        } else if (gender == 'F' || gender == 'f') {
            weight = (height * 100 - 100) * 0.85f;
            weight1 = (height * 100 - 100) * 0.9f;
            System.out.printf("키가 %.1f m인 여자의 표준 체중은 %.2f Kg 입니다\n", height, weight);
            System.out.printf("키가 %.1f m인 여자의 미용 체중은 %.2f Kg 입니다\n", height, weight1);
        } else {
            System.out.println("성별 입력이 올바르지 않습니다.");
        }

        keyboard.close();
    }
}
