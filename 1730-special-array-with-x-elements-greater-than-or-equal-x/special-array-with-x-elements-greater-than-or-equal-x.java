class Solution {
    public int specialArray(int[] nums) {
      int n=nums.length;
      int count=0;
      for(int i=0;i<=n;i++)
      {
          count=0;
         for(int j=0;j<n;j++)
         {
            if(nums[j]>=i)
            {
                count++;
            }
         }
         if(i==count)
         {
            return i;
         }
      }
      return -1;
    }
}