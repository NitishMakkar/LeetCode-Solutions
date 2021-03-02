class Solution {
    public int[] findErrorNums(int[] nums) {
        long len = (long)nums.length;
        long Sum_N = (len * (len + 1)) / 2;
        long Sum_NSq = (len * (len + 1) * 
                         (2 * len + 1)) / 6;
        long missingNumber = 0, repeating = 0;
 
        for (int i = 0; i < nums.length; i++) 
        {
            Sum_N -= (long)nums[i];
            Sum_NSq -= (long)nums[i] * (long)nums[i];
        }
 
        missingNumber = (Sum_N + Sum_NSq / Sum_N) / 2;
        repeating = missingNumber - Sum_N;
        int[] ans = new int[2];
        ans[0] = (int)repeating;
        ans[1] = (int)missingNumber;
        return ans;
    }
}