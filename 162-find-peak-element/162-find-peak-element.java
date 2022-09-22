class Solution {
    public int findPeakElement(int[] nums) {
        //  int n = nums.length , count = 0;
        // for(int i = 1; i < n; i++){
        //     if(nums[i-1] < nums[i] && nums[i]> nums[i+1] ){
        //         count++;
        //     }
        // }
        // return count;
        if(nums.length==0)
            return 0;
        if(nums.length == 1)
            return 0;
        if(nums.length == 2){
            if(nums[0]> nums[1] )
                return 0;
            return 1;
        }
         if(nums[0]> nums[1] )
                return 0;
         int n = nums.length, count = 0;
        for(int i = 1; i<n-1; i++){
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]){
                return i;
            }
        }
        if(nums[n-1]> nums[n-2])
            return n-1;
        return 0;
    
    }
}