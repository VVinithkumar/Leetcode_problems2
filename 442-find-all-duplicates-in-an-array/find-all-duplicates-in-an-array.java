class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> al=new ArrayList<>();
        // Set<Integer> hs=new HashSet<>();
        //  List<Integer> li=new ArrayList<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(i==j){

        //         }
        //         else if(nums[i]==nums[j])
        //         {
        //              hs.add(nums[j]);
        //         }
        //         else{

        //         }
        //     }
        // }
        // for(int n:hs)
        // li.add(n);
        // return li;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                ans.add(nums[i]);  
            }
           
        }

        return ans;  
    }
}