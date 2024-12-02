package October;

public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        //answer 배열 길이 0일 때
        if (answer.length == 0) {
            return new int[]{-1};
        }

        int index = 0;
        int min = arr[0];

        //arr 배열 내의 가장 작은 값의 위치 인덱스
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        for (int i = 0, answerIndex = 0; i < arr.length; i++) {
            if(i == index) continue;
            answer[answerIndex++] = arr[i];
        }
        return answer;
    }
}
