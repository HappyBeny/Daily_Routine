public class SumBetween {
    public static void main(String[] args) {
        long result = solution(99999999,10000000);
        System.out.println("result = " + result);
    }

    public static long solution(int a, int b) {
        long answer = 0;
        int c;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        for (int i = a; i <= b; i++) {
            answer = answer + i;
        }
        return answer;
    }

}
