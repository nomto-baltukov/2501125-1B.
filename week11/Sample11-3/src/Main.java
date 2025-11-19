public class Main {
    public static void main(String[] args) {
        int[][] sales = {
                {2010, 11230, 12345, 21495, 21543, 0},
                {2011, 14500, 12300, 16700, 18900, 0},
                {2012, 13400, 15800, 12000, 11000, 0}
        };

        float[] avg = new float[sales.length];

        // 합계 계산
        for (int i = 0; i < sales.length; i++) {
            for (int j = 1; j < sales[i].length - 1; j++) { // j++
                sales[i][sales[i].length - 1] += sales[i][j];
            }
            // 평균 계산
            avg[i] = sales[i][sales[i].length - 1] / 4.0f;
        }

        // 테이블 출력

        System.out.println("***************************************");
        System.out.println("년도\t1분기\t2분기\t3분기\t4분기\t합계\t평균");
        System.out.println("***************************************");

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
                    sales[i][0], sales[i][1], sales[i][2], sales[i][3], sales[i][4],
                    sales[i][5], avg[i]);
        }

    }
}
