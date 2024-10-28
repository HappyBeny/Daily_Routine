public class CheckTheHarshadNum {
    public static void main(String[] args) {
        int num = 11;
        boolean isHarshadNum = solution(num);
        System.out.println("isHarshadNum = " + isHarshadNum);
    }

    public static boolean solution(int x) {
        boolean answer = true;
        String num = String.valueOf(x);
        int check = 0;
        for (int i = 0; i < num.length(); i++) {
            check += Character.getNumericValue(num.charAt(i));
        }
        if (x % check == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
