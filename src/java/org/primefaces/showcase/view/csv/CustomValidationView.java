package org.primefaces.showcase.view.csv;
 
import javax.faces.bean.ManagedBean;
import org.hibernate.validator.constraints.Email;
 
@ManagedBean
public class CustomValidationView {
     
    private String text;
     
    @Email(message = "must be a valid email")
    private String email;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
}