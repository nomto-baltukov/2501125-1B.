//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int ONE_HOUR = 60 * 60;
        final int METERS_IN_KM = 1000;
        final int TURTLE = (35 * METERS_IN_KM) / ONE_HOUR;
        final int RABBIT = (60 * METERS_IN_KM) / ONE_HOUR;

        int turtle = 450;
        int rabbit = 0;

        int i = 1;
        for (; true; i++) {
            turtle += TURTLE;
            rabbit += RABBIT;
            if(rabbit > turtle)
                break;
            System.out.printf("%d초후 토끼: %,d m, 거북이 : % d m \n", i, rabbit, turtle);
        }
    }
}