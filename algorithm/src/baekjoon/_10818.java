package baekjoon;

import java.io.*;
import java.util.*;

/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제
5
20 10 35 30 7

7 35
 */
public class _10818 { // 최소, 최대
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine().trim()); // 숫자 몇개를 입력할건지
		 
		int[] arr = new int[N];
		
		/*
		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		> 때문에 max를 가장 작은 값으로, min에는 가장 큰 값으로 초기화
		 */
		int max = Integer.MIN_VALUE; // -2147483647
		int min = Integer.MAX_VALUE; // 2147483647
		 
		//StringTokenizer st = new StringTokenizer(br.readLine(), " ");		
		StringTokenizer st = new StringTokenizer(br.readLine());		
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		bw.write("최소값 : " + min + " 최대값 : " + max);
		bw.flush();
		bw.close();
	}
}
/*
By starting out with smallest set to Integer.MAX_VALUE and largest set to Integer.
MIN_VALUE, they don't have to worry later about the special case 
where smallest and largest don't have a value yet. 
If the data I'm looking through has a 10 as the first value, 
then numbers[i]<smallest will be true (because 10 is < Integer.MAX_VALUE) 
and we'll update smallest to be 10. Similarly, 
numbers[i]>largest will be true because 10 is > Integer.MIN_VALUE and 
we'll update largest. And so on.

Of course, when doing this, you must ensure that you have at least one value 
in the data you're looking at. 
Otherwise, you end up with apocryphal numbers in smallest and largest.
 */
