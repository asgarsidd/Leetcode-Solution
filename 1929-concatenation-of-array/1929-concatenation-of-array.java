class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
    int[] ans = new int[2*n];
    
    // Copy the first array nums to the start of ans
    for (int i = 0; i < n; i++) {
        ans[i] = nums[i];
    }
    
    // Copy the second array nums to the end of ans
    for (int i = 0; i < n; i++) {
        ans[i + n] = nums[i];
    }
    
    return ans; 
    }
}