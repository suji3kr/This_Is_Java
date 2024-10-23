package cho3.sec05;

public class ConditionalOperation {
    public static void main(String[] args) {
        int score =120;
//        char  grade;
//
//        if(score > 90)
//            grade ='A';
//
//        else
//            grade = 'B';

        char grade =(score>90) ? 'A' :(score>80)? 'B' :'C';
        System.out.println(score + "점은" +grade+"등급입니다.");

    }
}
