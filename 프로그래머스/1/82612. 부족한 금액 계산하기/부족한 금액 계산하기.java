class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;

        // 놀이기구 이용요금
        for(int i = 1; i <= count; i++ ){
            // 1 번탈때마다 돈에서 빼기
            money -= (long)i*price;
        }
        answer = money < 0 ? -money : 0;
        return answer;
    }
}