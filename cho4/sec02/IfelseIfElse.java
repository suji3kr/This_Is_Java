package cho4.sec02;

public class IfelseIfElse {
    public static void main(String[] args) {

        int score = 43;

        if(score >= 90){
            System.out.println("정수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        else if(score >= 80){
            System.out.println("정수가 80보다 큽니다.");
            System.out.println("등급은 B입니다.");
        }
        else if(score >= 70){
            System.out.println("정수가 70보다 큽니다.");
            System.out.println("등급은 C입니다.");
        }
        else if(score >= 60){
            System.out.println("정수가 60보다 큽니다.");
            System.out.println("등급은 D입니다.");
        }
        else{
            System.out.println("정수가 60보다 작습니다.");
            System.out.println("등급은 E입니다.");
        }
    }
}
