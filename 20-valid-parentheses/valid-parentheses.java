class Solution {
    
   
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch=='(' || ch=='[' ||ch =='{')
            {
                stack.push(ch);

            }
            else if (ch==')' || ch==']' ||ch =='}')
            {
                if (stack.empty())
                {
                    return false;
                }
                else
                {
                   char top= stack.pop();
                    if ((ch == ')' && top != '(') ||(ch == ']' && top != '[') || (ch == '}' && top != '{'))
                        {
                            return false;
                        }
                }
            }
        }
        if(stack.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}