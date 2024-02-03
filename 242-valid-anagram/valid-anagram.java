class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted char arrays
        return Arrays.equals(sChars, tChars);
    }
}