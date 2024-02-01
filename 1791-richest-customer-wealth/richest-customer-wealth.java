class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int sum =0,max=0;
        for(int i=0;i<n;i++)
        {
          sum = Arrays.stream(accounts[i]).sum();
          if (sum>max)
          {
              max= sum;
          }
        }
        return max;
    }
}