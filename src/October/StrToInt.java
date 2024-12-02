package October;

public class StrToInt {
    public static void main(String[] args) {

        String num = "-121234";
        int ChangedNum = solution(num);
        System.out.println("ChangedNum = " + ChangedNum);
    }

    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

}
