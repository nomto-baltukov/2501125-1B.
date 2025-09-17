public class Main {
    public static void main(String[] args) {
        byte test1 = 127;
        byte test2 = 45;
        byte result = (byte) (test1 + test2);

        short test3 = 127;
        short test4 = 45;

        short result2 = (short) (test3 + test4);
//        result2 = 3.0 + 4.5;


        System.out.printf("%d, + %d = %d\n", test1, test2, result);
    }
}