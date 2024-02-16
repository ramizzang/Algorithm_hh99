class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        //a, 공차 d,
        //등차수열 합 n(2a+(n-1)d)/2
        //1항 : a
        // 2항 : a + d
        // 3항 : a + 2d
        // 4 : a + 3d
        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer += a + i*d;
            }
        }
        
        return answer;
    }
}