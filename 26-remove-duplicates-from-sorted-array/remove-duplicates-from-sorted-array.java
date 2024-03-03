class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> array = new ArrayList<Integer>();
        for(Integer i :nums)
        {
            if (array.contains(i))
            {

            }
            else
            {
                array.add(i);
            }
            
        }
        int j =0;
        for (Integer i : array)
        {
            nums[j] = i;
            j++;
        }
        return array.size();
    }
}