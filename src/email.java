import java.util.Date;

public class email {
	
	public enum Priority{
		SI,NO;
		}
	
	public String from;
	public String subject;
	public Date date;
	public Priority priority;
	public String text;
}

