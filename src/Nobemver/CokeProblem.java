package Nobemver;

public class CokeProblem {
    public int solution(int a, int b, int n) {  //3 2 20
        int answer = 0;
        int get = 0;
        while (true) {
            if (n < a){
                break;
            }

            if (n % a == 0) {
                get = (n / a) * b;
                answer += get;
                n = get;
            } else {
                get = ((n/a) * a) / a * b;
                answer += get;
                n = (n % a) + get;
            }

        }
        return answer;
    }
}
