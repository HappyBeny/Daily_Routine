package October;

public class SumNumbers {
    public static void main(String[] args) {

        int result = solution(5389312);
        System.out.println("result = " + result);

    }

    public static int solution(int n) {
        int answer = 0;
        String numArr = String.valueOf(n);
        for (int i = 0; i < numArr.length(); i++) {
            answer += Character.getNumericValue(numArr.charAt(i));
        }
        return answer;
    }
}
