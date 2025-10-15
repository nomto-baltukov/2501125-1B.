public class Main {
    public static void main(String[] args) {

        final float PI = 3.14159f;

        final int RADIUS = 6378137;
        final int KOREA = 99720;

        long surface;
        double temp;
        double result;

        temp = 4 * PI * RADIUS * RADIUS;

        surface = (long) (temp / 1000000);

        result = (double) KOREA / surface * 100;

        // Output results
        System.out.printf("지구의 반지름은 %,d m 입니다.\n", RADIUS);
        System.out.printf("지구의 표면적은 %,d ㎢ 입니다.\n", surface);
        System.out.printf("대한민국의 넓이는 %,d ㎢ 입니다.\n", KOREA);
        System.out.printf("대한민국은 지구 표면의 약 %.8f%% 를 차지합니다.\n", result);
    }
}
