package kodlamaio.hrms.core.utilities.randomCodeGenerator;

import java.util.Random;

public class RandomCodeGenerator {
	
	private String randomCode = "";
	private int codeLength = 5 ;
	
	public String createRandomCode() {
		
		Random randomNumber = new Random();
		
		
		for (int i = 0; i <= codeLength; i++) {
			int value = randomNumber.nextInt(10);
			randomCode = randomCode + String.valueOf(value);
			
		}
		
		
		return randomCode;
		
	}
}
