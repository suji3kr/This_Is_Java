package sec12;

import java.util.Scanner;

public class Resultp83 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int a  = scanner.nextInt();

        if(a %2 ==0){
            System.out.println("짝수입니다.");
        }
        else{
            System.out.println("홀수입니다.");
        }
    }
}
