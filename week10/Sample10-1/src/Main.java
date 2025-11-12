import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int[] scores = new int[5];
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};

        int i = 0;
        while (true) {
            System.out.printf("%s 님의 JAVA 성적 입력: ", name[i]);
            scores[i] = keyboard.nextInt();

            if (scores[i] >= 0 && scores[i] <= 100) {
                i++;
                if (i >= name.length)
                    break;
            } else {
                System.err.println("Error : 0 ~ 100 사이");
                System.in.read();
            }
        }

        for (i = 0; i < scores.length; i++) {
            System.out.printf("%d 학생 = %3d 점\n", i + 1, scores[i]);
        }
    }
}
