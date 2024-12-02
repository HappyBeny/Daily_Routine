package October;

import java.util.Arrays;

public class IntDesc {
    public static void main(String[] args) {
        long result = solution(2157843);
        System.out.println("result = " + result);
    }

    public static long solution(long n) {
        long answer = 0;

        String num = String.valueOf(n);
        int[] numArr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            numArr[i] = Character.getNumericValue(num.charAt(i));
        }

        Arrays.sort(numArr);
        StringBuilder sb = new StringBuilder();
        for (int i = numArr.length - 1; i >= 0; i--) {
            sb.append(numArr[i]);
        }

        answer = Long.parseLong(sb.toString());
        return answer;
    }


//    처음 적은 코드ㅠ
//    public static long solution(long n) {
//        long answer = 0;
//        String num = String.valueOf(n); //n을 String값으로 바꾸기
//        String[] arr = new String[num.length()]; //n의 자릿수만큼의 길이를 가진 String배열 만들기
//        for (int i = 0; i < num.length(); i++) {
//            arr[i] = num.charAt(i) + "";
//        } //arr에 num의 각 자릿수 값 대입하기
//        int[] numArr = new int[arr.length]; //arr 배열 길이와 같은 길이의 int[] numArr 배열 만들기
//        for (int i = 0; i < arr.length; i++) {
//            numArr[i] = Integer.parseInt(arr[i]);
//        } //문자 arr배열의 값을 숫자 numArr배열에 대입하기
//        Arrays.sort(numArr); //numArr 배열 오름차순 정리하기
//        String newArr = String.valueOf(numArr); //numArr배열을 newArr라는 String값으로 만들기
//        String preAns = new String; + "";  //newArr 문자열의 첫 번째 문자를 가진 preAns만들기
//        for (int i = newArr.length(); i >= 0; i--) {
//            preAns += newArr.charAt(i);
//        } //preAns에 문자로 적힌 숫자 쌓기
//        answer = Long.parseLong(preAns);
//        return answer;
//    }
}
