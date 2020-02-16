import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) {
          /*  if(nums[0]==0) {return 1;
                          }else{ return 0;} }
         */
       return (nums[0]==0) ? 1 : 0;
    }
        
        for(int a=0;a<nums.length;a++){
            if(a!=nums[a]) return a;  
        }
        return nums.length;       
    }
}
