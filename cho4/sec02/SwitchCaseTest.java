package cho4.sec02;

public class SwitchCaseTest {
    public static void main(String[] args) {

        int score = 100;

        switch (score/10) {
            case 10:  //100점
            case 9:   //90점이상
                System.out.println("정수가 90보다 큽니다.");
                System.out.println("등급은 A입니다.");
                break;
            case 8:
                System.out.println("정수가 80보다 큽니다.");
                System.out.println("등급은 B입니다.");
                break;
            case 7:
                System.out.println("정수가 70보다 큽니다.");
                System.out.println("등급은 C입니다.");
                break;
            case 6:
                System.out.println("정수가 60보다 큽니다.");
                System.out.println("등급은 D입니다.");
                break;
            default:
                System.out.println("정수가 60보다 작습니다.");
                System.out.println("등급은 E입니다.");
                break;
        }
    }
}

