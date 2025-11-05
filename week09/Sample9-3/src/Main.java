public class Main {
    public static void main(String[] args) {
        for (int j = 1; j < 3; j++) { // два сета
            System.out.printf("Set: %d\n", j);
            int i = 1;

            do {
                System.out.printf("팔굽혀폐기 %d\n", i);
                i++;
            } while (i <= 10);
        }
    }
}
