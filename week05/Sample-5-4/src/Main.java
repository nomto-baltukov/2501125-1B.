//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int a = 5 > 3 ? 6 : 7;
       System.out.printf("a = %d=a\n", a);
       int b = 2 > 3 ? a++ : a--; // b = 6, a = 5
       System.out.printf("a = %d, b = &");

       int c = b > a ? ++b - 1 : a++ + 1; // a = 5, b =7. c =6
        System.out.printf("a = %d, b  = %d, c =%d", a,b,c);

        // c = (b > a) && (a++ > 3) ? ++b - 1 : a++ +1;
        System.out.printf("a = %d, b  = %d, c =%d", a,b,c);
    }
}