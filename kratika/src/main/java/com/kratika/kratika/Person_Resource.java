package com.kratika.kratika;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Path("PersonResource")
public class Person_Resource {
 
	@Path("/addperson")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addperson(Person_Model person) {
		
		Session session=SessionUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(person);
		transaction.commit();
		session.close();
		
		return person.getFname().toString();
	}
	@Path("/showperson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person_Model> showperson() {
		Session session=SessionUtil.getSession();
		Query query=session.createQuery("from Person_Model");
		List<Person_Model> list=query.list();
		session.close();
		return list;
	}
}
