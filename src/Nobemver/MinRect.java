package Nobemver;

public class MinRect {
    public int solution(int[][] sizes) {
        int answer = 0;
        int check ;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                check = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = check;
            }
        }


        int maxCol = sizes[0][0];
        int maxRow = sizes[0][1];

        for(int j = 1; j < sizes.length; j++){
            if(sizes[j][0] > maxCol){
                maxCol = sizes[j][0];
            }
            if(sizes[j][1] > maxRow){
                maxRow = sizes[j][1];
            }
        }
        answer = maxCol * maxRow;
        return answer;
    }
}
