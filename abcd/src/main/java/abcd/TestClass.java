package abcd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************Project started!!!***********");
		
		
		Books b1 = new Books();
		
		b1.setBookName("Shivaji kon hota");
		b1.setAuthor("Govind Pansare");
		b1.setPublishYear(2017);
		
		
		Books b2 = new Books();
		b2.setBookName("Mrityunjay");
		b2.setAuthor("Shivaji Sawant");
		b2.setPublishYear(1998);
		
		Books b3 = new Books();
		b3.setBookName("Prakashvatha");
		b3.setAuthor("Prakash Amte");
		b3.setPublishYear(2000);
		
		Books b4 = new Books();
		b4.setBookName("Aai");
		b4.setAuthor("Mokzim Garki");
		b4.setPublishYear(2012);
		
		
		try(SessionFactory factory1 = Hib_util.getFactory();
				Session session = factory1.openSession();){
			System.out.println("inside try block!!");
			Transaction t = session.beginTransaction();
			session.save(b1);
			session.save(b2);
			session.save(b3);	
			session.save(b4);
			t.commit();
			
			
			}
		
		catch(Exception e) {
			System.out.println("Error occured!!!");
			e.printStackTrace();
		}
		System.out.println("****************Successfully project end***********");
	}


}
