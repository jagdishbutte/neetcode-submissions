class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> st = new HashSet<>();

        // for(int i = 0; i < nums.length; i++){
        //     Set<Integer> hashset = new HashSet<>();
        //     for(int j = i+1; j < nums.length; j++){
        //         int third = -(nums[i] + nums[j]);
        //         if(hashset.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
        //             Collections.sort(temp);
        //             st.add(temp);
        //         }
        //         hashset.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(st);

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if(sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
