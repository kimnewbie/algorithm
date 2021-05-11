package _ForLength;

public class JIhee_Q2 {
	public static void main(String[]args) {
		/*
		 	출력하
		  1   2  3
		  10 20 30 
		 
		 */
		
		int[][]g= new int [2][3];
		
		
		System.out.println("ver1");
		System.out.print(g[0][0]= 1);
		System.out.print(g[0][1]= 2);
		System.out.print(g[0][2]= 3);
		System.out.println();
		System.out.print(g[1][0]= 10);
		System.out.print(g[1][1]= 20);
		System.out.print(g[1][2]= 30);
		
		System.out.println("ver2");
		int a=1;
		g[0][0]= a; a++; g[0][1]= a; a++; g[0][2]= a; a++; 
		
		int b=10;
		g[1][0]= a*b; a++; g[1][1]= a*b; a++; g[1][2]= a*b; a++; 
		
		System.out.println(g[1][2]);
	}
}
