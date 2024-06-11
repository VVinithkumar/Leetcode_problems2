class Solution {
    public String firstPalindrome(String[] words) {
        String s="";
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            s+=words[i];
            sb.append(words[i]);
            sb.reverse();
            if(s.equals(sb.toString()))
            {
                ans+=s;
                break;
            }
            s="";
            sb.delete(0,sb.length());
        }
        return ans;
    }
}