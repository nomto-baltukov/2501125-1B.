//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int KOREA = 99720;
        final int NorthKorea = 122762;
        final int USA = 9631418;
        final int JAPAN = 434343;

        float temp1 = (float) NorthKorea / KOREA;
        float temp2 = (float) USA / KOREA;
        float temp3 = (float) JAPAN / KOREA;

        System.out.println("대한민국의 크기를 기준으로 했을 때:");
        System.out.printf("북한은 대한민국의 %.2f배 크기입니다.\n", temp1);
        System.out.printf("미국은 대한민국의 %.2f배 크기입니다.\n", temp2);
        System.out.printf("일본은 대한민국의 %.2f배 크기입니다.\n", temp3);
    }
}
