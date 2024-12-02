package October;

public class FindTheRest {
    public static void main(String[] args) {

       int result = solution(10);
        System.out.println("result = " + result);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++){
            if (n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
