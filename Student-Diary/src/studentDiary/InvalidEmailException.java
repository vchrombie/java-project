package studentDiary;

public class InvalidEmailException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailException() {
		super("Entered email is invalid");
	}
}
