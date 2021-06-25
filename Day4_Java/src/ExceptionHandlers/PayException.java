package ExceptionHandlers;

public class PayException extends Exception {
	public PayException(String message)
	{
		super(message);
		System.out.println(message);
	}

}
