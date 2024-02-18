import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        
        while(i!=arr.length ){
            if(stack.isEmpty()|| stack.peek() < arr[i]){
                stack.push(arr[i]);
                i++;
            }else{
                stack.pop();
            }
        }
        
        int[] stk = new int[stack.size()];
        for(int j=stk.length-1; j>=0; j--){
            stk[j] = stack.pop();
        }
        
        
        return stk;
    }
}