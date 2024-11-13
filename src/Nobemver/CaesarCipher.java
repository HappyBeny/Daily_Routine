package Nobemver;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder preAnswer = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
                int index = (int) s.charAt(i) + n;
                if (index > 90){
                    index -= 26;
                }
                preAnswer.append((char) index);
            } else if (s.charAt(i) == ' ') {
                preAnswer.append((' '));
            } else {
                int index = (int) s.charAt(i) + n;
                if (index > 122) {
                    index -= 26;
                }
                preAnswer.append((char) index);
            }
        }
        answer = preAnswer.toString();
        return answer;
    }
}
