class Acount
{
	int no;
	String name;
	int balance;
	void insert(int no,String name,int balance)
	{
		this.no=no;
		this.name=name;
		this.balance=balance;
	}
	void deposit(int d)
	{
		balance+=d;
		System.out.println("Balance after depositing "+d+" is "+balance);
	}
	void withdraw(int w)
	{
		if(balance>w)
		{
			System.out.println("Withdrawl Allowed\n Amount ="+w);
			balance-=w;
	
		}
		else
		{
			System.out.println("Withdrawl Not Allowed\nInsufficient funds");
		}
	}
	void checkbalance()
	{
		System.out.println("Your Available balance = "+balance);
	}
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Account No. = "+no);
		System.out.println("Balance = "+balance);

	}
	public static void main(String args[])
	{
		Acount a=new Acount();
		a.insert(1,"Kinshuk Dewari",1000);
		a.deposit(100); 
		a.withdraw(100);
		a.checkbalance();
		a.display();
	}
}
