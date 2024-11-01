package Nobemver;

public class NumStrAndWords {
    public int solution(String s) {
        int answer = 0;
        StringBuilder preAnswer = new StringBuilder("");
        String[] NumStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] Nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            try {
                Integer.parseInt(s.substring(i, i + 1));
                preAnswer.append(s.charAt(i));
            } catch (Exception e){
                sb.append(s.charAt(i));
                for (int j = 0; j < 10; j++){
                    if (sb.toString().equals(NumStr[j])) {
                        preAnswer.append(Nums[j]);
                        sb = new StringBuilder("");
                    }
                }
            }
        }
        answer = Integer.parseInt(preAnswer.toString());
        return answer;
    }
}
