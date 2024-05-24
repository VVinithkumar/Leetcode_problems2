class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==n) return nums[i];
        }
        return -1;
        
    }
}