package _ForLength;

public class For__practice {
	public static void main(String[] args) {

		System.out.println("Q1");

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		// 또는	 int [][] arr = new int [2][3];

		System.out.println("ver - 1 ");

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		System.out.println("ver - 2 ");

		int data = 0;

		arr[0][0] = data;
		arr[0][1] = data++;
		arr[0][2] = data++;

		arr[1][0] = data++;
		arr[1][1] = data++;
		arr[1][2] = data++;

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		System.out.println("ver - 3 ");

		for (int i = 0; i < arr.length; i++) {
			for (int a = 0; a < arr[0].length; a++) {

				arr[i][a] += data;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int a = 0; a < arr[0].length; a++) {

				System.out.print(arr[i][a] + "\t");
			}
			System.out.println();
		}

		System.out.println(
				"=================================================================================================");

		System.out.println("Q2");

		int[][] arr1 = { { 1, 2, 3 }, { 10, 20, 30 } };

		int data = 0;

		
		int[][] arr1 = new int[2][3];

		System.out.println("ver - 1 ");

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 10;
		arr[1][1] = 20;
		arr[1][2] = 30;

		System.out.println("ver - 2 ");

		int data = 1;

		arr[0][0] = data;
		arr[0][1] = data++;
		arr[0][2] = data++;

		
		arr[1][0] = data++;
		arr[1][1] = data++;
		arr[1][2] = data++;

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 10;
		arr[1][1] = 20;
		arr[1][2] = 30;

		System.out.println("ver - 3 ");


			
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int a = 0; a < arr1[0].length; a++) {

		
				if(i==0) {data += 1 ;}
				else if (i == 1) {data += 10;}
				
				
				System.out.print(arr1[i][a] + data + "\t");
			}data = 0;
			System.out.println();
		}

		System.out.println(
				"=================================================================================================");

		System.out.println("Q4");

		int[][] arr4 = { { 1, 2, 3,4,5 }, { 10, 9, 8,7,6 } };

		int data4 = 0;

		int[][] arr2 = new int[2][5];

		System.out.println("ver - 1 ");

		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[0][2] = 3;
		arr4[0][3] = 4;
		arr4[0][4] = 5;

		arr4[1][0] = 10;
		arr4[1][1] = 9;
		arr4[1][2] = 8;
		arr4[1][3] = 7;
		arr4[1][4] = 6;


		System.out.println("ver - 3 ");

		int data4 = 1;

		arr4[0][0] = data;
		arr4[0][1] = data++;
		arr4[0][2] = data++;
		arr4[0][3] = data++;
		arr4[0][4] = data++;

		
		arr4[1][0] = data++;
		arr4[1][1] = data++;
		arr4[1][2] = data++;
		arr4[0][2] = data++;
		arr4[0][2] = data++;


		System.out.println("ver - 3 ");

		for (int i = 0; i < arr2.length; i++) {
			for (int a = 0; a < arr2[0].length; a++) {

				if (i == 0) {
					data4 += 1;
				} else if (i == 1) {
					data4 -= 1;
				}

				System.out.print(arr2[i][a] + data4 + "\t");
			}
			data4 = 11;
			System.out.println();
		}

		System.out.println("Q5");

		int[][] arr5 = { { 1, 2, 3,4,5 }, { 10, 9, 8,7,6 } };

		int data5 = 1000;

		int[][] arr5 = new int[2][3];

		System.out.println("ver - 1 ");

		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[0][2] = 3;
		arr4[0][3] = 4;
		arr4[0][4] = 5;

		arr4[1][0] = 10;
		arr4[1][1] = 9;
		arr4[1][2] = 8;
		arr4[1][3] = 7;
		arr4[1][4] = 6;


		System.out.println("ver - 3 ");

		int data4 = 1;

		arr4[0][0] = data;
		arr4[0][1] = data++;
		arr4[0][2] = data++;
		arr4[0][3] = data++;
		arr4[0][4] = data++;

		
		arr4[1][0] = data++;
		arr4[1][1] = data++;
		arr4[1][2] = data++;
		arr4[0][2] = data++;
		arr4[0][2] = data++;


		System.out.println("ver - 3 ");

		for (int i = 0; i < arr5.length; i++) {
			for (int a = 0; a < arr5[0].length; a++) {

				arr5[i][a] = data5+=1;
				;
			}
		}

		for (int i = 0; i < arr5.length; i++) {
			for (int a = 0; a < arr5[0].length; a++) {

				System.out.print(arr5[i][a] + "\t");
			}
			System.out.println();
		}

		
		System.out.println("Q5");

		int[][] arr5 = { { 1, 2, 3,4,5 }, { 10, 9, 8,7,6 } };

		int[][] arr6 = new int[2][3];

		int data6 = 1000;

		System.out.println("ver - 1 ");

		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[0][2] = 3;
		arr4[0][3] = 4;
		arr4[0][4] = 5;

		arr4[1][0] = 10;
		arr4[1][1] = 9;
		arr4[1][2] = 8;
		arr4[1][3] = 7;
		arr4[1][4] = 6;


		System.out.println("ver - 3 ");

		int data4 = 1;

		arr4[0][0] = data;
		arr4[0][1] = data++;
		arr4[0][2] = data++;
		arr4[0][3] = data++;
		arr4[0][4] = data++;

		
		arr4[1][0] = data++;
		arr4[1][1] = data++;
		arr4[1][2] = data++;
		arr4[0][2] = data++;
		arr4[0][2] = data++;


		for (int i = 0; i < arr6.length; i++) {
			for (int a = 0; a < arr6[0].length; a++) {

				if (i == 0 || i == 1) {
					data6 += 1;
				}

				arr6[i][a] += data6;

				System.out.print(arr6[i][a] + "\t");
			}
			;
			data6 = 2000;

			System.out.println();
		}


		System.out.println("Q6");

		int[][] arr5 = { { 1, 2, 3,4,5 }, { 10, 9, 8,7,6 } };

		int[][] arr7 = new int[2][5];

		int data7 = 0;

		System.out.println("ver - 1 ");

		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[0][2] = 3;
		arr4[0][3] = 4;
		arr4[0][4] = 5;

		arr4[1][0] = 10;
		arr4[1][1] = 9;
		arr4[1][2] = 8;
		arr4[1][3] = 7;
		arr4[1][4] = 6;


		System.out.println("ver - 3 ");

		int data4 = 1;

		arr4[0][0] = data;
		arr4[0][1] = data++;
		arr4[0][2] = data++;
		arr4[0][3] = data++;
		arr4[0][4] = data++;

		
		arr4[1][0] = data++;
		arr4[1][1] = data++;
		arr4[1][2] = data++;
		arr4[0][2] = data++;
		arr4[0][2] = data++;


		for (int i = 0; i < arr7.length; i++) {
			for (int a = 0; a < arr7[0].length; a++) {

				if (i == 0) {
					data7 += 10;
				} else if (i == 1) {

					data7 += 1;
				}

				arr7[i][a] += data7;

				System.out.print(arr7[i][a] + "\t");
			}
			;
			data7 = 50;

			System.out.println();
//		}

	}

}
