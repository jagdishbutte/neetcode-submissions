class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;

        for(Integer num : nums) {
            set.add(num);
        }

        for(Integer num : nums) {
            if(!set.contains(num - 1)){
                int currentNum = num;
                int streak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    streak++;
                }
                maxCount = Math.max(streak, maxCount);
            }
        }
        return maxCount;
    }
}
