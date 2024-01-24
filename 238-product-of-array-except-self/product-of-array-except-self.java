class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] Parr = new int[n];
        int [] Sarr = new int[n];
        Parr[0]=1;
        Sarr[n-1]=1;

        for(int i=1;i<n;i++)
        {
Parr[i] = Parr[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            Sarr[i]=Sarr[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = Parr[i]*Sarr[i];
        }
        return nums;
    }
}