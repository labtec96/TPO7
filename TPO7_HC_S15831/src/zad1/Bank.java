package zad1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bank
{
	Random r = new Random(); 
	HashMap<Client, List<Bill>> clientBill;
	String[] tabAdvertisement = {"thre for one, two for one"};

	public Bank()
	{
		clientBill = new HashMap<Client, List<Bill>>();
	}

	public List<Bill> askForBills(Client client)
	{
		if (clientBill.containsKey(client))
		{
			return clientBill.get(client);
		}
		return null;
	}

	public double sumMyOrders(Client client)
	{
		if (clientBill.containsKey(client))
		{
			Iterator<Bill> billIterator = clientBill.get(client).iterator();
			double sumBills=0; 
			while (billIterator.hasNext())
			{
				sumBills +=billIterator.next().price;
			}
			return sumBills;
		}
		return 0.0;
	}
	public String randomAdvertisement()
	{
		int randomNumber = r.nextInt(tabAdvertisement.length);
		return tabAdvertisement[randomNumber];
	}
}
