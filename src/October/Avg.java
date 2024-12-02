package October;

public class Avg {
    public static void main(String[] args) {
        int[] numbers = new int[11];
        numbers[0] = 89;
        numbers[1] = 90;
        numbers[2] = 91;
        numbers[3] = 92;
        numbers[4] = 93;
        numbers[5] = 94;
        numbers[6] = 95;
        numbers[7] = 96;
        numbers[8] = 97;
        numbers[9] = 98;
        numbers[10] = 99;

        double result = solution(numbers);
        System.out.println("result = " + result);
    }
    static double solution(int[] nums) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        answer = sum / nums.length;
        return answer;
    }
}

