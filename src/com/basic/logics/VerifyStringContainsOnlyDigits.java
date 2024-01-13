package com.basic.logics;

public class VerifyStringContainsOnlyDigits {
	// Function to check if a string contains only digits
    public static boolean onlyDigits(String str, int n)
    {
        // Traverse the string from start to end
        for (int i=0; i<n; i++) {
  
            // Check if character is digit from 0-9 then return true else false
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
  
    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "123a4op";
        int len = str.length();
  
        // Function Call
        System.out.println(onlyDigits(str, len));
    }
}
