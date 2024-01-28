class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> l1 = new ArrayList<Boolean>();      
          int n = nums.length;
        int nl = l.length;

        for(int i=0;i<nl;i++)
        {
            int arr [] = Arrays.copyOfRange(nums,l[i],r[i]+1);
            boolean flag = true;
            Arrays.sort(arr);
            if(arr.length>=2){
            int diff = arr[1]-arr[0];
            
            for(int j = 0;j<arr.length-1;j++)
            {
                if (arr[j+1]-arr[j]!=diff)
                {
                   
                    System.out.println(Arrays.toString(arr));
                    flag = false;
                    break;
                }
               
            }}
            else
            {
                flag=false;
            }
 if (flag==true)
                {
                    l1.add(true);
                    System.out.println(Arrays.toString(arr));
                }
                else
                {
                    l1.add(false);
                }
                
        }
    return l1;
}}