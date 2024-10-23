package sec12;
//두개의 숫자를 입력받아 +, -, * % 를 실행하는 프로그램 작성
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("첫 숫자를 입력하세요: ");
        int a  = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int b  = scanner.nextInt();

        System.out.println( a + "+"+ b +" = " + (a+b));
        System.out.println( a + "-"+ b +" = " + (a-b));
        System.out.println( a + "*"+ b +" = " + (a*b));
        System.out.printf(" %d / %d = %5.2f " ,a, b, ((float)a/b));

    }
}
