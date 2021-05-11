package ndb;

import java.util.ArrayList;

/*
숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요
1 10 5 8 7 6 4 3 2 9
 */
public class _002_selection_sort {
	public static void main (String[] arg) {
		int[] a = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int b;
		for(int i=0; i<a.length-1; i++) { // 8번 반복
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
