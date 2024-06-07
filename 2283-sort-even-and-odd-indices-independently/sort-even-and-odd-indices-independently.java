class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int arr[]=new int[nums.length];
        int a=0;
        
        int b=1;
        List<Integer> al=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                al.add(nums[i]);
            }
            else
            {
                al1.add(nums[i]);
            }
        }
        Collections.sort(al);
        Collections.sort(al1);
        // System.out.print(al);
        // System.out.print(al1);

        for(int i=0;i<al.size();i++)
        {
            arr[a]=al.get(i);
            a+=2;
        }
        for(int i=al1.size()-1;i>=0;i--)
        {
            arr[b]=al1.get(i);
            b+=2;
        }
        return arr;
    }
}