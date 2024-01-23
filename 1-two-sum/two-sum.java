class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int difference = target - nums[i];
            if (h1.containsKey(difference))
            {
                return new int[] {h1.get(difference),i};
            }
            h1.put(nums[i],i);
        }
        return new int[]{};
    }
}