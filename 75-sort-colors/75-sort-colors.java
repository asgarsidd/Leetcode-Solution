class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int pt =-1, itr =0 ,n = nums.length, pt2=n-1;
        while(itr<=pt2){
            if(nums[itr]==0){
                swap(nums,itr++,++pt);
            }
            else if(nums[itr]==1){
                itr++;
            }
            else if(nums[itr]==2){
                swap(nums,itr,pt2--);
            }
        }
    }
}