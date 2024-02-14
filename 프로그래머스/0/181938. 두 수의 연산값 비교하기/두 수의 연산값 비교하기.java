class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //양의정수 a,b  ab = 2*a*b -> ab return
        
       int cul = Integer.parseInt(""+a+b);
        
        if(cul >= 2*a*b){
            return cul;
        }
        
        
        
        return 2*a*b;
    }
}