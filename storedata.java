package flipkart;

import java.util.Iterator;
 
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.Session;


public class storedata 
{
	public static void main(String args[])
	{
		try
		{
			
			Configuration cfg = new Configuration();
			cfg.configure("item.cfg.xml");
			SessionFactory fact = cfg.buildSessionFactory();
			Session ses = fact.openSession();
			Transaction t = ses.beginTransaction();
			
			//cart objects
			cart ct = new cart();
			ct.setid(101);
			ct.setname("raj");
			ct.setproducts("milk");
			ct.setotalcost(3000);
			
			//items objects
			Items it = new Items();
			it.setI_id(201);
			it.setname("ammy");
			it.setcost(400);
			
			//using carts objects
			ct.setitem(it);
			
			//using items objects
			it.setcarts(ct);
			//persisting the object
			ses.persist(ct);
			ses.persist(it);
			
			t.commit();
			System.out.println("successfully saved");
			String s = "from cart";
			Query q = ses.createQuery(s);
			List l = (List) q.list();
			for(Iterator i=((java.util.List) l).iterator(); i.hasNext();)
			{
				cart c2 = (cart)i.next();
				System.out.println(c2.getid());
				System.out.println(c2.getname());
				System.out.println(c2.getproducts());
				System.out.println(c2.gettotalcost());
				
				Items i2 = c2.getitem();
				System.out.println(i2.getI_id());
				System.out.println(i2.getname());
				System.out.println(i2.getcost());
				
			}
			ses.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
