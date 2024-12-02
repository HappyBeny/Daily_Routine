package October;

public class Equalizing {
    public static void main(String[] args) {

        int result = solution(1,1);
        System.out.println("result = " + result);
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2){
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
