/*
QUESTION2:
------------------------------------------------------------------------------------------------------
Print the multiplication table of a given number N. 
------------------------------------------------------------------------------------------------------
Input:
N = 9

Output:
9 18 27 36 45 54 63 72 81 90

Explanation:
The table of 9 is the output whose 1st 
term is 9 and the 10th term is 90.
----------------------------------------------------
Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints: 
1 <= N <= 10^6

*/

class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        
            for(int i=1; i<=10; i++){
                
                al.add(N*i);
            }
            return al;
    }
}