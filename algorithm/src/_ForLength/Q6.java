package _ForLength;

public class Q6 {
	public static void main(String[]args) {
		/*
		 Q6.  
		1001 1002 1003
		2001 2002 2003
		 */
		
		int [][]x= new int [2][3];
		int data = 1;
		
		System.out.println("ver1");
		System.out.print((x[0][0]=1001)+"\t");
		System.out.print((x[0][1]=1002)+"\t");
		System.out.print((x[0][2]=1003)+"\t");
		System.out.println();
		System.out.print((x[1][0]=2001)+"\t");
		System.out.print((x[1][1]=2002)+"\t");
		System.out.print((x[1][2]=2003)+"\t");
		System.out.println();
		

		System.out.println("ver2");
//		x[0][0]=1000+data; data++; 	x[0][1]=1000+data; data++; 	x[0][2]=1000+data; data++; 
//		x[1][0]=2000+data; data++; 	x[1][1]=2000+data; data++; 	x[1][2]=2000+data; data++; 
		
		System.out.println("ver3");
		
		for(int a=0; a<x[0].length; a++){x[0][a]=1000+data; data++; }//이중for문으로 값설
		for(int a=0; a<x[0].length; a++){System.out.print(x[0][a]+"\t"); }
		System.out.println();
		data=1;
		for(int a=0; a<x[1].length; a++){x[1][a]=2000+data; data++; }//이중for문으로 값설
		for(int a=0; a<x[1].length; a++){System.out.print(x[1][a]+"\t"); }
		System.out.println();
	}
}
