class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mp=new LinkedHashMap<>();
        List<String> al=new ArrayList<>();
        String s="";
        for(int i=0;i<arr.length;i++)
        {
           mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            if(e.getValue()==1)
            {
                al.add(e.getKey());
            }
        }
        if(al.size()<k)
        {
            return s;
        }
        else
        {
            s+=al.get(k-1);
        }
        return s;
    }
}