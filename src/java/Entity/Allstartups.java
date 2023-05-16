/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Allstartups {
    
    
    @Id
    private int companyid;
    private String companyName;
    private String companyAddress;
    private String companyJobExp;
    private String companyAvailability;

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyJobExp() {
        return companyJobExp;
    }

    public void setCompanyJobExp(String companyJobExp) {
        this.companyJobExp = companyJobExp;
    }

    public String getCompanyAvailability() {
        return companyAvailability;
    }

    public void setCompanyAvailability(String companyAvailability) {
        this.companyAvailability = companyAvailability;
    }
    
    
}
