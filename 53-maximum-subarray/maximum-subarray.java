class Solution {
    public int maxSubArray(int[] nums) {
        long sum = 0;
        long max =Long.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum +=nums[i];
            if(sum>max)
            {
                max = sum;
            }
            if (sum<0)
            {
                sum=0;
            }
        }
        return (int)max;
    }}