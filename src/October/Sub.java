package October;

public class Sub {
    public static void main(String[] args) {
        int result=solution(1, 2);
        System.out.println("result = " + result);
    }

    public static int solution(int num1, int num2){
            int answer = 0;
            answer = num1 - num2;
            return answer;
    }
}
