package star;

public class star005 {
	public static void main(String[] args) {
		
		/*
		    *
		   ***
		  *****
		 *******
		*********
		*/
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) { // 1,3,5,7,9
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		
		    *
		   ***
		  *****
		 *******
		
		*/
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
	}
}
