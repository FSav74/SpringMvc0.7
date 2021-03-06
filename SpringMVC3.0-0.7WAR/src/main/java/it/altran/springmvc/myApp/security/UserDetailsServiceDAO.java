package it.altran.springmvc.myApp.security;

//import it.altran.springmvc.myApp.persistence.PersistenceManager;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
 
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDetailsServiceDAO implements UserDetailsService{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override    
	//@PostConstruct
	public UserDetails loadUserByUsername(String user)
			throws UsernameNotFoundException {
		
		
		System.out.println("----------Authentication!-------------");
//		PersistenceManager manager = PersistenceManager.getInstance();
//		EntityManager em = manager.getEntityManager();
		
		UserDetails userDetails =null;
		 try{
		Query query = entityManager.createQuery("SELECT a FROM User a WHERE a.username = :username");
		query.setParameter("username", user);
		 
		 userDetails = (UserDetails) query.getSingleResult();
		
		if (userDetails==null) System.out.println(">>>>>>NULLLLL");
		if (userDetails!=null) System.out.println("NOME:"+userDetails.getUsername());
		 }catch(Exception e){
			 System.out.println("ERROREEE:"+e.toString());
			 
		 }
		
		System.out.println("----------End Authentication-------------");
		
		
//		em.close();
		 
		return userDetails;
	}

	

}
