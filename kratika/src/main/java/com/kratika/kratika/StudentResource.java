package com.kratika.kratika;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
@Path("StudentResource")
public class StudentResource {
    @Path("/showStudent")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Student> showStudent() {
	    Session session=SessionUtil.getSession();
	    Query query=session.createQuery("from Student");
	    List<Student> list=query.list();
	    session.close();
		return list;
	}
    @Path("/addStudent")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student) {
    	Session session=SessionUtil.getSession();
	    Transaction transaction=session.beginTransaction();
	    session.save(student);
	    transaction.commit();
	    session.close();
	    
	    Map<String, String> mapobj=new HashMap<>();
	    mapobj.put("message", "Insertion Sucessfully");
	    return Response.ok().entity(mapobj).build();
      }
    
    @Path("/updateStudent/{id}/{address}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStudent(@PathParam("id") int id,@PathParam("address") String address) {
        Session session=SessionUtil.getSession();
        Transaction transaction=session.beginTransaction();
        String hql="update Student set address= :address where id= :id";
        Query query=session.createQuery(hql);
        query.setInteger("id", id);
        query.setString("address", address);
        query.executeUpdate();
        transaction.commit();
        session.close();
        return Response.ok().build();
    }
    
    @Path("/updateFullStudent/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateFullStudent(@PathParam("id") int id,Student std) {
        Session session=SessionUtil.getSession();
        Transaction transaction=session.beginTransaction();
        String hql="update Student set address= :address , mobile_no=:mob,name=:name where id= :id";
        Query query=session.createQuery(hql);
        query.setInteger("id", id);
        query.setString("address", std.getAddress());
        query.setString("mob", std.getMobile_no());
        query.setString("name", std.getName());
        query.executeUpdate();
        transaction.commit();
        session.close();
        return Response.ok().build();
    }
    
    @Path("/addDeptStudent")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addDeptStudent(StudentModel student) {
    	Session session=SessionUtil.getSession();
    	Transaction transaction=session.beginTransaction();
    	
    	session.save(student);
    	transaction.commit();
    	session.close();
    	return Response.ok().build();
    }
    
    @Path("/addDept")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addDept(DeptModel dept) {
    	
    	Session session=SessionUtil.getSession();
    	Transaction transaction=session.beginTransaction();
    	
    	session.save(dept);
    	transaction.commit();
    	session.close();
    	return Response.ok().build();
    }
}

