public class CheckTheSquareRoot {
    public static void main(String[] args) {
        long num = 81;
        long result = solution(num);
        System.out.println("result = " + result);
    }

    public static long solution(long n) {
        long answer = 0;
        long rootNumber = 0;
        if((double) Math.sqrt(n) == (int)Math.sqrt(n)){
            long num = (long)Math.sqrt(n);
            answer = (num+1) * (num+1);
        } else {
            answer = -1;
        }
        return answer;
    }
}
