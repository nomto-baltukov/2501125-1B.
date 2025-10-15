import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIGA = 7; // 1 cigarette = 7 minutes of life lost

        int gapi;   // cigarettes per day
        int year;   // years of smoking
        int result; // total minutes lost
        int hour;
        int day;

        System.out.print("당신은 하루에 몇 개피를 피우나요? ");
        gapi = keyboard.nextInt();

        System.out.print("몇 년 동안 피웠나요? ");
        year = keyboard.nextInt();

        result = gapi * year * 365 * CIGA; // total minutes lost
        hour = result / 60;
        day = hour / 24;

        System.out.printf("총 %.1f 일의 수명이 단축되었습니다.\n", (double) day);
    }
}
