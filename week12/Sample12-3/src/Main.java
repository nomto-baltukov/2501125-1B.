import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius;
        while(true){
            System.out.print("원의 반지름 입력");
            radius = keyboard.nextInt();
            if(radius <= 0) {
                System.err.println("ERROR: 음수");
            }
        }

    }
}