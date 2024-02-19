import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        // answers : 정답이 들은 배열
        // 가장 많은 문제를 맞힌 사람이 누구?
       
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = new int[3];        

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supoja1[i % supoja1.length]) {
                scores[0]++;
            }
            if (answers[i] == supoja2[i % supoja2.length]) {
                scores[1]++;
            }
            if (answers[i] == supoja3[i % supoja3.length]) {
                scores[2]++;
            }
        }
        System.out.println(Arrays.toString(scores));
        
        int maxScore = Math.max(scores[0],Math.max(scores[1],scores[2]));
        
        List<Integer> list = new ArrayList<>();
        
        if(maxScore == scores[0]){
            list.add(1);
        }
        if(maxScore == scores[1]){
            list.add(2);
        }
        if(maxScore == scores[2]){
            list.add(3);
        }
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}