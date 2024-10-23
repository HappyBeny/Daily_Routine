public class NumReverse {
    public static void main(String[] args) {
        int[] result = solution(2324561);
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[" + i + "]" + result[i]);
        }
    }

    public static int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        for (int i=0; i < num.length(); i++) {
            answer[i] = num.charAt(num.length()-i-1) - '0';
        }
        return answer;
    }
}
