package October;

public class Age {
    public static void main(String[] args) {

        int result = solution(23);
        System.out.println("result = " + result);
    }

    public static int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}
