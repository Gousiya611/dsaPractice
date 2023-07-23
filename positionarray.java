class Solution {
    public int search(int[] nums, int target) {
         if(nums.length == 1){
            return nums[0] == target ? 0 : -1;    
        }
        int i=0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i] == target){
                return i;
            }
            else if(nums[j] == target){
                return j;
            }
            else if(target > nums[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return -1;
        
    }
}
