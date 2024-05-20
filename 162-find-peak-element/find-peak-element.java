class Solution {
    public int findPeakElement(int[] nums) {
        int a=nums[0];
        int n=0;
        int m=nums.length;
         for(int i=1;i<m;i++)
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