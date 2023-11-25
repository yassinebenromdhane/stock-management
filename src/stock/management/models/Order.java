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
public class Order {
    int id;
    String ref;
    int client_id;
    int product_id;
    int qte;
    boolean confirmed;

    public Order() {
    }

    public Order(int id, String ref, int client_id, int product_id,int qte , boolean confirmed) {
        this.id = id;
        this.ref = ref;
        this.client_id = client_id;
        this.product_id = product_id;
        this.qte =qte;
        this.confirmed = confirmed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", ref=" + ref + ", client_id=" + client_id + ", product_id=" + product_id + ", confirmed=" + confirmed + '}';
    }
    
    
    
}
