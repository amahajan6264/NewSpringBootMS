package com.ak.substring;

public class WorkingWithSubString {
    
    public static int countCommonSubstrings(String s1, String s2) {
        int count = 0;
        
        // Iterate through each character in the first string
        for (int i = 0; i < s1.length(); i++) {
            // Iterate through each character in the second string
            for (int j = 0; j < s2.length(); j++) {
                int m = i;
                int n = j;
                //daman aman
                // Count common substrings starting from the current positions
                while (m < s1.length() && n < s2.length() && s1.charAt(m) == s2.charAt(n)) {
                    count++;
                    m++;
                    n++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String input1 = "abcdxyz";
        String input2 = "xyzabcd";
        
        int commonSubstringCount1 = countCommonSubstrings(input1, input2);
        
        System.out.println("Count of common substrings for input1: " + commonSubstringCount1);
        
        String input3 = "daman";
        String input4 = "aman";
        
        int commonSubstringCount2 = countCommonSubstrings(input3, input4);
        
        System.out.println("Count of common substrings for input2: " + commonSubstringCount2);
    }
}
