/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.MachineLearningDao;
import Entity.Allmachinelearning;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mlearn")
public class MachineLearningController {
    
    
    Allmachinelearning pha = new Allmachinelearning();
    
    MachineLearningDao dao = new MachineLearningDao();
    
    ArrayList<Allmachinelearning> listOfFin = new ArrayList<>();
    
    
    public Allmachinelearning getMlDetails(){
    
         return pha;
        
        
    }
    
    
    
    
    public void create(){
    
    
    dao.Save(pha);
    
    }
    
    
    
    public List<Allmachinelearning> getMlRecords(){
    
    
    return dao.listAllMachineLearning();
    
    }
    
    
    public void delete(Allmachinelearning p){
    
        dao.Delete(p);
        
    
    }
    
    
    public String updateOne(Allmachinelearning p){
    
    pha = p;
    return "updateForm";
    
    }
    

    public void update(){
    
    
    dao.Update(pha);
    
    
    }
    
}
