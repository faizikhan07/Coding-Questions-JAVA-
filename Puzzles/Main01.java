import java.util.Scanner;

class Solution{
	
	public static int countSquares(int N){
		
		if(N <= 0){
			return -2147483648;
		}else{
			int var = (int)Math.sqrt(N-1);  // N = 9    var = 3
			return var;
		}
	}
}

class Main01{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Solution.countSquares(N));
	}
}
