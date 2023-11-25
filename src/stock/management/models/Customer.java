/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.models;

/**
 *
 * @author amine_meyssa
 */
public class Customer extends Personne{
    String email;
    String phone;

    public Customer() {
    }
    

    public Customer(int id, String name, String lastName,String email, String phone) {
        super(id, name, lastName);
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "email=" + email + ", phone=" + phone + '}';
    }
    
    
    
    
}
