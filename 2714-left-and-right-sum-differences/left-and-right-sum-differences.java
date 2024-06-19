class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int arr[]=new int[nums.length];
        int ans=0;
        int sum=0;
        int n=1;
        int n1=nums.length-2;
        left[0]=0;
        right[nums.length-1]=0;
        for(int i=0;i<nums.length-1;i++)
        {
            ans+=nums[i];
            left[n]=ans;
            n++;
        }
        for(int i=nums.length-1;i>0;i--)
        {
            sum+=nums[i];
            right[n1]=sum;
            n1--;
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=Math.abs(left[i]-right[i]);
        }
    return arr;
    }
}