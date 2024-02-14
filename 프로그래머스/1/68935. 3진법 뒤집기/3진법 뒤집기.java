import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> num = new ArrayList<>();
        
        while (n>0){
            num.add(n % 3);
            n = n / 3;
        }
        
        for(int i=num.size()-1; i>=0; i--){
            answer += (int)Math.pow(3,i) * num.get(num.size()-i-1);
        }
        
        return answer;
    }
}