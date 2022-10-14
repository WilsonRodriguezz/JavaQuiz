package excercise1;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Test {

private static int correctAnswers;  //private int to keep track of correct answers.
	
	private static void simulateQuestion(int questionNumber){
		
		//if statement to display the correct question based on the for loop in the inputAnswerMethod()
		if(questionNumber == 0){ 
			
			JOptionPane.showMessageDialog(null, "What is the most restrictive access modifier: \nA. Default access modifier\nB. Private\nC. Protected\nD. Public");
			
			
		}
		else if(questionNumber == 1) {
			JOptionPane.showMessageDialog(null, "How are object's properties known: \nA. Features \nB. Methods \nC. Data fields \nD. Classes"); 
			
		}
		else if(questionNumber == 2) {
			JOptionPane.showMessageDialog(null, "Double can be promoted to: \nA. Int, float, long \nB. String, char \nC. Short, byte, int \nD. None of the above");
		
		}
		else if(questionNumber == 3) {
			JOptionPane.showMessageDialog(null, "What are classes: \nA. A collection of related objects \nB. A collection of related methods \nC. Related fields \nD. None of the above"); 
	
		}
		else {
			JOptionPane.showMessageDialog(null, "Which of the following is a Java package: \nA. java.io \nB. java.lang \nC. java.awt.event \nD. All of them"); 
			
		}
	}
	
	private static String checkAnswer(int seleccion, int questionNumber){ //parameters work to mark an answer as correct or incorrect depending on the number of the question
		if (questionNumber == 1) {
			
			switch(seleccion) {
			case 1: //correct Answer B
				correctAnswers++;
				return "correct";
			default:
				return "incorrect";
			}
			
		}
		else if(questionNumber == 2){
			switch(seleccion) {
			case 2: //correct Answer C
				correctAnswers++;
				return "correct";
			default:
				return "incorrect";
			}
		}
		else if(questionNumber == 3){
			switch(seleccion) {
			case 3: //correct Answer D
				correctAnswers++;
				return "correct";
			default:
				return "incorrect";
			}
		}
		else if(questionNumber == 4){
			switch(seleccion) {
			case 0: //correct Answer A
				correctAnswers++;
				return "correct";
			default:
				return "incorrect";
			}
		}
		else {
			switch(seleccion) {
			case 3: //correct Answer D
				correctAnswers++;
				return "correct";
			default:
				return "incorrect";
			}
		}
		
	}
	
	private static String generateMessage(String check) { //parameter works to identify if an answer was marked as correct or incorrect and send a message based on that
		SecureRandom random = new SecureRandom(); //creation of the secure random object
		if(check == "correct") {
			switch ( random.nextInt( 5 ) )
			{
			case 0:
				return( "Very good!" );
			case 1:
				return("good job!");
			case 2:
				return("Well done");
			case 3:
				return("Nice!");
			default:
			return("Congratulations!");	
			}
		}
		else {
			switch ( random.nextInt( 5 ) )
			{
			case 0:
				return( "Sorry. Keep trying!" );
			case 1:
				return("you were wrong, but don't give up!");
			case 2:
				return("Come on, you'll get it next time");
			case 3:
				return("Wrong answer");
			default:
			return("I'm sorry, try it next time");	
			}
		}
	}
	
	public static void inputAnswer() {
		
		
		int verificationVar = 1;
		for(int i = 0; i <= 4; i++) {	
			simulateQuestion(i);
			int seleccion1 = JOptionPane.showOptionDialog( null, "Choose an answer" , "Question " + (i + 1),JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "A", "B", "C", "D"},"B");
			JOptionPane.showMessageDialog(null, generateMessage(checkAnswer(seleccion1, verificationVar )));
			verificationVar++;
		
		}
		JOptionPane.showMessageDialog(null, "The total number of correct answers is: " + correctAnswers);
		
		double localCorrectAnswers = correctAnswers; //convert global int correctAnswers to local double localCorrectAnswers to perform the percentage task into the if statement
		
		if (localCorrectAnswers == 0.0) {
		
			JOptionPane.showMessageDialog(null, "The percentage of correct answers is " + localCorrectAnswers + "%");
		}
		else {
			JOptionPane.showMessageDialog(null, "The percentage of correct answers is " + ((localCorrectAnswers/5)*100) + "%");
		}
		
	
	}
	
}
