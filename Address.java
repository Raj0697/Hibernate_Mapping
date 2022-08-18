package example;

public class Address 
{
	private int A_id;
	private String street;
	private String city;
	Employee emp;
	
	public Address()
	{}
	
	public Address(int A_id,String street,String city,Employee emp)
	{
		this.A_id = A_id;
		this.street = street;
		this.city = city;
		this.emp = emp;
	}
	
	int getA_id()
	{
		return A_id;
	}
	String getstreet()
	{
		return street;
	}
	String getcity()
	{
		return city;
	}
	
	void setA_id(int A_id)
	{
		this.A_id = A_id;
	}
	void setstreet(String street)
	{
		this.street = street;
	}
	void setcity(String city)
	{
		this.city = city;
	}
	
	Employee getemp()
	{
		return emp;
	}
	void setemp(Employee emp)
	{
		this.emp = emp;
	}

}
