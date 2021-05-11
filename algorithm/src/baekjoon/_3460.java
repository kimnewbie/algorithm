package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
문제
양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 
최하위 비트(least significant bit, lsb)의 위치는 0이다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 10^6)

출력
각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.​

예제 입력
1  
13​

예제출력
0 2 3
*/
public class _3460 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		// String s = br.readLine();
		// int s = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			int decimal = Integer.parseInt(br.readLine());
			//System.out.println("decimal : " + decimal); //13
			
			// Integet.toString(int i, int radix)
			String binary = Integer.toString(decimal, 2); // 2진수로
			//System.out.println("binary : "+binary); //1101
			
			String binArr[] = binary.split(""); // 공백마다 데이터 끊어서 배열에 넣음
			
			for(int j=binArr.length-1; j>=0; j--) {
				//System.out.println("binArr : " + binArr[j]);
				if(binArr[j].equals("1")) { // 자릿수라 1인 것을 찾아내야해
					
					System.out.print(binArr.length-1-j+" ");
				}
			}
			System.out.println();
		}
		br.close();
	}
}
