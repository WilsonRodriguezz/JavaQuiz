package exercise3;

public class OverloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double firstArray[] = overloadedArray(4, 5);
		double secondArray[] = overloadedArray(7,8,9);
		double thirdArray[] = overloadedArray(3.14159, 4747, 454, 4848454, 4 );
		
		showArrays(firstArray, secondArray, thirdArray);
	}
	
	private static double[] overloadedArray(double firstNumber, double secondNumber) {
		
		double array[] = new double[2];
		array[0] = firstNumber;
		array[1] = secondNumber;
		
	
		
		
		return array; 
	}
	
	private static double[] overloadedArray(double firstNumber, double secondNumber, double thirdNumber) {
		double array[] = new double[3];
		array[0] = firstNumber;
		array[1] = secondNumber;
		array[2] = thirdNumber;
		
		
		
	
		
		return array;
	}
	
	private static double[] overloadedArray(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber, double fithNumber) {
		double array[] = new double[5];
		array[0] = firstNumber;
		array[1] = secondNumber;
		array[2] = thirdNumber;
		array[3] = fourthNumber;
		array[4] = fithNumber;
		
		
		
		
		return array;
	}
	
	private static void showArrays(double firstArray[], double secondArray[], double thirdArray[]) {
     System.out.println("You just created an array with "+ firstArray.length +" elements, which are:" );
		
		for(int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
			
		}
		
		System.out.println("\nYou just created an array with "+ secondArray.length +" elements, which are:");
		
		for(int i = 0; i < secondArray.length; i++) {
			System.out.println(secondArray[i]);
		}
		
		System.out.println("\nYou just created an array with "+ thirdArray.length +" elements, which are:");
		
		for(int i = 0; i < thirdArray.length; i++) {
			System.out.println( thirdArray[i]);
		}
	}

}
