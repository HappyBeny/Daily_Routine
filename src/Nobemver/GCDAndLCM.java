package Nobemver;

public class GCDAndLCM {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int c;

        if (n > m) {
            c = n;
            n = m;
            m = c;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (m % i == 0) {
                    answer[0] = i;
                }
            }
        }

        for (int i = m; i <= 2147483647; i++) {
            if(i % m == 0){
                if (i % n == 0){
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }
}
