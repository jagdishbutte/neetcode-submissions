class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = 0;

        while(left < right) {
            int length = right - left;
            area = Math.max(area, Math.min(heights[left], heights[right]) * length);
            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
