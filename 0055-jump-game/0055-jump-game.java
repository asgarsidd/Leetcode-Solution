class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int b = 0;
        for(int i = 0; i<=b; i++){
            b = Math.max(b, i+nums[i]);
            if(b >= n-1){
                return true;
            }
            
        }
        return false;
    }
}