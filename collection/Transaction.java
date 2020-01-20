package collection;
import java.util.ArrayList;

class Customer
{	
	private ArrayList<Double>transactions;
	private ArrayList<String> names;
	Customer(String name,double initialamount)
	{
		this.names=new ArrayList<String>();
		this.transactions=new ArrayList<Double>();
		addTransaction(initialamount);
		addName(name);
	}
	//storing transactions in a separate array list of type double
	public void addTransaction(double amount)
	{
		this.transactions.add(amount);
	}
	//storing transactions in a separate array list of type String
	public void addName(String c_name)
	{
		this.names.add(c_name);
	}
	public ArrayList<String>getname()
	{
		return names;	
	}
	public ArrayList<Double>getTransactions()
	{
		return transactions;
	}
	
}
public class Transaction
{
	public static void main(String args[])
	{
		//adding customers
		ArrayList<Customer>customers=new ArrayList<Customer>();
		Customer obj1=new Customer("john",20000D);
		Customer obj2=new Customer("tim",15000D);
		obj1.addTransaction(30000d);
		obj1.addTransaction(50000d);
		obj2.addTransaction(20000d);
		customers.add(obj1);
		customers.add(obj2);
		//printing transactions
		for(int i=0;i<customers.size();i++)
		{
			Customer customer=customers.get(i);
			for(int k=0;k<customer.getname().size();k++)
			{
				String customer_name=customer.getname().get(k);
				System.out.println(customer_name);
			}
			for(int j=0;j<customer.getTransactions().size();j++)
			{
				Double transaction=customer.getTransactions().get(j);
				System.out.println(transaction);
			}
		}
	}
	
}
