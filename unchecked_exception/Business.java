package unchecked_exception;
public class Business{

	public boolean isValidAadhar(String s) throws InvalidAadharNumberException{

		 if(s != null && s.matches("[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}")){
		 	return true;
		 }
		 else{
		 	throw new InvalidAadharNumberException("You have entered Invalid aadhar number");
		 }
    }
}

