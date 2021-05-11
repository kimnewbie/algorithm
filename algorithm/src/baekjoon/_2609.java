package baekjoon;

import java.io.*;
import java.util.*;

/*
문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

예제 입력   
24 18

예제 출력   
6
72 
*/
public class _2609 { // 최대공약수와 최소공배수
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 읽어온 것을 공백을 기준으로 문자열을 분리해야해서
		
		br.close();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int d = gcd(a, b); // 최대공약수
		
		System.out.println(d);
		System.out.println(a * b / d);
	}
	
	//1-1. 최대공약수 재귀 방식
	/*
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		
		// GCD(a, b) = GCD(b, r)이므로 (r = a % b)
		return gcd(b, a%b);
	}
	*/
	//1-2. 최대공약수 반복문 방식
	
	public static int gcd(int a, int b) {
		
		//b가 0이 될 때까지 반복, 0이 되면 a자리에는 최대공약수가 되서 return a;
		while(b!=0) {
			int r = a % b; // 나머지를 구한뒤
			
			//GCD(a, b) = GCD(b, r)이므로 변환
			a = b;
			b = r;
		}
		return a;
	}
	
}
