import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        // x가 짝수일때 x%2
        // x가 홀수일때 3*x+1
        // 초기값이 n인 콜라츠 수열을 return
        
        List<Integer> list = new ArrayList<>(List.of(n));
        
        while(n != 1){
            if(n%2 ==0){
                n /= 2;
                list.add(n);
            }else{
                n = 3*n+1;
                list.add(n);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}