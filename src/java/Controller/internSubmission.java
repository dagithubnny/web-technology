/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.submissionsDao;
import Entity.submissionsTable;
import Entity.submissionsTable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean(name="intern")
public class internSubmission {
    
    
    
    
    submissionsTable sts = new submissionsTable();
    submissionsDao dao = new submissionsDao();
    ArrayList<submissionsTable> listOfStudents = new ArrayList<>();

    public submissionsTable getSubmissionDetails(){
    
         return sts;
        
        
    }
    
    
    
    
    
    
    // SAVING SERVICE
    
    
    public void create(){
    
    
    dao.Save(sts);
    
    }
    
     // LISTING SERVICE
    
    public List<submissionsTable> getStudentsRecords(){
    
    
    return dao.listAllSubmissions();
    
    }
    
}
