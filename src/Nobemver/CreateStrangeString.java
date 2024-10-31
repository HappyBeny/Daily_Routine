package Nobemver;

public class CreateStrangeString {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);
        String[] word = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < words[i].length(); j++) {
                if (j % 2 == 0){
                    sb.append(Character.toUpperCase(words[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
            word[i] = sb.toString();
        }
        answer = String.join(" ", word);
        return answer;
    }
    //순서틀려서 커밋용
}
