package October;

import java.util.Arrays;

public class DivisibleArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count=0;

        //나누어 떨어지는지 검사, 카운팅
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                count++;
            }
        }

        //없으면 -1 배열, 있으면 count만큼의 배열 만듦
        if (count==0){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
        }

        int j = 0;
        for(int i=0; i<arr.length; i++) {
            if(answer.length==0) {
                break;
            }
            if(arr[i]%divisor==0) {
                answer[j] = arr[i];
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
