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
public class Product {
    private int id;
    private String title;
    private String desc;
    private int stock;
    private double price;
    private int cat_id;

    public Product() {
    }

    public Product(int id, String title, String desc, int stock, double price, int cat_id) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.stock = stock;
        this.price = price;
        this.cat_id = cat_id;
    }

    public Product(String title, String desc, int stock, double price, int cat_id) {
        this.title = title;
        this.desc = desc;
        this.stock = stock;
        this.price = price;
        this.cat_id = cat_id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", title=" + title + ", desc=" + desc + ", stock=" + stock + ", price=" + price + ", cat_id=" + cat_id + '}';
    }
    
    
    
    
    
}
