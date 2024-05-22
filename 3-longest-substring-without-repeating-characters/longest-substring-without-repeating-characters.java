class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int s=0;
        // int e=0;
        // int count=0;
        // int freq[]=new int[128];
        // int ans=0;
        // int n=string.length();
        // while(e<n)
        // {
        //     char ch=string.charAt(e);
        //     if(freq[ch]==1)
        //     {
        //         count++;
        //     }
        //     freq[ch]++;
        //     e++;
        //     while(count>0)
        //     {
        //         char ch1=string.charAt(s);
        //         if(freq[ch1]==2)
        //         {
        //             count--;
        //         }
        //         freq[ch1]--;
        //         s++;
        //     }
        //    ans=Math.max(ans,e-s); 
        // }
        // return ans;
        int n=s.length();
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        int i=0,j=0;
        while(i<n && j<n)
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }
            else
            {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}