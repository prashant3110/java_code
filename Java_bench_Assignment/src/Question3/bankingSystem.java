package Question3;

public class bankingSystem {
	
	public void transaction(String n) throws UnsupportedTransactionException
	{
		String s = n;
		switch(s)
		{
		case "Credit" : System.out.println("Credit");
					break;
		case "Debit" : System.out.println("Debit");
					break;
		case "Balance Inquiry" : System.out.println("Balance Inquiry");
					break;
		case "Pin Change" : System.out.println("Pin Change");
					break;
		default : throw new UnsupportedTransactionException(s);		
		}
	}
	
	class UnsupportedTransactionException extends Exception
	{
		private String n;
		public UnsupportedTransactionException(String n) {
			this.n = n;
		}
		public void execute()
		{
			System.out.println(n+" is Invalid Transaction");
		}
	}
	
	
	public static void main(String args[]) throws UnsupportedTransactionException
	{
		try {
		bankingSystem b1 = new bankingSystem();
		b1.transaction("Credit");
		b1.transaction("Debit");
		b1.transaction("Balance Inquiry");
		b1.transaction("Pin Change");
		b1.transaction("Withdraw");
		
		}
		
		catch(UnsupportedTransactionException e)
		{
			e.execute();
		}
	}
}
