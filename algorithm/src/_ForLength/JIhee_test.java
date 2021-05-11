package _ForLength;

import java.util.Arrays;

public class JIhee_test {
	public static void main(String[]args) {
		/*
		 Q1.   
		 1 2 3
		 4 5 6 
		 */
		
	int [][] x= new int [2][3];	
	//	[층][방]= {{0,1,2}{0,1,2}}
//	
//	System.out.println("ver1");
//	x[0][1]= 1;
//	x[0][1]= 2;
//	x[0][2]= 3;
//	
//	x[1][0]= 4;
//	x[1][1]= 5;
//	x[1][2]= 6;
//	
//	System.out.println(x[0][2]);
	
	
	System.out.println("ver2");
//	int e= 1;
////	
//	x[0][0] = e; e+=1;
//	x[0][1] = e; e+=1;
//	x[0][2] = e; e+=1;
//	x[1][0] = e; e+=1;
//	x[1][1] = e; e+=1;//4 
//	x[1][2] = e; e+=1;
//	
	
	System.out.println("ver3");
	
	for (int z=1; z<x.length; z++){x[0][z] = z; z+=1;}
	System.out.println(Arrays.deepToString(x));
	
	System.out.println("ver4");
	
	for(int a=0; a<x[0].length; a++) {System.out.print(x[0][a]+"\t");} System.out.println();
	for(int a=0; a<x[1].length; a++) {System.out.print(x[1][a]+"\t");}System.out.println();
	
	System.out.println("ver4-1");
	//값 증가 구문 
	int e= 1;//초기값을 설정해주
	for(int floor=0; floor<x.length; floor++) {
		for(int room=0; room<x[floor].length; room++) {
			{x[floor][room]=e++;}//값 증가 형식을 포구문안에 넣는다.
		}
	}
	
	//출력 구문
	//위와 같은 이중 포 구문을 가지고 오지만 
	for(int floor=0; floor<x.length; floor++) {
		for(int room=0; room<x[floor].length; room++) {
			{System.out.print(x[floor][room]+"\t");}
		}System.out.println();//이미 증가된 배열이므로 어떤 형태로 나올지만 정리한다.
	}
	
	
	
	
	}
}
