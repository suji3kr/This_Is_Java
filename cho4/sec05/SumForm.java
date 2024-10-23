package cho4.sec05;

public class SumForm {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (i<100) {
            sum += i;
            i++;

        }
        System.out.print("1~ "+(i-1)+"합 :" +sum);
    }
}
