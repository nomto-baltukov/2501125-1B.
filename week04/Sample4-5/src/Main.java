import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int salary,expenses;  // Data
    int  save, remain, money;// 정보
    float saveRate; // 저축 비율 (Data);

    System.out.print("단싱의 급여액 입력 : ");
    salary = keyboard.nextInt();
    System.out.print("월 저축 비율 (예 20% -> 0.2) : ");
    saveRate = keyboard.nextFloat();
    System.out.print("월 기본 지출 비용 입력 : ");
    expenses = keyboard.nextInt();

    save = (int) (saveRate * salary);
    remain = salary - (save + expenses);
    money = remain / 30;

    System.out.println();

    }
}