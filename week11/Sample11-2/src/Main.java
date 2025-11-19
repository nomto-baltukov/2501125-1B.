import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[][] students = new String[][]{
                {"12345", "홍길동"},
                {"34567", "이혜인"},
                {"891011", "김명성"},
                {"214432", "경복대"},
                {"34256", "이대학"}
        };

        String[] subject = {"국어", "영어", "수학"};

        int[][] score = new int[students.length][4];  // 0~2: scores, 3: total
        float[] avg = new float[students.length];

        // 입력
        for (int i = 0; i < students.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s님의 %s 성적 입력: ",
                        students[i][1], subject[j]);
                int input = keyboard.nextInt();

                if (input >= 0 && input <= 100) {
                    score[i][j] = input;
                    j++;
                } else {
                    System.err.println("ERROR: 점수는 0 ~ 100 사이여야 합니다.");
                }
            }

            // 총점 계산
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
            avg[i] = score[i][3] / 3.0f;
        }

        // 출력
        System.out.println("\n================= 성적표 =================");
        System.out.printf("%-8s %-10s %6s %6s %6s %6s %8s\n",
                "학번", "이름", "국어", "영어", "수학", "총점", "평균");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-8s %-10s %6d %6d %6d %6d %8.2f\n",
                    students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2],
                    score[i][3], avg[i]);
        }

        System.out.println("=============================================");
    }
}
