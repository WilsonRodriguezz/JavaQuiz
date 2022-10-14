package exercise2;
import javax.swing.JOptionPane;

public class LottoDriver {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int prediction = recollectDataFromUser(); //call first method to get data from the user
		int i = 1;
		int sumOfLottoItems;
		do {
			
			Lotto test1 = new Lotto(); //creationOfLottoObject
			int [] arrayVar = test1.getLottoArray();
		
			sumOfLottoItems = arrayVar[0] + arrayVar[1] + arrayVar[2]; 
		
			if(prediction != sumOfLottoItems) {
			String message = String.format("Attempt Number %d.%n%nThe numbers you get are: %d, %d, %d.%nThe prediction you made was: %d.%nThe result of the sum is: %d.%nYou did not win, you keep playing.", i,arrayVar[0],arrayVar[1],arrayVar[2], prediction, sumOfLottoItems);
			JOptionPane.showMessageDialog(null, message);
			}
			else {
			String message = String.format("Attempt Number %d.%n%nThe numbers you get are: %d, %d, %d.%nThe prediction you made was: %d.%nThe result of the sum is: %d.%nYou won. Congratulations!", i,arrayVar[0],arrayVar[1],arrayVar[2], prediction, sumOfLottoItems);
			JOptionPane.showMessageDialog(null, message);
			}
		
			i++;
		
			}while(prediction != sumOfLottoItems && i <= 5 );
		
		if (prediction != sumOfLottoItems) {
			JOptionPane.showMessageDialog(null,"Game Over\n\nYou lose. You spend all your tries.\nThanks for playing.");
		}
		else {
			JOptionPane.showMessageDialog(null,"Thanks for playing.");
		}
		
	}
	
	private static int recollectDataFromUser() {
		int numberPrediction = 0; //Declare variable to store the prediction of the user
		
		String name = JOptionPane.showInputDialog(null, "Please insert your name: ");
		
		JOptionPane.showMessageDialog(null, "Hi " + name + "\nWelcome to our lotto game\nTo know the rules press 'OK'");
		
		JOptionPane.showMessageDialog(null, "The rules are simple: \n1. Provide a number between 3 and 27.\n2. A random number generator will provide 3 numbers, if the addition of those numbers is equal to the one you chose you win.\n3. You'll have 5 opportunities to generate random number combinations to try to win. \n4. After 5 tries you lose.");
		
		
		
		while(numberPrediction < 3 || numberPrediction > 27 ){
			
					try {
						try {
			
							int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a number between 3 and 27: "));
							numberPrediction = number;
						
							if (numberPrediction > 27 || numberPrediction < 3 ) {
							
							throw new IncorrectNumberException();
							}
							}
						catch(IncorrectNumberException e){
						JOptionPane.showMessageDialog(null, e.getMessage());
						}
					}
					
						catch(Exception e) {
							JOptionPane.showMessageDialog(null, "wrong data type");
						}
						
					
					
				
			}
	
		
		return numberPrediction;
	}

	

}
