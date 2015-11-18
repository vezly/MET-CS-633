package defectTrackingSystem.dao;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class ManipulateUser {
	 static  Configuration cfg=new Configuration();  
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	    deleteUser();
	    /*  
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    User developer=new User();  
	    developer.setFirstName("Jane");
	    developer.setLastName("Smith");
	    developer.setUserRoleId("4");
	    UserRole 1 = Admin
	     * UserRole 2 = Tester
	     * UserRole 3 = Developer
	     * UserRole 4 = Guest
	     * UserRole 5 = Project Manager 
	    
	    session.persist(developer);//persisting the object  
	      
	    t.commit();//transaction is commited  
	    session.close();  
	      
	    System.out.println("successfully saved");  */
	    
	    
	}
	
	public static void deleteUser(){
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		SessionFactory factory=cfg.buildSessionFactory();  
	    Session session=factory.openSession();  
	    Transaction t = session.beginTransaction();
		Query q = session.createQuery("DELETE FROM User WHERE userId = 3");
	    q.executeUpdate();
	    t.commit();
	    session.close();  
	    System.out.println("successfully deleted");  
	}
}
