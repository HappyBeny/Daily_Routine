public class SumIf {
    public static void main(String[] args) {
        int n = 120;

        int result = solution(n);
        System.out.println("result = " + result);

    }

    static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
