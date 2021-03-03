class Solution {
    public int missingNumber(int[] nums) {
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2=sum2+nums[i];
        }
        return (((nums.length)*(nums.length+1))/2)-sum2;
    }
}