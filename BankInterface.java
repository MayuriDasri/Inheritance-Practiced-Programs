package InheritancePrograms;

public interface BankInterface {

	public static final String accounttype1 = "Saving ";
	static String accounttype2 = "Current";
	
	public void createaccount();
	public void updateaccount();
	
	default void Message()
	{
		System.out.println("This is the RBI Bank");
	}
	
	static void Message1()
	{
		System.out.println("This is the static method ");
	}
}

class HDFC implements BankInterface
{

	@Override
	public void createaccount() {
		System.out.println("This is the create Account Method " + accounttype1 + " " + accounttype2);
		
	}

	@Override
	public void updateaccount() {
		System.out.println("This is the Update Account Method ");
	}
	
}
