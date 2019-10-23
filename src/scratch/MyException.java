package scratch;

/**
 *
 * @author thor
 */
public class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
		String retVal;
		retVal = "Dogname too rare";
		return retVal;
	}

	
	
}
