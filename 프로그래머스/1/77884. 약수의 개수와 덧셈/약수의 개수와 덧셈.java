class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        //left 부터 right 까지 모든 수들 중
        // 약수의 개수가 짝수인 수는 더해
        // 약수의 개수가 홀수인 수는 빼서 리턴
        
        //13,14,15,16,17 까지 
        for(int i = left; i<= right; i++){//left~right 까지의 수들
            //약수의 개수를 return 받아야 한다.
            //i = left i 별로 count 필요
            int count=0;
            for(int j=1; j<=i; j++){
                if(i % j ==0){
                    count++;
                }
            }
            System.out.println(i+" : 약수개수 : "+count);
            
            if(count % 2 == 0){ //약수개수가 짝수
                answer += i;
            }else{
                answer -= i;
            }
            
        }
        
        
        return answer;
    }
}