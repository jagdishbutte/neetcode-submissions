class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[2];
        // outer:for(int i = 0; i < nums.length; i++) {
        //     inner:for(int j = 0; j < nums.length; j++) {
        //         if(i != j && nums[i] + nums[j] == target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //             break outer;
        //         }
        //     }
        // }
        // return ans;

        int[][] elements = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            elements[i][0] = nums[i];
            elements[i][1] = i;
        }

        Arrays.sort(elements, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = elements.length - 1;

        while(left < right) {
            int cur = elements[left][0] + elements[right][0];
            if(cur == target) {
                return new int[] {Math.min(elements[left][1], elements[right][1]), Math.max(elements[left][1], elements[right][1])};
            } else if(target > cur) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
