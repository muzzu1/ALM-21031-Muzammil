
public class findingvowels {

	public static void main(String[] args) {
		// FINDING VOWELS USING IF & ELSE
		
		char z='h';
		
		if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
			System.out.println(z+ " is a vowel ");
		else
			System.out.println(z+ " is not a vowel ");
		
		//USING TERENERY METHOD
		
		String x=(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')?"is a vowel":"is not a vowel";
		System.out.println(x=(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')?"is a vowel":"is not a vowel");
		
		// USING SWITCH/CASE METHOD //not completed
		
		switch('z')
		{
		case 'a':{
			System.out.println("is a vowel");
			break;
		}
			
				case 'e':{
					System.out.println("is a vowel");
					break;
					}
				case 'd':{
					System.out.println("is not a vowel");
					break;
				}
			
		}
		
	}
}
		
		
		
		
			
	


