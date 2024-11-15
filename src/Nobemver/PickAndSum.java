package Nobemver;

import java.util.Arrays;

public class PickAndSum {
    public int[] solution(int[] numbers) {
        int[] answer;  // 정답
        int[] preAns = new int[199]; // 일단 담아놓을 배열.
        int count = 0; // answer 배열을 얼만큼의 길이로 만들지 정하기 위한 변수

        // 1. numbers의 i번과 j번 더하는 과정
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j){
                    continue;
                }
                int value = numbers[i] + numbers[j];

                // 2. 더한 값이 preAns에 있는지 확인하고 없으면 대입
                boolean TNF = false;
                for (int k = 0; k < count; k++) {
                    if (value == preAns[k]) {
                        TNF = true;
                        continue;
                    }
                }
                if (!TNF){
                    preAns[count] = value;
                    count ++;
                }
                // 2.
            }
        }
        // 1.

        // 적당한 길이만큼 answer 초기화 후 대입, 오름차순 정렬
        answer = new int[count];

        for (int i = 0; i < count; i++) {
            answer[i] = preAns[i];
        }
        Arrays.sort(answer);

        return answer;
    }
}
