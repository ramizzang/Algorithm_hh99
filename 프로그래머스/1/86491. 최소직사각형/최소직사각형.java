class Solution {
    public int solution(int[][] sizes) {
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes){
            int width = size[0];
            int height = size[1];
            
            //가로,세로 중 긴 값을 가로에 저장 
            maxWidth = Math.max(maxWidth,Math.max(width,height));
            //가로,세로 중 작은 값을 세로에 저장
            maxHeight = Math.max(maxHeight,Math.min(width,height));
        }
 
        return maxWidth * maxHeight;
    }
}