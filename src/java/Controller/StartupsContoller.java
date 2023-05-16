/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.StartupsDao;
import Entity.Allstartups;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="start")
public class StartupsContoller {
    
    Allstartups pha = new Allstartups();
    
    StartupsDao dao = new StartupsDao();
    
    ArrayList<Allstartups> listOfFin = new ArrayList<>();
    
    
    public Allstartups getStartDetails(){
    
         return pha;
        
        
    }
    
    
    
    
    public void create(){
    
    
    dao.Save(pha);
    
    }
    
    
    
    public List<Allstartups> getStartRecords(){
    
    
    return dao.listAllStartups();
    
    }
    
    
    public void delete(Allstartups p){
    
        dao.Delete(p);
        
    
    }
    
    
    public String updateOne(Allstartups p){
    
    pha = p;
    return "updateForm";
    
    }
    

    public void update(){
    
    
    dao.Update(pha);
    
    
    }
    
}
