class Solution {
    public int climbStairs(int n) {
           int  noOfWays[] = new int[n + 1];
     
        noOfWays[0] = noOfWays[1] = 1;
      
        for(int steps = 2; steps < n + 1; steps++){
            noOfWays[steps] = noOfWays[steps-1] + noOfWays[steps-2];
        }
     
        return noOfWays[n];
    }
}