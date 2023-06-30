package firstjava;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("* ");     //squire star pattern
			}
			System.out.println();
		}
//**********************************************************************************		
		for(int i=1; i<=5; i++) {
			 for (int j=1; j<=i; j++) {
				 System.out.print("* ");   // increasing star pattern
			 }
			System.out.println(" ");
		}
//*********************************************************************************
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("* ");  // decreasing star pattern
			}
			System.out.println("");
		}  */
//**********************************************************************************		
	/*	for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("* ");  // pyramid of starts
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}  */
//**************************************************************************************
	/*	for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<5; j++) {
				System.out.print("* ");  // reverse of pyramid
			}
			for(int j=i; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}               */
//**************************************************************************************
	for(int i=1; i<5; i++) {
		for(int j=i; j<=5; j++) {
			System.out.print("  ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print("* ");  
		}
		for(int j=1; j<i; j++) {
			System.out.print("* ");
		}
		System.out.println();         // Diamond  of stars
	}
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("  ");
		}
		for(int j=i; j<=5; j++) {
			System.out.print("* ");  
		}
		for(int j=i; j<5; j++) {
			System.out.print("* ");
		}
		System.out.println();
	} 
	
	}

}
