package cho3.sec05;

public class InfinityAndNanExam {
    public static void main(String[] args) {
        int x = 5;
        double y = 20.0;
        double z = x/y;

        //System.out.println( z+2 );

        if (Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가함");

        }else{
            System.out.println(z+2);

        }
    }
}
