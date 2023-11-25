/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.DAO;

import stock.management.models.Customer;

/**
 *
 * @author amine_meyssa
 */
public interface CustomerDAO {
    int createCustomer(Customer c);
    int updateCustomer(Customer c);
    int deleteCustomer(int id);
    
}
