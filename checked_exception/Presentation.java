package checked_exception;
public class Presentation{

	public static void main(String[] args){

		Business b1 = new Business();
		try{
			if(b1.validnumber("8984682345")){
				System.out.println("Okay");
			}
		}
		catch (NumberNotFoundException e){
			System.out.println(e.getMessage());

		}
		// try{
		// 	if(b1.validnumber("7949388799")){
		// 		System.out.println("Okay");
		// 	}
		// }
		// catch (NumberNotFoundException e){
		// 	System.out.println(e.getMessage());

		// }
	}
}