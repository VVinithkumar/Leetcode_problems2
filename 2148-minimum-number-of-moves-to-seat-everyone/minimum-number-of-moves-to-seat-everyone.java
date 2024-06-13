class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
         Arrays.sort(students);
         int n=0;
         int v=seats.length;
         for(int i=0;i<v;i++)
         {
            n+=Math.abs(seats[i]-students[i]);
         }
          System.gc();
         return n;
    }
}