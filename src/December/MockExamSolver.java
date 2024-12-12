package December;

import java.util.Arrays;

public class MockExamSolver {
    public int[] solution(int[] answers) {

        int[] answer = new int[1];
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int s1Correct = 0;
        int s2Correct = 0;
        int s3Correct = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                s1Correct++;
            }

            if (answers[i] == student2[i % student2.length]) {
                s2Correct++;
            }

            if (answers[i] == student3[i % student3.length]) {
                s3Correct++;
            }
        }

        int[] preAns = {s1Correct, s2Correct, s3Correct};
        Arrays.sort(preAns);

        if (preAns[0] > preAns[1]) {
            answer[0] = preAns[0];
        } else if (preAns[0] == preAns[1]) {
            answer = new int[2];
            answer[0] = preAns[0];
            answer[1] = preAns[1];
        } else if (preAns[0] == preAns[2]) {
            answer = new int[3];
            answer[0] = preAns[0];
            answer[1] = preAns[1];
            answer[2] = preAns[2];
        }

        return answer;
    }
}
