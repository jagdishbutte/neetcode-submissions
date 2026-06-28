class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        outer:for(int i = 0; i < nums.length; i++) {
            inner:for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break outer;
                }
            }
        }
        return ans;
    }
}
