class Solution {
    public int search(int[] nums, int target) {
        int high = 0, low = nums.length-1;
        while(high<= low){
            int mid = (high + low)/2;
            if(nums[mid] == target){
                return mid;
            }else if( nums[mid]> target){
                low = mid-1;
            }else{
                high = mid+1;
            }
        }
        return -1;
    }
}