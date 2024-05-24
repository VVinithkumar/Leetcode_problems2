class Solution {
    public int repeatedNTimes(int[] nums) {
        // HashMap<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        //     if(mp.get(nums[i])==2) return nums[i];
        // }
        // return -1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}