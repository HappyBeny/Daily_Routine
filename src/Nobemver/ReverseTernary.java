package Nobemver;

public class ReverseTernary {
    public int solution(int n) {
        int answer = 0;
        StringBuilder ternary = new StringBuilder();
        String terNum;

        while (n > 0) {
            ternary.append(n % 3);
            n /= 3;
        }
        terNum = ternary.toString();

        for (int i = 0; i < terNum.length(); i++) {
            int num = Integer.parseInt(terNum.substring(terNum.length()-i-1, terNum.length()-i));
            answer += num * (int) Math.pow(3, i);
        }
        return answer;
    }
}
