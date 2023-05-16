/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.Allfintech;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class FintechDao {
    
    public void Save(Allfintech st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    public void Update(Allfintech st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(st);
        ss.getTransaction().commit();  
        ss.close();
        
    } 
    
    
    
    
    public void Delete(Allfintech st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(st);
        ss.getTransaction().commit();   
        
    } 
    
    
    
    
    
    public List<Allfintech> listAllFinTech(){
    
     Session ss = HibernateUtil.getSessionFactory().openSession();
     Query qr = ss.createQuery("from Allfintech");
     List<Allfintech> listgm = qr.list();
     ss.close();
     return listgm;
    
   
    }
    
    
    
}
