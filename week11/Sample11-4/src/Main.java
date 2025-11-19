import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[][] employees = new String[][]{
                {"12345", "홍길동"},
                {"34567", "이혜인"},
                {"891011", "김명성"},
                {"214432", "경복대"},
                {"34256", "이대학"},
                {"45256", "파트마"},
                {"46256", "제이납"},
                {"49256", "밀리나"},
        };

        int hobong[] = {1,4,5,3,2,1,3,4,3,2};

        // salarys[i][0..3] = 분기별 급여, salarys[i][4] = 합계
        int[][] salarys = new int[employees.length][5];
        float[] avg = new float[employees.length];

        String[] quarter = {"1분기", "2분기", "3분기", "4분기"};

        // 급여 입력
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%s님 (사번 %s) 급여 입력:\n", employees[i][1], employees[i][0]);
            for (int j = 0; j < 4; j++) {
                while (true) {
                    System.out.printf("%s: ", quarter[j]);
                    int input = keyboard.nextInt();
                    if (input >= 0) {
                        salarys[i][j] = input;
                        salarys[i][4] += input; // 합계
                        break;
                    } else {
                        System.err.println("ERROR: 0 이상의 숫자를 입력하세요.");
                    }
                }
            }
            avg[i] = salarys[i][4] / 4.0f; // 평균
            System.out.println();
        }

        // 테이블 출력
        System.out.println("==============================================");
        System.out.println("사번\t이름\t1분기\t2분기\t3분기\t4분기\t합계\t평균");
        System.out.println("==============================================");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
                    employees[i][0], employees[i][1],
                    salarys[i][0], salarys[i][1], salarys[i][2], salarys[i][3],
                    salarys[i][4], avg[i]);
        }

    }
}
