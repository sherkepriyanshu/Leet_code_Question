class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1 = m - 1;
        int arr2 = n - 1;
        int k = nums1.length - 1;

        while(arr2 >= 0)
        {
            if(arr1 >= 0 && nums1[arr1] > nums2[arr2])
            {
                nums1[k--] = nums1[arr1--];
                // k--;
                // arr1--;
            }
            else
            {
                nums1[k--] = nums2[arr2--];
                // k--;
                // arr2--;
            }
        }
    }
}