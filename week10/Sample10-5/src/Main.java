import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] name = {"홍길동", "이재명", "운석열", "경복대", "오세훈", "강민성", "김진성", "니키타", "김정은", "김시온"};
        String[] hakbun = {"1501002", "2501004", "2501005", "2501014", "2501024", "2502495", "2501013", "2501023", "1503035", "2503024"};

        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] total = new int[name.length];
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s 학생의 국어 성적 입력: ", name[i]);
            kor[i] = keyboard.nextInt();

            System.out.printf("%s 학생의 영어 성적 입력: ", name[i]);
            eng[i] = keyboard.nextInt();

            System.out.printf("%s 학생의 수학 성적 입력: ", name[i]);
            math[i] = keyboard.nextInt();

            if ((kor[i] < 0 || kor[i] > 100) ||
                    (eng[i] < 0 || eng[i] > 100) ||
                    (math[i] < 0 || math[i] > 100)) {
                System.err.println("⚠️ 성적은 0~100 사이만 입력 가능합니다!");
                i--;
                continue;
            }

            total[i] = kor[i] + eng[i] + math[i];
            avg[i] = total[i] / 3.0f;
        }

        for (int i = 0; i < name.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < name.length; j++) {
                if (total[i] < total[j]) {
                    rank[i]++;
                }
            }
        }

        System.out.println("\n==================== 성적표 ====================");
        System.out.printf("%-10s %-10s %-5s %-5s %-5s %-7s %-7s\n",
                "학번", "이름", "국어", "영어", "수학", "총점", "평균");

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%-10s %-10s %5d %5d %5d %7d %7.2f (%d등)\n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], total[i], avg[i], rank[i]);
        }

        System.out.println("===============================================");
    }
}
