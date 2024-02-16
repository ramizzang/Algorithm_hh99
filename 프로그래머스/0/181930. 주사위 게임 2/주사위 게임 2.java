import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        // 세개 숫자가 모두 다르면 a+b+c
        // 두개가 같으면 (a+b+c)*(a*a+b*b+c*c)
        // 세개가 같으면 (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)
        int count=1;
        if( a==b || a==c || b==c ){ // 두개 중복 체크
            count++;
        }
        if(a == b && b == c){ // 세개 중복 체크
            count++;
        }
        System.out.println(count);
        
        for(int i=1; i<=count; i++){
   
            answer *= (int)(Math.pow(a,i)+Math.pow(b,i)+Math.pow(c,i));
        }
        
        
        
        return answer;
    }
}