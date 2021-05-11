package star;

/*
 
*****
 ***
  *
 ***
*****

 */

public class star_abs {
	public static void main(String[] args) {
		
		int n = 5;
		for(int i=0; i<n; i++) {
			// 공백 출력
			// 절대값 이용
			for(int j=0; j<n/2-Math.abs(i-(n/2)); j++) {
				System.out.print(" ");
			}
			// 별 출력
			for(int k=0; k < n-(n/2-Math.abs(n/2 - i))*2; k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
