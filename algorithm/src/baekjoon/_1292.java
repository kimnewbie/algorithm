package baekjoon;
 
import java.util.*;

/*
문제
동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.

이 문제는 다음과 같다. 
1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 
이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.

입력
첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1 ≤ A ≤ B ≤ 1,000)가 주어진다. 
즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.

출력
첫 줄에 구간에 속하는 숫자의 합을 출력한다.

예제 입력 
3 7

예제 출력 a
15
*/
public class _1292 {
	public static void main(String[] args) throws Exception { // 쉽게 푸는 문제
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 
		 int num = 1;
		 int count = 0;
		 
		 for(int i=0; i<1000; i++) {
			 arr.add(num);
			 count++; // 해당 숫자를 몇번이나 넣고 있는지 확인
			 if(num==count) { // 숫자가 숫자를 넣은 횟수가 같다면 (2이면 2번)
				 num++;
				 count = 0;
			 }
		 }
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 int sum = 0;
		 
		 for(int i = num1-1; i<num2; i++) { // i<=num2-1
			 sum +=arr.get(i);
		 }
		 System.out.println(sum);
		 
		 sc.close();
	}
}
