class Solution {
    public double minimumAverage(int[] nums) {
        double ans=0;
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
            ans=(max+min)/2.0;
            al1.add(ans);
            al.remove(Integer.valueOf(max));
            al.remove(Integer.valueOf(min));
            max=0;
            min=0;
            ans=0;
        }
        // System.out.print(al1);
        return Collections.min(al1);
    }
}