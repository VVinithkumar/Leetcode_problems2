class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int sum=0;
        Collections.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                if((nums.get(i)+nums.get(j))<target)
                {
                    sum++;
                }
            }
        }
        return sum;
    }
}