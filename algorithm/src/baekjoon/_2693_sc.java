package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2693_sc {
	 public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      //https://blog.naver.com/aeae_1/222157869945
	      
	      Scanner sc = new Scanner (System.in);
	      
	      int t = sc.nextInt();
	      //ArrayList<Integer> arr = new ArrayList<>();
	      for(int i=0; i<t; i++) {
	         ArrayList<Integer> arr = new ArrayList<>();
	         for(int j=0; j<10; j++) {
	            arr.add(sc.nextInt());	            
	         }	         
	         Collections.sort(arr);
	         
	         System.out.println(arr.get(7));
	      }
	   }
}