/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.submissionsTable;
import Entity.submissionsTable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class submissionsDao {
    
    
     public void Save(submissionsTable st){
    
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(st);
        ss.getTransaction().commit();   
        
    } 
    
    
     public List<submissionsTable> listAllSubmissions(){
    
     Session ss = HibernateUtil.getSessionFactory().openSession();
     Query qr = ss.createQuery("from submissionsTable");
     List<submissionsTable> listPharm = qr.list();
     ss.close();
     return listPharm;
    
    
    
    }
    
}
