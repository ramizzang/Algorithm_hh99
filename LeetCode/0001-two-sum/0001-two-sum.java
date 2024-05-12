import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 결과를 저장할 배열
        int[] result = new int[2];
        
        // 숫자와 인덱스를 저장할 해시맵
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // complement가 해시맵에 있다면 해당 인덱스와 현재 인덱스를 결과로 반환
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            
            // 현재 숫자와 인덱스를 해시맵에 저장
            map.put(nums[i], i);
        }
        
        // 만약 두 수의 합이 target이 되는 조합이 없다면 null 반환
        return null;
    }
}