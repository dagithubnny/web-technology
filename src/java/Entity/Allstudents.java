/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@ManagedBean(name="lk")
@Entity
@SessionScoped

public class Allstudents {
    
    
    @Id
    private int studid;
    private String username;
    private String studnames;
    private String uninames;
    private String unidpt;
    private String email;
    private String password;

    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getStudnames() {
        return studnames;
    }

    public void setStudnames(String studnames) {
        this.studnames = studnames;
    }

    public String getUninames() {
        return uninames;
    }

    public void setUninames(String uninames) {
        this.uninames = uninames;
    }

    public String getUnidpt() {
        return unidpt;
    }

    public void setUnidpt(String unidpt) {
        this.unidpt = unidpt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      
    
    
//    public boolean checkuser(){
//    
//        
//         
//        
//        
//        try{
//            
//            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//            
//            Session ss = sessionFactory.openSession();
//            ss.beginTransaction();
//            
//            Query query = ss.createQuery("from Allstudents where username=:username and password=:password");
//            query.setString("username", username);
//            query.setString("password", password);
//            
//            List list = query.list();
//            
//            
//            if(list.size()==1){
//               
//               return true;
//            
//            }else{
//                
//            return false;
//            
//            }
//        
//        
//        
//        
//        }catch(Exception e){
//        
//            System.out.println(e);
//            
//        }
//        
//        
//        
//        return false;
//        
//         
//       
//        
//    
////        if(username.equals("abi") && password.equals("pass")){
////            
////            
////        return true;
////        
////        }else{
////             return false;
////        }
//        
//        
//    
//    }
    
    
    
    
    
    
    
    
    
    
    
    
}
