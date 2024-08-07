class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> al=new ArrayList<>();
        Arrays.sort(nums1);
         Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        int ans[]=new int[al.size()];
        for(int v=0;v<al.size();v++)
        {
            ans[v]=al.get(v);
        }             
        return ans;
    }
}