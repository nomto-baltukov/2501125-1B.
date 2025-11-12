import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int LENGTH = 6;
        int[] lotto = new int[LENGTH];
        int i = 0;
        boolean flag;

        while (i < lotto.length) {
            flag = false;
            lotto[i] = random.nextInt(45) + 1; // 1~45

            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    System.err.println("중복 발생: " + lotto[i]);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                i++; // 중복이 없으면 다음 인덱스로
            }
        }

        // 결과 출력
        System.out.print("로또 번호: ");
        for (int n : lotto) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
