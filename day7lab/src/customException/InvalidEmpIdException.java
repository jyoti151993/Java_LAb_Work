package customException;

@SuppressWarnings("serial")
public class InvalidEmpIdException extends Exception{
	
	public InvalidEmpIdException(String message) {
		super(message);
		
}
}
