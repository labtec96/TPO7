package Bank;

import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;

public class MainBank
{

	public static void main(String[] args) throws RemoteException
	{
		Bank bank = new Bank();
		createObject(bank);
	}


	public static void createObject(Bank ref)
	{
		try
		{
			Context ctx = new InitialContext();
			ctx.rebind("BankService", ref);
			System.out.println("server star Bank");
		} catch (Exception exc)
		{
			exc.printStackTrace();
		}
	}

}
