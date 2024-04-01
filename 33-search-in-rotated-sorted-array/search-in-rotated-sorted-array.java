import java.util.Arrays;
import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
         if(nums[i]==target){
             return i;
         }
        }
            return -1;
    }
}