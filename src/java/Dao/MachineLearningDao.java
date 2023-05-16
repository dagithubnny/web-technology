package Dao;

import Entity.Allmachinelearning;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class MachineLearningDao {
    
    public void Save(Allmachinelearning st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Update(Allmachinelearning st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Delete(Allmachinelearning st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    
    public List<Allmachinelearning> listAllMachineLearning(){
    
     Session ss = HibernateUtil.getSessionFactory().openSession();
     Query qr = ss.createQuery("from Allmachinelearning");
     List<Allmachinelearning> listMl = qr.list();
     ss.close();
     return listMl;
    
    
    
    }
    
}
