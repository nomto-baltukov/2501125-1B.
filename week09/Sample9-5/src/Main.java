import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int kor, eng, math;

        System.out.print("당신의 이름 입력: ");
        name = keyboard.nextLine();

        while (true) {
            System.out.print("국어 성적 입력: ");
            kor = keyboard.nextInt();
            System.out.print("영어 성적 입력: ");
            eng = keyboard.nextInt();
            System.out.print("수학 성적 입력: ");
            math = keyboard.nextInt();

            if ((kor >= 0 && kor <= 100) &&
                    (eng >= 0 && eng <= 100) &&
                    (math >= 0 && math <= 100)) {
                break;
            } else {
                System.out.println("ERROR: 성적은 0~100 사이여야 합니다. 다시 입력하세요.");
            }
        }

        System.out.println("-----------------------");
        System.out.printf("%s님의 성적 결과\n", name);
        System.out.printf("국어: %d\n영어: %d\n수학: %d\n", kor, eng, math);
        double avg = (kor + eng + math) / 3.0;
        System.out.printf("평균: %.2f\n", avg);

    }
}
