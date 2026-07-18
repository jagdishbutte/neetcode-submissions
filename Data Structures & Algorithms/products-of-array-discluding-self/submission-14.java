class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] aux = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     aux[i] = nums[i];
        // }
        // aux[0] = 1;
        // for(int i = 1; i < nums.length; i++) {
        //     aux[i] = aux[i - 1] * nums[i - 1];
        // }
        // for(int i = 0; i < aux.length; i++){
        //     System.out.println(aux[i]);
        // }
        // int suf = 1;
        // for(int i = nums.length - 1; i >= 0; i--) {
        //     aux[i] = aux[i] * suf; 
        //     suf *= nums[i];
        // }
        // return aux;

        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        int[] res = new int[n];

        pre[0] = 1;
        post[n - 1] = 1;
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {
            post[i] = post[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < n; i++) {
            res[i] = pre[i] * post[i];
        }

        return res;
    }
}  
