class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 1; i<=len; i++){
            sum += i;
        }
        for(int i = 0; i<len; i++){
            sum -= nums[i];
        }
        return sum;
    }
}