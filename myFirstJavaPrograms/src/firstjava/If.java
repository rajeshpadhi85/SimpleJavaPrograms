package firstjava;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	if (true)
		System.out.println("Everything is fine");
		
		else 
		System.out.println ("Everything is not fine");		
		
		int a = 11;
		
		if (a == 10) 
			System.out.println("Correct value of A");
		else 
			System.out.println("Incorrect value of A");*/
		
		//0 TO 29 = Fail
		//30 to 49 = grade C
		//50 to 59 = grade B
		//60 and above = A
		
	/*	int marks = 95;
		if (marks <= 29) 
			System.out.println("Student is Failed");
		
		else if (marks >=30 && marks <=49)  
			System.out.println("Student passed with grad C");
		
		else if (marks >=50 && marks <=59) 
			System.out.println("Student passed with grade B");
		
		else 
			System.out.println("Student passed with garde A"); */
		
		
		// use of equal to (==) operator
		//int a = 15;
		
		/* if (a == 10)
		System.out.println("a value is 10");
		else if (a!=10)
		System.out.println("a value is 11"); */
		
		// use to or (||) operator
		
	/*	if (a==11 || a== 20)
		System.out.println("a value is 11 or 20");
		else System.out.println ("a value is not 11 or 20"); */
		int marks = 70;
		if (marks >= 35) {
			if (marks >= 60)
				System.out.println("Student passed with grade A");
			else if (marks >=50 && marks <=59)
				System.out.println("Student passed with grade B");
		
			else if (marks >=35 && marks <=49)
				System.out.println("Student passed with grade C");}
			
			else System.out.println("Student is failed");

	}

}
