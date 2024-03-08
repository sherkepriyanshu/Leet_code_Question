class Solution {
    public int lengthOfLastWord(String s) {
           s = s.trim();
        
        // Extract the substring starting from the last occurrence of space + 1 to the end
        String lastWord = s.substring(s.lastIndexOf(' ') + 1);
        
        // Return the length of the last word
        return lastWord.length();
    }
}