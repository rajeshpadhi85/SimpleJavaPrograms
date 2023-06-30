package arrayConcept;

		public class ArrayDivider {
		    public static void main(String[] args) {
		        int[] originalArray = {-1, 2, -3, 4, -5, 6};
		        int[] positiveArray;
		        int[] negativeArray;
		        
		        // Count the number of positive and negative elements
		        int positiveCount = 0;
		        int negativeCount = 0;
		        for (int i = 0; i < originalArray.length; i++) {
		            if (originalArray[i] >= 0) {
		                positiveCount++;
		            } else {
		                negativeCount++;	
		            }
		        }
		        
		        // Create the positive and negative arrays
		        positiveArray = new int[positiveCount];
		        negativeArray = new int[negativeCount];
		        
		        // Populate the positive and negative arrays
		        int positiveIndex = 0;
		        int negativeIndex = 0;
		        for (int i = 0; i < originalArray.length; i++) {
		            if (originalArray[i] >= 0) {
		                positiveArray[positiveIndex] = originalArray[i];
		                positiveIndex++;
		            } else {
		                negativeArray[negativeIndex] = originalArray[i];
		                negativeIndex++;
		            }
		        }
		        
		        // Print the positive array
		        System.out.print("Positive Array: ");
		        for (int i = 0; i < positiveArray.length; i++) {
		            System.out.print(positiveArray[i] + " ");
		        }
		        System.out.println();
		        
		        // Print the negative array
		        System.out.print("Negative Array: ");
		        for (int i = 0; i < negativeArray.length; i++) {
		            System.out.print(negativeArray[i] + " ");
		        }
		        System.out.println();
		    }
		}

