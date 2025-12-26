import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=1; 
        int k=nums[0];

        for (int i=1;i<n;i++) {
            if (nums[i]==nums[i-1]){
                c++;
            } else{
                c=1; 
            }
            if (c>n/2) {
                k=nums[i];
            }
        }
        return k;
    }
}