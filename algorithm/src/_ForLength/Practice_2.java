package _ForLength;

public class Practice_2 {
public static void main(String[] args) {
	
	
	
	int[][] arr8 = new int[2][3];

	 int data8 = 10;
	//		System.out.println("ver - 1 ");

//		arr4[0][0] = 1;
//		arr4[0][1] = 2;
//		arr4[0][2] = 3;
//		arr4[0][3] = 4;
//		arr4[0][4] = 5;

//		arr4[1][0] = 10;
//		arr4[1][1] = 9;
//		arr4[1][2] = 8;
//		arr4[1][3] = 7;
//		arr4[1][4] = 6;

//
//		System.out.println("ver - 3 ");
//
//		int data4 = 1;
//
//		arr4[0][0] = data;
//		arr4[0][1] = data++;
//		arr4[0][2] = data++;
//		arr4[0][3] = data++;
//		arr4[0][4] = data++;
//
//		
//		arr4[1][0] = data++;
//		arr4[1][1] = data++;
//		arr4[1][2] = data++;
//		arr4[0][2] = data++;
//		arr4[0][2] = data++;
//

		for (int i = 0; i < arr8.length; i++) {
			for (int a = 0; a < arr8[0].length; a++) {

				if(i== 0) {
					data8+=1;
				}
				else if(i == 1) {
					data8+=1;
				}
				arr8[i][a] += data8;

				System.out.print("floor" + arr8[i][a] + "\t");
			}
			;
			data8 = 20;

			System.out.println();
		}
	

		
		
		int[][] arr9 = new int[2][3];

		 int data9 = 0;
		
		
		
		
		
		for (int i = 0; i < arr9.length; i++) {
			for (int a = 0; a < arr9[0].length; a++) {

					data9+=1;
				
				arr9[i][a] += data9;

				System.out.print("ver-" + arr9[i][a] + "\t");
			}
			;
			
			System.out.println();
		}


		
		
		int[][] arr10 = new int[2][3];

		 int data10 = 0;
		
		
		
		
		
		for (int i = 0; i < arr10.length; i++) {
			for (int a = 0; a < arr10[0].length; a++) {

				
				
				if(i==0) {
					data10 += 1;
				}
				else if (i == 1) {
					data10 *=10;
				}
				
				
				
				
					data9+=1;
				
				arr10[i][a] += data10;

				System.out.print(arr10[i][a] + "\t");
			}
			; data10=10;
			
			System.out.println();
		}

		
		
		
		
		float[][] arr11 = new float[3][3];

		 float data11 = 1;
		
		
		
		
		
		for (int i = 0; i < arr11.length; i++) {
			for (int a = 0; a < arr11[0].length; a++) {

					data11+=0.1f;
				
				arr11[i][a] += data11;

				System.out.print( String.format("%.1f",arr11[i][a]) + "f\t");
			}
			;
			
			System.out.println();
		}

		
		float[][] arr12 = new float[2][3];

		 float data12 = 10;
		
		
		
		
		
		for (int i = 0; i < arr12.length; i++) {
			for (int a = 0; a < arr12[0].length; a++) {

					data12+=0.1f;
				
				arr12[i][a] += data12;

				System.out.print( String.format("%.1f",arr12[i][a]) + "f\t");
			}
			;
			
			System.out.println();
		}

		
		float[][] arr13 = new float[2][3];

		 float data13 = 1.0f;
		
		
		
		
		
		for (int i = 0; i < arr13.length; i++) {
			for (int a = 0; a < arr13[0].length; a++) {

				
				
					data13+=0.1f;
				
				arr13[i][a] += data13;

				System.out.print( String.format("%.1f",arr13[i][a]) + "f\t");
			}
			;data13=11.0f;
			
			System.out.println();
		}
		
		
		
		
		float[][] arr14 = new float[2][3];

		 float data14 = 1.0f;
		
		
		
		
		
		for (int i = 0; i < arr14.length; i++) {
			for (int a = 0; a < arr14[0].length; a++) {

				
				
					data14+=0.001f;
				
				arr14[i][a] += data14;

				System.out.print( String.format("%.3f",arr14[i][a]) + "f\t");
			}
			;
			
			System.out.println();
		}
		
		System.out.println("=============================");

		
		
	
	System.out.println("Q15");	
		
		for(int a = 1; a<4 ; a++)
		{for(int i = 0; i<a; i++)  //3��
		{System.out.print("*" + "\t");}System.out.println();}
	
		System.out.println("Q16");		
		
		for(int a = 3; a>0 ; a--)
		{for(int i = 0; i<a; i++)  //3��
		{System.out.print("*" + "\t");}System.out.println();}
	

		
		
		for(char i = 'a'; i>'d' ; i++)
		{for(int a = 'a'; a<i; i++)  //3��
		{System.out.print(a + "\t");}System.out.println();}

		
		
		
		char[][] arr17 = new char[2][3];

		
		

		 char data17 = 'a';
		
		
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int a = 0; a < i; a++) {

				
				
					++data17;
				
				arr17[i][a] += data17;

				System.out.print( arr17[i][a] + "\t");
			}
			;
			
			System.out.println();
		}
	
	
	
	
}
}
