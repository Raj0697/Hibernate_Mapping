package flipkart;

public class Items 
{
	private int I_id;
	private String name;
	private int cost;
	
	cart carts;
	
	public void cart(){}
	
	public void cart(int I_id,String name,int cost)
	{
		this.I_id = I_id;
		this.name = name;
		this.cost = cost;
	}
	
	public int getI_id()
	{
		return I_id;
	}
	public String getname()
	{
		return name;
	}
	public int getcost()
	{
		return cost;
	}
	
	public void setI_id(int I_id)
	{
		this.I_id = I_id;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public void setcost(int cost)
	{
		this.cost = cost;
	}
	
	public cart getcarts()
	{
		return carts;
	}
	
	public void setcarts(cart carts)
	{
		this.carts = carts;
	}
	

}
