package October;

public class ArrAvg {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        arrays[3] = 4;
        arrays[4] = 5;
        arrays[5] = 6;
        arrays[6] = 7;
        arrays[7] = 8;
        arrays[8] = 9;
        arrays[9] = 10;

        double result = solution(arrays);
        System.out.println("result = " + result);
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        answer = (double)sum / arr.length;
        return answer;
    }

}
