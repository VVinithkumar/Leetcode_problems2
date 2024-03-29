class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> al=new ArrayList<>();
        int n=nums.length/3;
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            int count=e.getValue();
            if(count>n)
            {
                al.add(e.getKey());
            }
        }
        return al;
    }
}