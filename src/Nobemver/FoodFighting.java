package Nobemver;

public class FoodFighting {
    public String solution(int[] food) {
        String answer = "";
        String[] checker;
        StringBuilder sb = new StringBuilder("");
        int index1 = 1;
        int index2 = 0;

        for (int i = 1; i < food.length; i++) {
            food[i] -= (food[i] % 2);
            index1 += food[i];
            food[i] /= 2;
        }

        checker = new String[index1];


        for (int i = 1; i < food.length; i++) {
            Integer id = i;
            for (int j = 0; j < food[i]; j++) {
                checker[index2 + j] = id.toString();
                checker[checker.length - index2 - j - 1] = id.toString();
            }
            index2 += food[i];
        }

        checker[(index1 - 1) / 2] = "0";


        for (String s : checker) {
            sb.append(s);
        }
        answer = sb.toString();
        return answer;
    }
}