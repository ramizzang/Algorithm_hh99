class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int index = 0;
        for(int num : absolutes){
            num = signs[index] ? +num : -num ;
            // System.out.println(num);
            answer += num;
            index++;
        }
        return answer;
    }
}