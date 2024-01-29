class Solution {
    
    public boolean isPalindrome(int x) {int y =0;
            int dummy = x;
        if (x<0)
        {
            return false;
        }
        else
        {
            
            while(x>0)
            {
                int digit = x%10;
                y =y*10+digit;
                x = x/10;
            }
        }
            if (dummy==y)
            {
                return true;

            }
            else

{
    return false;
}    
}}