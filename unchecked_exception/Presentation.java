package unchecked_exception;
public class Presentation {

	public static void main(String[] args) {
		
		
		Business b1=new Business();
		try {
			if(b1.isValidAadhar("2200 3589 3944")) {
				System.out.println("Valid Aadhar");
			}
		} catch (InvalidAadharNumberException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(b1.isValidAadhar("1200 3456 2345")) {
			System.out.println("Valid Aadhar");
		}
		}catch(InvalidAadharNumberException e){
			System.out.println(e.getMessage());
		}

	}

}
 
