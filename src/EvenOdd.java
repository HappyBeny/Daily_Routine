public class EvenOdd {
    public static void main(String[] args) {

        String result = solution(3);
        System.out.println("result = " + result);

    }

    static String solution(int num) {
        String answer;
        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
