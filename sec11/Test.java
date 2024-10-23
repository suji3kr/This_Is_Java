package sec11;

public class Test {
    public static void main(String[] args) {
        int a = 2147483;
        int b = 2147483;
        System.out.println("a =" +a + "     b ="+b);

        // int c = a * b ;   // 표현 범위 초과하면 오답 처리됨
        //System.out.println("c="+c);


        long c = a + b;
        System.out.println("c=" +c);
    }
}
