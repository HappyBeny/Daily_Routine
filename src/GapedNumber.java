public class GapedNumber {
    public static void main(String[] args) {
        int num = 8;
        long[] arr = solution(0, num);
        for (long l : arr) {
            System.out.println("l = " + l);
        }
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++){
            answer[i] = (long) x * (i+1);
        }
        return answer;
    }
}
