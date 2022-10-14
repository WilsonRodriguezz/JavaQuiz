package exercise2;
import java.security.SecureRandom;

public class Lotto {

	private int lottoArray[] = new int[3];
	
	public Lotto() {
		SecureRandom randomInt = new SecureRandom();
		int firstInteger = randomInt.nextInt(9) + 1 ;
		int secondInteger = randomInt.nextInt(9) + 1;
		int thirdInteger = randomInt.nextInt(9) + 1;
		lottoArray [0] = firstInteger;
		lottoArray [1] = secondInteger;
		lottoArray [2] = thirdInteger;
	}
	
	public int[] getLottoArray() {
		return  lottoArray;
	}
	
}
