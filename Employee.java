package example;

public class Employee 
{
	int id;
	String name;
	
	Address Addr;
	
	int getid()
	{
		return id;
	}
	String getname()
	{
		return name;
	}
	
	void setid(int id)
	{
		this.id = id;
	}
	void setname(String name)
	{
		this.name = name;
	}
	
	Address getAddr()
	{
		return Addr;
	}
	void setAddr(Address Addr)
	{
		this.Addr = Addr;
	}

}
