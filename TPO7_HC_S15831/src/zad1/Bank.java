package zad1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank 
{
	HashMap<Client, Bill> clientBill; 
	public Bank()
	{
		clientBill = new HashMap<Client, Bill>();
	}
}
