package December;

import java.util.Arrays;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length ; i >= m-1 ; i--) {
            i -= m;
            answer += score[i] * m;

        }
        return answer;
    }
}
