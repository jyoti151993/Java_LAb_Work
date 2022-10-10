package utils;
import java.lang.Exception;

import customException.IncrementOutOfRangeException;
import customException.InvalidEmpIdException;
public class IncrementValidationRules {
	public static final double MIN_PER;
	public static final double MAX_PER;
	
	static {
		MIN_PER=5;
		MAX_PER=10;
		}
	
	public static void validateInc(double curInc) throws IncrementOutOfRangeException{
		if(curInc<MIN_PER )
	  throw new IncrementOutOfRangeException("Amount entered too is less for increment");
		if(curInc>MAX_PER)
			throw new IncrementOutOfRangeException("Amount entered is too high for increment");
		System.out.println("Increment is within the Slab");

	}

}
