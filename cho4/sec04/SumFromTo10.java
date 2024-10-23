package cho4.sec04;

public class SumFromTo10 {
    public static void main(String[] args) {
        // 0부터 1까지 반복하는 외부 루프
        for (int k = 0; k < 2; k++) {
            // 1부터 9까지 반복하는 중간 루프 (j는 곱할 숫자)
            for (int j = 1; j <= 9; j++) {
                // 2 + (k * 4) 부터 5 + (k * 4) 까지 반복하는 내부 루프 (i는 곱해지는 숫자)
                for (int i = 2 + (k * 4); i <= 5 + (k * 4); i++) {
                    // 주석 처리된 줄: 각 곱셈 결과를 출력 (포맷 조정)
                    //System.out.print(i + " x " + j + " = " + String.format("%2d", i * j) + "   ");

                    // 현재 i와 j의 곱을 포맷에 맞춰 출력
                    System.out.printf("%d x %d = %2d  ", i, j, i * j);
                }
                // 줄 바꿈: 각 j에 대한 결과 출력 후 새로운 줄 시작
                System.out.println();
            }
            // 줄 바꿈: 각 k에 대한 모든 결과 출력 후 새로운 줄 시작
            System.out.println();
        }
    }
}
