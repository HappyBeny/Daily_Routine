package October;

public class Division {
    public static void main(String[] args) {

        int result = solution(3,2);
        System.out.println("result = " + result);
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        double div = (double) num1 / num2;
        double div2 = div*1000;
        answer = (int)div2;
        return answer;
    }
}
