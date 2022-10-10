package utils;
import java.lang.Exception;

import customException.InvalidEmpIdException;
public class EmpIdValidationRules {
	public static final int MIN_ID;
	public static final int MAX_ID;
	
	static {
		MIN_ID=0;
		MAX_ID=51;
	}
	
	
	// add static method for emp id validation
	public static void validateId(int curntId) throws InvalidEmpIdException {
		if(curntId <MIN_ID)
			throw new InvalidEmpIdException("Invalid ID , try again");
		if(curntId >=MAX_ID)
			throw new InvalidEmpIdException("Invalid ID , try again");
		System.out.println("VALID ID ");
	}

	
	}
