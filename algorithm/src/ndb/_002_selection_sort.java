package ndb;

import java.util.ArrayList;

/*
���ڵ��� ������������ �����ϴ� ���α׷��� �ۼ��ϼ���
1 10 5 8 7 6 4 3 2 9
 */
public class _002_selection_sort {
	public static void main (String[] arg) {
		int[] a = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int b;
		for(int i=0; i<a.length-1; i++) { // 8�� �ݺ�
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
