package October;

public class AddMissingNumber {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}

//처음 쓴 코드
//public int solution(int[] numbers) {
//    int answer = 0;
//    int[] nums = {0,1,2,3,4,5,6,7,8,9};
//    int[] checkList = new int[10];
//
//    for(int i = 0; i < 10; i++){
//        boolean check = false;
//
//        for(int j = 0; j < numbers.length; j++){
//            if(numbers[j] == i){
//                check = true;
//                break;
//            }else {
//                check = false;
//            }
//        }
//
//        if (check == false) {
//            checkList[i] = i;
//        }
//    }
//
//    for (int i : checkList) {
//        answer += i;
//    }
//    return answer;
//}
