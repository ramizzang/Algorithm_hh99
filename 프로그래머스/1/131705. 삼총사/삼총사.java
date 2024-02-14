class Solution {
    public int solution(int[] number) {
        int answer = 0;
        //5명 중 3명을 더했을 때 0
        //모든 조합을 알고싶다
        
        for(int i = 0; i < number.length; i++){ // 여기서 index 0~4 까지 5개
            for(int j = i+1; j < number.length; j++){ // 여기서 index i:0 -> j:1, i: 3: j:4 index 1~4 까지 4
                for(int k = j+1; k < number.length; k++){// 여기서 3명 index 2~4
                    // 3개 더했을때 0인 조합의 수를 count
                    if(number[i]+number[j]+number[k] == 0){ // 이게 0이면 answer에 증가
                        answer++;
                    }
                }
                
            }
        }
        
        return answer;
    }
}