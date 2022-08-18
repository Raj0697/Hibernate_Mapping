package example;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class storedata
{
	public static void main(String args[])
	{
		int ch = 0;
		try
		{
			
			Scanner sc = new Scanner(System.in);
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory fact = cfg.buildSessionFactory();
			Session session = fact.openSession();
			int choice=0;
			int id,A_id;
			String name;
			String street,city;
			
			do
			{
				System.out.println("============1.INSERT\t==== 2.DISPLAY\t======= 3.EXIT===============");
				System.out.println("Enter the choice : ");
				ch=sc.nextInt();
				
				switch(ch)
				{
					case 1: 	Session sess = fact.openSession();
								Transaction t = sess.beginTransaction();
					
								System.out.println("\n==========HIBERNATE ONE-TO-ONE MAPPING==============\n\n");
								System.out.println("===========EMPLOYEE DETAILS================\n");
								System.out.print("Enter the id : ");
								id=sc.nextInt();
								System.out.print("\nEnter the name : ");
								name=sc.next();
								
								Employee e1 = new Employee();
								e1.setid(id);
								e1.setname(name);
							
								
								System.out.println("\n===========ADDRESS DETAILS=============\n");
								System.out.print("Enter the id : ");
								A_id=sc.nextInt();
								
								System.out.print("\nEnter the street : ");
								street=sc.next();
								
								System.out.println("\nEnter the city : ");
								city=sc.next();
								
								Address address1 = new Address();
								address1.setA_id(A_id);
								address1.setstreet(street);
								address1.setcity(city);
								
								e1.setAddr(address1);
								address1.setemp(e1);
								
								sess.persist(e1);
								sess.persist(address1);
								t.commit();
								sess.close();
								System.out.println("success");
								break;
								
				case 2:			String s = "from Employee";
								Query q = session.createQuery(s);
								List l = q.list();
								
								for(Iterator i=l.iterator(); i.hasNext();)
								{
									Employee e = (Employee)i.next();
									System.out.println(e.getid());
									System.out.println(e.getname());
									
									Address address = e.getAddr();
									System.out.println(address.getA_id());
									System.out.println(address.getstreet());
									System.out.println(address.getcity());
								}
								session.close();
								break;
								
				case 3:			System.out.println("===============program is terminated===============");
								System.exit(0);
								
					default:	System.out.println("Enter the  correct choice : ");
								
				}
			}
			while(choice!=3);
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
