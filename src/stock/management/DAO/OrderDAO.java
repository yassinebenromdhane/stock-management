/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.DAO;

import stock.management.models.Order;

/**
 *
 * @author amine_meyssa
 */
public interface OrderDAO {
    int createOrder(Order o);
    int updateOrder(Order o);
    int deleteOrder(int id);
    int confirmOrder(int id);
    
}
