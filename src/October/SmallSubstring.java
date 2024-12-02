package October;

public class SmallSubstring {
    public static void main(String[] args) {
        int result = solution("500220839878", "7");
        System.out.println("result = " + result);
    }
    public static int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length()-p.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < p.length(); j++) {
                sb.append(t.charAt(i + j));
            }
            if (Long.parseLong(sb.toString()) <= Long.parseLong(p)) {
                answer += 1;
            }
        }
        return answer;
    }

}
