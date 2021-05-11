package baekjoon;

import java.io.*;
import java.util.*;

/*
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 
4
1 3 5 7

예제 출력  
3
 
*/
public class _1978 { //소수찾기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine(); // 몇개 받을 건지
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		br.close();
		
		while(st.hasMoreTokens()) {
			
			//소수인경우 true, 아닌 경우 false
			boolean isPrimeNumber = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) { // 1인 경우 다음 반복문으로 (1은 소수가 아니기 때문에)
				continue;
			}
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrimeNumber = false; // 소수가 아니므로 false로 변경
					break;
				}
			}
			if(isPrimeNumber) { // 소수인경우 count +1 씩 증가
				count++;
			}
		}
		System.out.println(count);
	}
}
