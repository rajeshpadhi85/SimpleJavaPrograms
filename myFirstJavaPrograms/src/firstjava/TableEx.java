package firstjava;

public class TableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int table=19;
		for(int i=1; i<=10; i++) {
			System.out.println(table*i);   
		}   */
		for(int i=1; i<=10; i++) {
			if(i==6 || i==9) {
				continue;
			}
			System.out.println(i);   // skip a number from the continuous run
		}

	}

}
