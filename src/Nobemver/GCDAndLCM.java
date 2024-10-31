package Nobemver;

public class GCDAndLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        for (int i = 1; i <= n+m; i++) {
            if(n % i == 0) {
                if(m % i == 0) {
                    answer[0] = i;
                    answer[1] = m*n/answer[0];
                }
            }
        }
        return answer;

        /* 두 수의 곱 = 최대공 * 최소공 모를 때
        int[] answer = new int[2];

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
        */
    }
}
