class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<int[]> list = new ArrayList<>();

        for(int j = 0; j < nums.length; j++){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }

        list.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++ ){
            res[i] = list.get(i)[1]; 
        }

        return res;
    }
}
