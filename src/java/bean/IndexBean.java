/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
 
/**
 *
 * @author John Yeary
 * @version 1.0
 */
@ManagedBean
@ViewScoped
public class IndexBean implements Serializable {
 
   
    private boolean selectedBoolean;
    private boolean selectedRadioValue1;
    private boolean selectedRadioValue2;
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

    
    public boolean isSelectedBoolean() {
        return selectedBoolean;
    }
 
    public void setSelectedBoolean(boolean selectedBoolean) {
        this.selectedBoolean = selectedBoolean;
    }
 
    public boolean getSelectedRadioValue1() {
        return selectedRadioValue1;
    }
 
    public void setSelectedRadioValue1(boolean selectedRadioValue1) {
        this.selectedRadioValue1 = selectedRadioValue1;
    }
 
    public boolean getSelectedRadioValue2() {
        return selectedRadioValue2;
    }
 
    public void setSelectedRadioValue2(boolean selectedRadioValue2) {
        this.selectedRadioValue2 = selectedRadioValue2;
    }
    
    public boolean doaction(){
        selectedBoolean=true;
        System.out.println("Entro!!");
    return selectedBoolean;    
    }
    
    public boolean doaction2(){
        selectedBoolean=false;
    return selectedBoolean;    
    }
    public boolean login() {
         
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            selectedBoolean=true;    
        } else {     
            selectedBoolean=false;     
        }       
        return selectedBoolean;
    }  
}