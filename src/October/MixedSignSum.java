package October;

public class MixedSignSum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] nums = new int[absolutes.length];
        for (int i = 0; i < absolutes.length; i++){
            if (signs[i] == false){
                nums[i] = absolutes[i] * -1;
            } else {
                nums[i] = absolutes[i];
            }
        }
        for (int num : nums) {
            answer += num;
        }
        return answer;
    }
}
