class Solution {
    public int findPeakElement(int[] nums) {
        int a=nums[0];
        int n=0;
         for(int i=1;i<nums.length;i++)
        {
           if(a<nums[i])
           {
              a=nums[i];
              n=i;
           }
        }
        return n;
    }
}