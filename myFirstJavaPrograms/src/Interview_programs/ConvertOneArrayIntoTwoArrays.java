package Interview_programs;

public class ConvertOneArrayIntoTwoArrays {

	public static void main(String[] args) {
		
		int[] arr= {1,-5,7,-9,1,-3,8};
		int[] posetivearray;
		int[] negetivearray;
		int posetive=0;
		int negetive=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				posetive++;
			}else {
				negetive++;
			}
		}
		posetivearray=new int[posetive];
		negetivearray=new int[negetive];
		
		posetive=0;
		negetive=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				posetivearray[posetive]=arr[i];
				posetive++;
			}else {
				negetivearray[negetive]=arr[i];
				negetive++;
			}
		}
		System.out.print("posetive arrays are: ");
		for(int i=0;i<posetivearray.length;i++) {
			
			System.out.print(posetivearray[i]+",");
		}
		System.out.println();
		System.out.print("negetive arrays are ");
		for(int i=0;i<negetivearray.length;i++) {
			
			System.out.print(negetivearray[i]+",");
		}
	}

}
