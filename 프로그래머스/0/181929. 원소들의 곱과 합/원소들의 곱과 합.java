class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum =0;
        int multi =1;
        for(int num: num_list){
            sum += num;
            multi *= num;
        }
        
        
        return multi<Math.pow(sum,2)?1:0;
    }
}