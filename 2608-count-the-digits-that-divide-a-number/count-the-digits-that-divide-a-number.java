class Solution {
    public int countDigits(int num) {
       int count=0;
       int val=num;
       List<Integer> al=new ArrayList<>();
       while(num>0)
       {
         int a=num%10;
         al.add(a);
         num/=10;
       } 
       System.out.print(al);
       for(int i=0;i<al.size();i++)
       {
         if(val%al.get(i)==0)
         {
            count++;
         }
       }
       return count;
    }
}