//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = a++ + 2;
        int d = ++b + 2;

        System.out.printf("a=%d, b=%d, c=%d, d=%d",a,b,c,d);
    }
}