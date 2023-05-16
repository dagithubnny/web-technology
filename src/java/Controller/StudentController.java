package Controller;

import Dao.StudentDao;
import Entity.Allstudents;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean(name="scon")
public class StudentController {
    
    
    
    
    Allstudents sts = new Allstudents();
    StudentDao dao = new StudentDao();
    ArrayList<Allstudents> listOfStudents = new ArrayList<>();

    public Allstudents getStudentDetails(){
    
         return sts;
        
        
    }
    
    
    
    
    
    
    // SAVING SERVICE
    
    
    public void create(){
    
    
    dao.Save(sts);
    
    }
    
    
    // LISTING SERVICE
    
    public List<Allstudents> getStudentsRecords(){
    
    
    return dao.listAllStudents();
    
    }
    
    
//    // DELETING SERVICE
//    
//    public void delete(Allstudents p){
//    
//        dao.Delete(p);
//        
//    
//    }
    
    
    
    
    
    
    
    
    
}
