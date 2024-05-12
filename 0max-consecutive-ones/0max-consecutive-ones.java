class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // 최대 연속된 1의 수를 저장할 변수를 초기화합니다.
        int currentCount = 0; // 현재 연속된 1의 수를 저장할 변수를 초기화합니다.
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++; // 현재 요소가 1이면 현재 카운트를 증가시킵니다.
                maxCount = Math.max(maxCount, currentCount); // 최대 카운트를 갱신합니다.
            } else {
                currentCount = 0; // 현재 요소가 0이면 현재 카운트를 0으로 초기화합니다.
            }
        }
        
        return maxCount;
    }
}