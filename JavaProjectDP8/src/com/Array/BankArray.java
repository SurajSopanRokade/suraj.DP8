package com.Array;

public class BankArray {
	String bankname, address, Ifscode;
	Account account[];
	
	BankArray ()
	{
		bankname="";
		address="";
		Ifscode="";
		
	}
	BankArray (String bankname, String address, String Ifscode, Account account [])
	{
		
		this.bankname=bankname;
		this.address=address;
		this.Ifscode=Ifscode;
		this.account=account;
	}
	public void setBankName(String bankname)
	{
		this.bankname=bankname;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setIfscode(String Ifscode)
	{
		this.Ifscode=Ifscode;
	}
	public String getBankname()
	{
		return bankname; 
	}
	public String getAddress()
	{
		return address;
	}
	public String getIfscode()
	{
		return Ifscode;
	}
	public void setAccount( Account account [])
	{
		this.account=account;
	}
	public Account [] getAccount()
	{
		return account;
	}
	public String toString()
	{
		return "Bank name" + bankname + "Address" + address + "Ifscode" + Ifscode; 
	}
	public void printAccount()
	{
		for (int i=0; i<account.length; i++)
		{
			System.out.println(account[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accArr[]=new Account[3];
		accArr[0]=new Account("Arti", 89000, 101);
		accArr[1]=new Account("pooja", 65000, 102);
		accArr[2]=new Account("Leena", 45000, 103);
		
		BankArray obj=new BankArray("Deccan", "pune","sbi1234", accArr );
		System.out.println(obj);
		obj.printAccount();
		
		
	}

}
