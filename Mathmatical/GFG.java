/*
QUESTION: 
------------------------------------------------------------------------------------------------------
You a given a number N. You need to print the pattern for the given value of N.
for N = 2 the pattern will be 
2 2 1 1
2 1
for N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
------------------------------------------------------------------------------------------------------
Example1:

Input: 2
Output:
2 2 1 1 $2 1 $

Example2:

Input: 3
Output:
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $

Note : Instead of printing new line print a "$" without quotes.

*/

class GfG
{
    void printPat(int n)
    {
         // Your code here
        for(int i=n;i>0;i--) {
			int l=n;
			for(int j=n;j>0;j--) {
				for(int k=i;k>0;k--) {
					System.out.print(l+" ");
				}
				l--;
			}
			
			System.out.print("$");
		}

    }
}