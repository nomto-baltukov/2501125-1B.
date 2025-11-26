import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first, second;
        int result;
        first = readData("첫번째 데이터");
        second = readData("두번째 데이터");
        result = add(first, second);
        display(first, second, result);
    }
    private static void display(int first, int second, int result) {
        System.out.printf("%d + %d = %d", first, second, result);
    }
    private static int add(int first, int second) {
        int result;
        result = first + second;
        return result;
    }
    private static int readData(String msg) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.print(msg);
        temp = scanner.nextInt();

        return temp;
    }
}