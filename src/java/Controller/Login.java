package Controller;

import java.io.Serializable;
import java.util.List;
import Controller.VerifyRecaptcha;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@ManagedBean(name="lg")
@SessionScoped
@Entity
public class Login implements Serializable {

    @Id
    private int studid;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
       
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     
    
 public boolean checkuser(){
          
        String gRecaptchaResponse = FacesContext.getCurrentInstance().
        getExternalContext().getRequestParameterMap().get("g-recaptcha-response");
        
        try{
        
        boolean verify = VerifyRecaptcha.verify(gRecaptchaResponse);
        
        if(verify){
     
        
            
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            
            Session ss = sessionFactory.openSession();
            ss.beginTransaction();
            
            Query query = ss.createQuery("from Allstudents where username=:username and password=:password");
            query.setString("username", username);
            query.setString("password", password);
            
            List list = query.list();
            
            
            if(list.size()==1){
               
               return true;
            
            }else{
                
            return false;
            
            }
        } else{
        
         FacesContext context = FacesContext.getCurrentInstance();
         context.addMessage( null , new FacesMessage( "Select Captcha") );
         
         
            
        }
        
        
        
        
        }catch(Exception e){
        
            System.out.println(e);
            
        }
        
        
        
        return false;
        
         
    }
 
 
 
    public boolean checkadmin(){
    
    String gRecaptchaResponse = FacesContext.getCurrentInstance().
    getExternalContext().getRequestParameterMap().get("g-recaptcha-response");    
        
    
    try{
        
        boolean verify = VerifyRecaptcha.verify(gRecaptchaResponse);
        
        if(verify){
    
    if(username.equals("admin") && password.equals("admin")){
        
    return true;
      
        }else{
             return false;
        }
    
        }else{
        
         FacesContext context = FacesContext.getCurrentInstance();
         context.addMessage( null , new FacesMessage( "Select Captcha") );
         
         
            
        }
        
        
        
        
        }catch(Exception e){
        
            System.out.println(e);
            
        }
    return false;
    
    }
    
    
    
    
    
    
    public Login() {
        
        
        
    }
    
}

