package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Client;
import entities.Information;
import entities.Produit;
import jakarta.servlet.http.HttpServletRequest;

public class CrudEntities {
	
	protected void ajoutproduit(HttpServletRequest request) 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String nom=request.getParameter("name");
		String type=request.getParameter("type");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("projSto");  
        EntityManager em=emf.createEntityManager();    
        em.getTransaction().begin();            
        Produit p=new Produit();
        p.setId(id);
        p.setName(nom);
        p.setType(type);
       em.persist(p);
       em.getTransaction().commit(); 
	}
	protected void ajoutclient(HttpServletRequest request) 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
		int intcat=Integer.parseInt(request.getParameter("idcategorie"));
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("projSto");  
        EntityManager em=emf.createEntityManager();    
        em.getTransaction().begin();            
        Client  p=new Client();
        p.setId(id);
        p.setNom(nom);
        p.setPrenom(prenom);
        p.setIdCat(intcat);
        Information i=new Information();
        i.setEmail(email);
        p.setInformation(i);
       em.persist(p);
       em.getTransaction().commit(); 
	}
	
	
	
	
	

}
