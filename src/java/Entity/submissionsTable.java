/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yoursaugustusly
 */
@Entity
@XmlRootElement
public class submissionsTable{
    
    
    @Id
    private int companyid;
    private String companyName;
    private String studnames;
    private String studid;
    private String uninames;
    private String unidpt;
    private String gpa;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
    

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getStudnames() {
        return studnames;
    }

    public void setStudnames(String studnames) {
        this.studnames = studnames;
    }

    public String getStudid() {
        return studid;
    }

    public void setStudid(String studid) {
        this.studid = studid;
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

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
   

  
      
    
}
