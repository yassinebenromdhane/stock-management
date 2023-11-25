/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import stock.management.config.DbConnect;
import stock.management.models.Order;

/**
 *
 * @author amine_meyssa
 */
public class OrderDAOImp implements OrderDAO{
    Connection con=new DbConnect().getCon();    

    @Override
    public int createOrder(Order o) {
                int res =-1;
                try {
                              PreparedStatement ps = con.prepareStatement("insert into orders(ref,client_id,product_id,qte,confirmed) values(?,?,?,?,?)");
                              Random r = new Random();
                              int ref = r.nextInt((9999 - 1001) + 1) + 1001;
                              ps.setString(1, "OR"+ref);
                              ps.setInt(2, o.getClient_id());
                              ps.setInt(3, o.getProduct_id());
                              ps.setInt(4,o.getQte());
                              ps.setBoolean(5,false);
                              res = ps.executeUpdate();
                      } catch (SQLException e) {
                              // TODO Auto-generated catch block
                              e.printStackTrace();
                      }
                      return res;
        
    }

    @Override
    public int updateOrder(Order o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteOrder(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int confirmOrder(int id) {
         int res = -1;
		try {
			PreparedStatement ps = con.prepareStatement("update orders set confirmed = true where id = ?");
                        ps.setInt(1, id);
			
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
    }
    
}
