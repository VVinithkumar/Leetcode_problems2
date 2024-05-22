class Solution {
    public int[] shuffle(int[] nums, int a) {
       List<Integer> al=new ArrayList<>();
       List<Integer> al1=new ArrayList<>();
       int n=nums.length;
       for(int i=0;i<n/2;i++)
       {
          al.add(nums[i]);
       }
       for(int i=n/2;i<n;i++)
       {
        al1.add(nums[i]);
       }
       List<Integer> al2=new ArrayList<>();
        for(int i=0;i<a;i++)
       {
          al2.add(al.get(i));
          al2.add(al1.get(i));
       }
    int ans[]=new int[al2.size()];
    for(int i=0;i<n;i++)
    {
        ans[i]=al2.get(i);
    }
        return ans;
    }
}