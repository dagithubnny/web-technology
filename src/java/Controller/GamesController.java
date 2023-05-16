/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.GamesDao;
import Entity.Allgames;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="gam")
public class GamesController {
    
     
    Allgames pha = new Allgames();
    
    GamesDao dao = new GamesDao();
    
    ArrayList<Allgames> listOfFin = new ArrayList<>();
    
    
    public Allgames getGameDetails(){
    
         return pha;
        
        
    }
    
    
    
    
    public void create(){
    
    
    dao.Save(pha);
    
    }
    
    
    
    public List<Allgames> getGameRecords(){
    
    
    return dao.listAllGames();
    
    }
    
    
    public void delete(Allgames p){
    
        dao.Delete(p);
        
    
    }
    
    
    public String updateOne(Allgames p){
    
    pha = p;
    return "updateForm";
    
    }
    

    public void update(){
    
    
    dao.Update(pha);
    
    
    }
    
}
