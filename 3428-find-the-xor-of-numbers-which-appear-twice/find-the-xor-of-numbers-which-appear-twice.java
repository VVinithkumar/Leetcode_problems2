class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            if(e.getValue()==2)
            {
                ans^=e.getKey();
            }
        }
        return ans;
    }
}