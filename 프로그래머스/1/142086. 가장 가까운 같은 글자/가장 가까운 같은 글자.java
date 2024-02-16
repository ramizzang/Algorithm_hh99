import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> idxMap = new HashMap<>();
        
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            Integer idx = idxMap.get(ch);
            
            if(idx == null){ //반복문 처음 돌면 저장된 ch가 없어서 idx 는 null일 것
                answer[i] = -1;
            }else{
                answer[i] = i-idx;
            }
            
            //map 에 문자랑 index 원본 저장 비교할 원본!
            //map 에는 key가 같다면 마지막 value 가 저장된다!
            //ch : key, i(인덱스) : value
            idxMap.put(ch,i);
        }
        
        return answer;
    }
}