/*
==============================================================================================================
QUESTION1:
------------------------------------------------------------------------------------
Given a string S, check if it is palindrome or not.
------------------------------------------------------------------------------------
Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
------------------------------------------------------------------------------------
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
------------------------------------------------------------------------------------
Iteration1:
str = abba
a == a(true)
now string reduce to bb

Iteration2:
str = bb
b == b(true)
now string reduce to 0

OUTPUT: return 1;

*/

import java.util.Scanner;

class Palindrome{
	
	private static int isPalindrome(String S){
		
		if(S.length() == 0 || S.length() == 1){
			
			return 1;
		}else{
			
			if(S.charAt(0) == S.charAt(S.length()-1)){
				
				return isPalindrome(S.substring(1,S.length()-1));
			}else{
				
				return 0;
			}
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Please Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isPalindrome(s));
	}
}