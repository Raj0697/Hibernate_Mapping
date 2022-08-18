package flipkart;

public class cart 
{
	int id;
	String name;
	String products;
	int totalcost;
	
	Items item;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getproducts() {
		return products;
	}
	public void setproducts(String products) {
		this.products = products;
	}
	public int gettotalcost() {
		return totalcost;
	}
	public void setotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	
	public Items getitem()
	{
		return item;
	}
	public void setitem(Items item)
	{
		this.item = item;
	}

}
