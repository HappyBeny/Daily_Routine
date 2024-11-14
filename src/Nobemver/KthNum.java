package Nobemver;

import java.util.Arrays;

public class KthNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //정답 배열

        for (int i = 0; i < answer.length; i++){ // answer에 값 하나씩 넣기
            int[] preAns = new int[commands[i][1] - commands[i][0] + 1]; //적당한 길이의 배열 만들기

            for (int j = 0; j < preAns.length; j++){
                preAns[j] = array[commands[i][0] + j - 1];
            }
            Arrays.sort(preAns);
            answer[i] = preAns[commands[i][2]-1];
        }
        return answer;
    }
}
