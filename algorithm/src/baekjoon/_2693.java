package baekjoon;

import java.io.*;
import java.util.*;

/*
문제
배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.

배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 <= T <= 1,000)가 주어진다. 
각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다. 
이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.

출력
각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.

예제 입력 
4
1 2 3 4 5 6 7 8 9 1000
338 304 619 95 343 496 489 116 98 127
931 240 986 894 826 640 965 833 136 138
940 955 364 188 133 254 501 122 768 408

예제 출력  
8
489
931
768
*/
public class _2693 { //N번째 큰 수
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 줄 몇개인지
		int[] A = new int[10]; // A의 크기는 항상 10
		
		while(n-->0) { // while(variable-- > 0) == { variable--; + variable > 0; }
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken()); // 입력받은 값을 배열에 넣어주기
			}
			Arrays.sort(A); //오름차순으로 배열
			
			bw.write(A[7] + "\n"); //8번째 수 출력, 10개의 숫자중에 8번째수는 3번째로 큰 수 
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
