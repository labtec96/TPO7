package Bank;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import javax.rmi.PortableRemoteObject;

import Client.Client;
import zad1.Bill;

public class Bank  extends PortableRemoteObject implements BankInterface
{
	Random r = new Random(); 
	HashMap<Client, List<Bill>> clientBill;
	String[] tabAdvertisement = {"thre for one, two for one"};
	AtomicInteger ai = new AtomicInteger(0);
	public Bank() throws RemoteException
	{
		clientBill = new HashMap<Client, List<Bill>>();
	}	
	
	public String registerClient(Client client) throws RemoteException
	{
		if (!clientBill.containsKey(client))
		{
			clientBill.put(client, new ArrayList<Bill>());
			client.setAccountNumber(ai.getAndAdd(1));
			return "Client register";
		}
		else
			return "Client already exists";
	}
	
	public boolean checkHaveEnoughMoney(Client client,double amount)
	{
		if (amount<client.getMoney())
			return true;
		return false;
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
				sumBills =sumBills+billIterator.next().getPrice();
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

	public void addMoney(Client client,double amount) throws RemoteException
	{
		client.setMoney(client.getMoney()+amount);
	}

	public boolean removeMoney(Client client,double amount) throws RemoteException
	{
		if (checkHaveEnoughMoney(client, amount))
		{
			client.setMoney(client.getMoney()-amount);
		}
		return false;
	}

}
