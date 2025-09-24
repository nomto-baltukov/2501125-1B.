public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int c = 5 % 2; // 1
        int d = -5 % 2; // -1
        int e = -5 % - 2; // -1
        int f = 5 % -2; // 1

        System.out.printf("c=%d, d =%d, e=%d, f=%d",c,d,e,f);
    }
}