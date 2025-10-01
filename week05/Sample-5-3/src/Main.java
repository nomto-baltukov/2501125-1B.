//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean test = ((('a' + 1) > 'A') && ('A' > 'B'));
        boolean test1 = ((('a' + 1) > 'A') || ('A' > 'B'));

        int a = 5;

        boolean test2 = ((5 > 3) && ((a++) != 0)); // true && true a = 6
        boolean test3 = ((2 > 3) && ((++a) != 0)); // true && true a = 6

        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b\n", test2);
        System.out.printf("printf %b \n", test3, a);




    }
}