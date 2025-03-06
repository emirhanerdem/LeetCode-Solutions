import java.util.*;
public class Solution1_two_sum {
    public int[] twoSum(int[] nums,int target){
            Map <Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int remainder = target - nums[i];
                if(map.containsKey(remainder)){
                    return new int[] {i,map.get(remainder)};
                }
                map.put(nums[i],i);
            }
            throw new IllegalStateException("no pair found erro");
    }
}
