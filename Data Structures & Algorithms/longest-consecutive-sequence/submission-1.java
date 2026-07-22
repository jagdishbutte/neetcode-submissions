class Solution {
    public int longestConsecutive(int[] nums) {
        // int res = 0; 
        // Set<Integer> elements = new HashSet<>();
        // for(int num : nums) {
        //     elements.add(num);
        // }
        // for(int num : nums) {
        //     int streak = 0; int cur = num;
        //     while(elements.contains(num)) {
        //         streak++;
        //         cur++;
        //     }
        //     res = Math.max(streak, res);
        // }
        // return res;

        // if(nums.length == 0) {
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int cur = nums[0], i = 0, res = 0, streak = 0;
        // while(i < nums.length) {
        //     if(cur != nums[i]){
        //         cur = nums[i];
        //         streak = 0;
        //     }
        //     while(i < nums.length && nums[i] == cur) {
        //         i++;
        //     }
        //     streak++;
        //     cur++;
        //     res = Math.max(res, streak);
        // }
        // return res;

        int res = 0;
        Set<Integer> elements = new HashSet<>();
        for(int num : nums) {
            elements.add(num);
        }
        for(int num : nums) {
            if(!elements.contains(num - 1)){
                int cur = num;
                int streak = 1;
                while(elements.contains(cur + 1)){
                    streak++;
                    cur++;
                }
                res = Math.max(res, streak);
            }
        }
        return res;
    }
}   
