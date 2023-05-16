package Dao;

import Entity.Allstudents;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class StudentDao {
    
    
    
    
    
    public void Save(Allstudents st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Update(Allstudents st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Delete(Allstudents st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    
    public List<Allstudents> listAllStudents(){
    
     Session ss = HibernateUtil.getSessionFactory().openSession();
     Query qr = ss.createQuery("from Allstudents");
     List<Allstudents> listPharm = qr.list();
     ss.close();
     return listPharm;
    
    
    
    }
    
    
    
    // FIND BY ID/USERNAME
    
    
    
    
    
    
    
}
