/*
Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series. 

Example 1:

Input:
A1=2
A2=3
N=4
Output:
5
Explanation:
The series is 2,3,4,5,6....
Thus,4th term is 5.

Example 2:

Input:
A1=1
A2=2
N=10
Output:
10
Explanation:
The series is1,2,3,4,5,6,7,8,9,10,11..
Thus,10th term is 10.

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)

Constraints:
-104<=A1,A2<=104
1<=N<=103

*/

import java.util.Scanner;

class Method{
	
	public static void series(int A1,int A2,int N){
		
		// we have formula for finding the nth term.
		System.out.println(A1+((N-1)*(A2-A1)));
	}
}

class APSeries{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the very first number of Series: ");
		int A1 = sc.nextInt();
		System.out.print("Enter the very second number of Series: ");
		int A2 = sc.nextInt();
		System.out.print("Enter the term which you want to find in AP: ");
		int N = sc.nextInt();
		Method.series(A1,A2,N);
	}
}