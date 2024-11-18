class Solution {
    public void moveZeroes(int[] nums) {
      Stack<Integer> s = new Stack<Integer>();
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]!=0)
          {
              s.push(nums[i]);
          }
      }
       for(int i=0;i<nums.length;i++)
      {
          if(nums[i]==0)
          {
              s.push(nums[i]);
          }
      }
      int n=0;
      for(int i=0;i<s.size();i++)
      {
          nums[n]=s.get(i);
          n++;
      }
    // int i=0;
    // int j=1;
    // while(j<nums.length)
    // {
    //     if(nums[j]!=0)
    //     {
    //        int temp=nums[j];
    //         nums[j]=nums[i];
    //         nums[i]=temp;
    //         i+=1;
    //         j+=1;
    //     }
    //     else
    //     {
    //         j+=1;
    //     }
    // }
    }
}