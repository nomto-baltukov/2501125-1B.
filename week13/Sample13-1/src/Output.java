public class Output {
    public static void display(String[] name, int[][] score) {
        System.out.println("\n=== 성적표 ===");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s: 국어=%d, 영어=%d, 수학=%d, 총점=%d\n",
                    name[i], score[i][0], score[i][1], score[i][2], score[i][3]);
        }
    }
}
