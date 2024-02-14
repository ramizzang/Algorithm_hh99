class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // 정수들의 절댓값을 차례다로 담은 정수배열
        // 부호를 차례대로 담은 불리언 배열 signs[i] == true 이면 양수
        // 두 배열의 길이는 같다. 정수들의 합을 구하여라
        
        // 배열의 길이만큼 만복
        for(int i =0; i < signs.length; i++){
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
       
        return answer;
    }
}