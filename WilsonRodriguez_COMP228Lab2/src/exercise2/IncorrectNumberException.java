package exercise2;


public class IncorrectNumberException extends Exception{
	
	
	public IncorrectNumberException(){
		super("You chose an invalid number or data type. Please Insert a number between 3 and 27");
	}
	
	
}