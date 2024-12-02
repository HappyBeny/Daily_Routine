package October;

public class SumOfDivisor {
    public static void main(String[] args) {

        int result = solution(12);
        System.out.println("result = " + result);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }
        return answer;
    }
}
