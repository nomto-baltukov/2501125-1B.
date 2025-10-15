public class Main {
    public static void main(String[] args) {
        final float YEAR = 365.2422f;
        int day;
        int hour;
        int minute;
        int second;

        float temp;

        day = (int) YEAR;
        temp = YEAR - day;

        hour = (int) (temp * 24);
        temp = (temp * 24) - hour;

        minute = (int) (temp * 60);
        temp = (temp * 60) - minute;

        second = (int) (temp * 60 + 0.5);

        System.out.printf("Year: %d days, %d hours, %d minutes, %d seconds\n", day, hour, minute, second);
    }
}
