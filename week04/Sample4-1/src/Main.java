//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = a++ + 2;
        int d = ++b + 2;

        float e = (float) (5.0f / 4);

        a += 4; // a = a + 4

        System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%.2f\n",a,b,c,d,e);
    }
}
