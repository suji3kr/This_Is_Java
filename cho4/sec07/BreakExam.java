package cho4.sec07;

public class BreakExam {
    public static void main(String[] args) {
        while (true){
        //for(;;){
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);
            if(num == 6)
                break;
        }
        System.out.println("프로그램 종료");
    }
}
