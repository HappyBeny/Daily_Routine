package October;

public class Protractor {
    public static void main(String[] args) {

        int angleResult = solution(170);
        System.out.println("angleResult = " + angleResult);

    }

    public static int solution(int angle) {
        int answer = 0;
        if (angle < 90 && angle > 0) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
