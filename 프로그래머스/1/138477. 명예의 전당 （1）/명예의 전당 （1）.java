import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> rank = new LinkedList<>();

        for(int i=0; i<score.length; i++){
            rank.add(score[i]);
            if(rank.size()>k){ //가장 낮은 점수 제거
                rank.remove(Collections.min(rank));
            }
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}