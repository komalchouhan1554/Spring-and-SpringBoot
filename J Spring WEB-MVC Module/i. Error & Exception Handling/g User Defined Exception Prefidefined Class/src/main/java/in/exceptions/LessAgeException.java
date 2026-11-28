package in.exceptions;

@SuppressWarnings("serial")
public class LessAgeException extends RuntimeException
{
	public LessAgeException()
	{
		super();
	}
	
	public LessAgeException(String message)
	{
		super(message);
	}

}
