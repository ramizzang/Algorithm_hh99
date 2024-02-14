class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //양의정수 a,b  ab = 2*a*b -> ab return
        
        String cul = ""+a+b;
        int intCul = Integer.parseInt(cul);
        
        if(intCul >= 2*a*b){
            return intCul;
        }
        
        
        
        return 2*a*b;
    }
}