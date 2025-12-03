import java.io.IOException;
import java.util.Scanner;

public class Input {

    public static int[][] inputData(String[] name) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[][] data = new int[name.length][4];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < name.length; i++) {
            System.out.printf("\n--- %s님의 성적 입력 ---\n", name[i]);

            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.printf("%s 점수: ", subject[j]);

                    if (!scanner.hasNextInt()) {
                        System.out.println("ERROR: 숫자를 입력하세요.");
                        scanner.nextLine();
                        continue;
                    }

                    int score = scanner.nextInt();

                    if (score >= 0 && score <= 100) {
                        data[i][j] = score;
                        break;
                    } else {
                        System.out.println("ERROR: 0~100 사이로 입력하세요.");
                    }
                }
            }

            // 총점 계산
            data[i][3] = data[i][0] + data[i][1] + data[i][2];
        }

        return data;
    }
}
