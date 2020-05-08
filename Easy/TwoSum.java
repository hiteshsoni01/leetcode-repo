/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
       
        Map<Integer,Integer> map=new HashMap<>();
        
        int cnt=1;
        for(int  i=0;i<nums.length;i++)
        {
            int tmp=target-nums[i];
           
            if(map.containsKey(tmp))
            {
                return new int[]{i,map.get(tmp)};
            }
            
            map.put(nums[i],i);
        }
        
        return new int[]{-1,-1};
        
    }
}
