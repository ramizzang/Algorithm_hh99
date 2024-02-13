class Solution {
    public int solution(int num) {
        int answer = 0;
        long colNum = num;
        
        while(colNum != 1){
            if (colNum % 2 == 0) {
                colNum /= 2;
            } else {
                colNum = colNum * 3 + 1;
            }
            answer++;
            
            //500번 시도
            if(answer == 500){
                return -1;
            }
        }
        
        return answer;
    }
}