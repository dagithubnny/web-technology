package Dao;

import Entity.Allgames;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class GamesDao {
    
    
     public void Save(Allgames st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Update(Allgames st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Delete(Allgames st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    
    public List<Allgames> listAllGames(){
    
     Session ss = HibernateUtil.getSessionFactory().openSession();
     Query qr = ss.createQuery("from Allgames");
     List<Allgames> listgm = qr.list();
     ss.close();
     return listgm;
    
   
    }
    
    
    
    
    
}
