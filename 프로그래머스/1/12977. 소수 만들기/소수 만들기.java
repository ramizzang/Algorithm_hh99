class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 소수가 되는 경우의 개수
        // 서로 다른 3개를 골라 더했을때 소수가 되는 경우의 개수 리턴
        
        for(int i=0; i< nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        
        

        return answer;
    }
    
    private boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}