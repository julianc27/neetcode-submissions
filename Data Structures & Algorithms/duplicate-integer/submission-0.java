class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])) {
                return true;
            } else {
                map.put(i, nums[i]);
            }
        }
        
        return false;
    }
}