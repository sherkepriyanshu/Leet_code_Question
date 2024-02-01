class Solution {
    public int[] shuffle(int[] nums, int n) {

        int arr[] = new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i*2] = nums[i];
            arr[i*2+1] = nums[n+i];
        }
        return arr;
    }
}