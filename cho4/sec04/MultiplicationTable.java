package cho4.sec04;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int m=2; m<=9; m++){

            for (int n=1; n<=9; n++) {
                System.out.println(m + "x" + n + "=" + (m * n));
            }
        }
    }
}
