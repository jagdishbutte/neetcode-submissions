class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int right = nums.length - 1;
        // int left = 0;
        // Arrays.sort(nums);

        // while(left < right) {
        //     if((nums[left] + nums[right]) == target) {
        //         return new int[]{left, right};
        //     } else if((nums[left] + nums[right]) > target) {
        //         right--;
        //     } else if((nums[left] + nums[right]) < target){
        //         left++;
        //     }
        // }
        // return new int[0];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)) {
                return new int[]{Math.min(i, map.get(required)), Math.max(i, map.get(required))};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
