package kakao;

import java.util.Scanner;

public class test2 {
	
	private static final String[] words = 
	    {
	        "zero",
	        "one",
	        "two",
	        "three",
	        "four",
	        "five",
	        "six",
	        "seven",
	        "eight",
	        "nine"
	    } ;
	
	private static final int[] numbers = 
	    {
	        0,1,2,3,4,5,6,7,8,9
	    } ;
	public static void main(String[] args) {
		String s= "";
		Scanner sc = new Scanner(System.in);
		
        String result = "";
        s = sc.next();
        
        for(int i=0; i<words.length; i++){
            if(s.contains(words[i])){
                result = s.replace(words[i], 
                    String.valueOf(numbers[i]));
                s = result;
                }
        } 
        
        int answer = 0;
        answer = Integer.parseInt(result);
         //answer = Integer.parseInt(result.substring(0,1));
        System.out.println(answer);
    }
		
}
