package Nobemver;

import java.util.ArrayList;
import java.util.Collections;

public class HallOfFame1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            Collections.sort(hallOfFame);

            if (hallOfFame.size() > k) {
                hallOfFame.remove(0);
            }
            answer[i] = hallOfFame.get(0);
        }
        return answer;
    }
}
// 깃 푸시용