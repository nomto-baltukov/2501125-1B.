public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String apple = "부사";
       int count = 4;
       String name = "홍길동";
       double height = 170.5;

       System.out.printf("사과의 종료는 %s이고 개수는 %d 입니다. \n", apple, count);
       System.out.printf("%s의 키는 %5.1f %c Cm 입니다.\n", name, height, '\u02733d9');
    }
}