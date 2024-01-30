class Solution {
    public int getSum(int x, int y) {
        int keep = (x & y) << 1;
        int res = x^y;
     
        if (keep == 0)
            return res;
             
        return getSum(keep, res);
    }
}