import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        //카드뭉치 두개
        //카드 뭉치에서 카드를 순서대로 한장씩
        //한번 사용한 카드는 다시 사용할수 없다
        //기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없다
        //cards1,cards2 를 사용하여 goal을 만들수 있다면 yes 없다면 no를 return
        // queue = fifo(first in first out)
        // stack = lafo(last in first out)
        
        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));
        
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(q1.peek())){
                q1.poll();
            } else if(goal[i].equals(q2.peek())){
                 q2.poll();
            }else{
                answer = "No";
            }
        }
        
        
        return answer;
    }
}