class Solution {
    public int[] solution(int[] num_list) {
        int[] answer =new int[num_list.length+1];
        int lastIdx = num_list.length-1;
        
        for(int i=0; i< num_list.length; i++){
            answer[i] = num_list[i];
        }
        if(num_list[lastIdx] > num_list[lastIdx-1]){
            answer[num_list.length] = num_list[lastIdx] - num_list[lastIdx-1];
        }else{
            answer[num_list.length] = num_list[lastIdx]*2;
        }


        
        
        return answer;
    }
}