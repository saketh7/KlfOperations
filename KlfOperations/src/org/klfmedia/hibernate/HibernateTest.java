package org.klfmedia.hibernate;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.klfmedia.dto.WineDetails;
import org.klfmedia.servie.KlfService;

public class HibernateTest {

	public static void main(String[] args) {
		
		WineDetails wd=new WineDetails();
		
	//	Sample Test Persist Operations
		
	//	wd.setProductID(10);
	//	wd.setProductName("Sunrise10");
	//	wd.setPrice(14);
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
	//	session.save(wd);
		session.getTransaction().commit();
		session.close();
		
		
		wd=null;
		Scanner sc = new Scanner(System.in);
	
		//Searching Functionality
		
		
		System.out.print("Enter a productID to retrieve name-");
		int i = sc.nextInt();
		Session session2=sessionfactory.openSession();
		wd=(WineDetails)session2.get(WineDetails.class,i);
		KlfService service=new KlfService();
		String name=service.search(wd,2);
		System.out.print("Name in table with product ID"+i+"  is -----"+name);
		
		

		//Retrieving List of Wines(Can be implemented using Criteria's/HQL)
		//Note:Can also be implemented using pagination with HQL eg-query.setFirstResult(0);query.setMaxResults(50);
		
		List<WineDetails> sublist=sessionfactory.openSession().createCriteria(WineDetails.class).list().subList(0,50);
		service.getListFifty(sublist);	
		
		//Retrieve List based on input
		
		System.out.print("Enter a page number-");
		int input=sc.nextInt();
		int lowIndex=input*100;
		int highIndex=lowIndex+100;
		List<WineDetails> sublistL=sessionfactory.openSession().createCriteria(WineDetails.class).list().subList(lowIndex,highIndex);
		service.getListFifty(sublistL);	
		
		
		
		//Searching and saving in JSON format

		System.out.print("Enter a product ID to retrive all details and to return to json object-");
		int j=sc.nextInt();
		wd=(WineDetails)session2.get(WineDetails.class,j);		
		String details=service.searchSaveJson(wd,j);
		System.out.print("Details were saved to JSON Object"+details);
				
		
	}

}
