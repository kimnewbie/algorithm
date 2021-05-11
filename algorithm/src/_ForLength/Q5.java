package _ForLength;

public class Q5 {
	public static void main(String[]args) {
		/*
		 Q5.  
		1001 1002 1003
		1004 1005 1006
		 */
		
		int [][]x= new int [2][3];
		int data = 1;
		
		System.out.println("ver1");
		System.out.print((x[0][0]=1001)+"\t");
		System.out.print((x[0][1]=1002)+"\t");
		System.out.print((x[0][2]=1003)+"\t");
		System.out.println();
		System.out.print((x[1][0]=1004)+"\t");
		System.out.print((x[1][1]=1005)+"\t");
		System.out.print((x[1][2]=1006)+"\t");
		System.out.println();
		
		
		System.out.println("ver2");
//		x[0][0]=1000+data; data++; 	x[0][1]=1000+data; data++; 	x[0][2]=1000+data; data++; 
//		x[1][0]=1000+data; data++; 	x[1][1]=1000+data; data++; 	x[1][2]=1000+data; data++; 
		
		System.out.println("ver3");
		
		for(int a=0; a<x[0].length; a++){x[0][a]=1000+data; data++; }//이중for문으로 값설
		for(int a=0; a<x[0].length; a++){System.out.print(x[0][a]+"\t"); }
		System.out.println();
		for(int a=0; a<x[1].length; a++){x[1][a]=1000+data; data++; }//이중for문으로 값설
		for(int a=0; a<x[1].length; a++){System.out.print(x[1][a]+"\t"); }
		System.out.println();
		
		System.out.println("ver4");
		data=1;
		for(int floor=0; floor<x.length; floor++) {
			for( int room=0; room<x[floor].length; room++) {
				x[floor][room]=1000+data; data++;
			}
		}
		
		for(int floor=0; floor<x.length; floor++) {
			for( int room=0; room<x[floor].length; room++) {
				System.out.print(x[floor][room]+"\t");
			}System.out.println();
		}
		
	}
}
