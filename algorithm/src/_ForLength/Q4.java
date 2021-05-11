package _ForLength;

public class Q4 {
	public static void main(String[]args) {
		
		/*
		 Q4.   
		1 2 3 4 5
		10 9 8 7 6
		 */
		int [][] x = new int [2][5];
		
		int data = 1;
		
		System.out.println("ver1");
		System.out.print((x[0][0]=1)+"\t");
		System.out.print((x[0][1]=2)+"\t");
		System.out.print((x[0][2]=3)+"\t");
		System.out.print((x[0][3]=4)+"\t");
		System.out.print((x[0][4]=5)+"\t");
		System.out.println();
		System.out.print((x[1][0]=10)+"\t");
		System.out.print((x[1][1]=9)+"\t");
		System.out.print((x[1][2]=8)+"\t");
		System.out.print((x[1][3]=7)+"\t");
		System.out.print((x[1][4]=6)+"\t");
		System.err.println();
		
		System.out.println();
		System.out.println("ver2");
		//0층 
//		x[0][0]=data; data++; x[0][1]=data; data++; x[0][2]=data; data++; x[0][3]=data; data++; x[0][4]=data; data++;
//		//1층 
//		int meta = 10;
//		x[1][0]=meta;meta--;  x[1][1]=meta;meta--;  x[1][2]=meta;meta--;  x[1][3]=meta;meta--;  x[1][4]=meta;meta--;
		
		System.out.println("ver3");
		for(int a=0; a<x[0].length; a++){x[0][a]=data; data++;}//이중 for 구문으로 증가값설정 
		for(int a=0; a<x[0].length; a++){System.out.print((x[0][a])+"\t");}//이중 for 구문으로 배열 출력 
		System.out.println();
		data = 10;
		for(int a=0; a<x[1].length; a++){x[1][a]=data; data--;}//이중 for 구문으로 증가값설정 
		for(int a=0; a<x[1].length; a++){System.out.print((x[1][a])+"\t");}//이중 for 구문으로 배열 출력 
//		
//		
		
		
	}
}
