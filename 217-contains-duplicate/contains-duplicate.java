class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    Set<Integer> s = new HashSet<>();
    for(int element : nums)
    {
        if (!(s.add(element)))
        {
            return true;
        }
    }
    return false;
    
}
}