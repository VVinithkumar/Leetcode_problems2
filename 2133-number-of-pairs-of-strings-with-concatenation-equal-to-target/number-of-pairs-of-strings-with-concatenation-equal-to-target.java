class Solution {
    public int numOfPairs(String[] nums, String target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                String s=nums[i]+nums[j];
                if(i!=j)
                {
                    if(s.equals(target))
                {
                    sum++;
                }
                }
                
            }
        }
        return sum;
    }
}