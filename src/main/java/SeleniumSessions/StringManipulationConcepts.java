package SeleniumSessions;

public class StringManipulationConcepts {

	
	public static void main(String[] args) {
		
		// WAP to get all digits separated from the above string
		// and also get the sum of all digits
		
		String s = "sd962jmjlsdjlajsd7sad23sxc9sc0saaw1scsd34";
		int sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			Character c = s.charAt(i);
			
			if (Character.isDigit(c)) {
				
				//Way 1
//				String digitString = Character.toString(c);
//				int digit = Integer.parseInt(digitString);
//				sum = sum + digit;
				
				
				//Way 2
				int digit = Character.getNumericValue(c);
				sum = sum + digit;
				
			//	System.out.print(c);
			}
		}
		
		System.out.println("Sum is : "+sum);
		
	}

}
