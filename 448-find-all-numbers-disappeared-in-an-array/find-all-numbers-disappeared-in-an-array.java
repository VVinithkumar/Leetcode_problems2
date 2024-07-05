class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> set = new HashSet<>();
       List<Integer> al=new ArrayList<>();
        for (int val : nums) {
            set.add(val);
        } 
       for(int i=1;i<=nums.length;i++)
       {
        if(!set.contains(i))
        {
            al.add(i);
        }
       }
       return al;
    }
}