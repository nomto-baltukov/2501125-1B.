//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temp;
        double result;

        temp = new Input.readData();
        result = new Compute.convert(temp);
        Ouput.display(temp, result);
    }
}