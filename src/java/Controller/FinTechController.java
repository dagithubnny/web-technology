/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.FintechDao;
import Entity.Allfintech;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="fin")
public class FinTechController {
    
    Allfintech pha = new Allfintech();
    
    FintechDao dao = new FintechDao();
    
    ArrayList<Allfintech> listOfFin = new ArrayList<>();
    
    
    public Allfintech getFinTechDetails(){
    
         return pha;
        
        
    }
    
    
    
    
    public void create(){
    
    
    dao.Save(pha);
    
    }
    
    
    
    public List<Allfintech> getFinRecords(){
    
    
    return dao.listAllFinTech();
    
    }
    
    
    public void delete(Allfintech p){
    
        dao.Delete(p);
        
    
    }
    
    
    public String update(Allfintech st){
    
    pha = st;
    return "FinTech.xhtml";
    
    }
    

    public void update(){
    
    
    dao.Update(pha);
    
    
    }
    
    
    
    
}
