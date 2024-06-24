class Solution {
    public int distinctAverages(int[] nums) {
        int ans=0;
        List<Integer> al=new ArrayList<>();
        List<Double> al1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
        while(al.size()>0)
        {
            int max=Collections.max(al);
            int min=Collections.min(al);
            double  an=(max+min)/2.0;
            al1.add(an);
            al.remove(Integer.valueOf(max));
            al.remove(Integer.valueOf(min));
            max=0;
            min=0;
            ans=0;
        }
        Set<Double> s=new HashSet<>();
       for(int i=0;i<al1.size();i++)
       {
         s.add(al1.get(i));
       }
        return s.size();
    }
}