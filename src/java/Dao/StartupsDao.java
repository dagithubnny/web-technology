package Dao;

import Entity.Allstartups;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class StartupsDao {
    
    
    public void Save(Allstartups st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Update(Allstartups st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Delete(Allstartups st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    
    public List<Allstartups> listAllStartups(){
    
     Session ss = HibernateUtil.getSessionFactory().openSession();
     Query qr = ss.createQuery("from Allstartups");
     List<Allstartups> listStartups = qr.list();
     ss.close();
     return listStartups;
    
    
    
    }
    
    
}
