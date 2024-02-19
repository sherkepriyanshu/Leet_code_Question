class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j=0;
        double med;
        int[] arr=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        int x=arr.length;
        if(x%2==0)
        {
            med=arr[x/2]+arr[x/2-1];
            return med/2;
        }
        else{
            med=arr[x/2];
            return med;
        }
    }
}