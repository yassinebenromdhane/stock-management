/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.DAO;

import java.util.List;
import stock.management.models.Product;


/**
 *
 * @author amine_meyssa
 */
public interface ProductDAO {
    
    int createProduct(Product product);
    int updateproduct(Product product);
    int deleteProduct(int id);
   
    
}
