//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] name = {"홍길동", "김철수", "이영희"};   // пример имён студентов

        int[][] score = Input.inputData(name);

        Compute.process(score);
        Output.display(name, score);
    }
}
