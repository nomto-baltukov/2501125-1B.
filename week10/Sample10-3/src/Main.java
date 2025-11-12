import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] name = {"홍길동", "이재명", "운석열", "경복대", "오세훈"};
        float[] weight = new float[name.length];
        final float MIN = 30.0f;
        final float MAX = 120.0f;

        // 1️⃣ Ввод весов
        for (int i = 0; i < weight.length; i++) {
            while (true) {
                System.out.printf("%s님의 몸무게 입력 (%.1f ~ %.1f): ", name[i], MIN, MAX);
                weight[i] = keyboard.nextFloat();

                if (weight[i] >= MIN && weight[i] <= MAX) {
                    break;
                } else {
                    System.err.println("⚠️ 오류: 몸무게는 30.0 ~ 120.0 사이여야 합니다.");
                }
            }
        }

        // 2️⃣ Сортировка по весу (пузырьковая сортировка)
        for (int j = 0; j < weight.length - 1; j++) {
            for (int k = 0; k < weight.length - 1 - j; k++) {
                if (weight[k] > weight[k + 1]) {
                    float tempWeight = weight[k];
                    weight[k] = weight[k + 1];
                    weight[k + 1] = tempWeight;

                    String tempName = name[k];
                    name[k] = name[k + 1];
                    name[k + 1] = tempName;
                }
            }
        }

        System.out.println("\n=== 몸무게 순 정렬 결과 ===");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s : %.1f kg\n", name[i], weight[i]);
        }
    }
}
