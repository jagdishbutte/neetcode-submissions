class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] aux = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            aux[i] = nums[i];
        }

        aux[0] = 1;
        int pre = 1;
        for(int i = 1; i < nums.length; i++) {
            aux[i] = pre * nums[i - 1];
            pre = nums[i - 1] * pre; 
        }

        for(int i = 0; i < aux.length; i++){
            System.out.println(aux[i]);
        }

        int suf = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            aux[i] = aux[i] * suf; 
            suf *= nums[i];
        }

        return aux;
    }
}  
