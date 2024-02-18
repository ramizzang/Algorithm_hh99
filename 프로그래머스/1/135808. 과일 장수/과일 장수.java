import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        //사과상태에 따라 1점부터 K점까지 점수, K점이 최상품 1점이 최하품
        //한 상자에 사과를 m개씩 담아 포장
        //상자에 담긴 사과 중 가장 낮은 점수가 p(1<= p <=k) 한상자으 ㅣ가격 p*m
        //사과는 상자 단위로 판매 남은 사과는 버린다
        //최대점수 :k / 한상자에들어가는사과의수 :m / 점수 : score
        
        Arrays.sort(score);
        int len = score.length;
        //점수의 전체 길이(사과의 총개수 - 한상자에 들어가는 사과의 수) - 
        // 사과 7개 한상자에 4개씩 sort 7-4=3 1~4(1,1,1,2,2,3,3)
        for(int i = len-m; i>=0; i -= m){//상자 뒤에서 부터 반복(왜냐면 높은 점수)
            int min = score[i];
            answer += min*m;
        }
        
        
        return answer;
    }
}