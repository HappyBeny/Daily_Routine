public class GapedNumber {
    public static void main(String[] args) {
        int num = 8;
        long[] arr = solution(4, num);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("No." + (i+1) + " : " + "arr[" + i + "] = " + arr[i]);
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
