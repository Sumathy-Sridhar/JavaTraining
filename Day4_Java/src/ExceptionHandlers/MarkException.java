package ExceptionHandlers;

public class MarkException extends Exception{
	public MarkException(String message)
	{
		super(message);
		System.out.println(message);
	}

}
