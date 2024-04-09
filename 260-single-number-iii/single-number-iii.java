class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            if(e.getValue()==1)
            {
                al.add(e.getKey());
            }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}