class Solution {
  public long solution(long n) {
        
      long sqrt = (long)Math.sqrt(n);
      
      // 제곱인지 판단 -> 다시 제곱한게 n과 같아야한다
                
      if ((long)Math.pow(sqrt,2) == n) {
            return (long) Math.pow(sqrt + 1, 2);
        }
      
      

        return -1;
  }
}