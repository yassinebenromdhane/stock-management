/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import stock.management.config.DbConnect;
import stock.management.models.Customer;

/**
 *
 * @author amine_meyssa
 */
public class CustomerDAOImp implements CustomerDAO{
    Connection con=new DbConnect().getCon();  

    @Override
    public int createCustomer(Customer c) {
         int res =-1;
        try {
			PreparedStatement ps = con.prepareStatement("insert into customers(name,lastName,email,phone) values(?,?,?,?)");
			ps.setString(1, c.getName());
			ps.setString(2, c.getLastName());
                        ps.setString(3, c.getEmail());
                        ps.setString(4,c.getPhone());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateCustomer(Customer c) {
        int res = -1;
		try {
			PreparedStatement ps = con.prepareStatement("update customers set name = ?, lastName = ? , email =? ,phone=? where id = ?");
	
			ps.setString(1, c.getName());
			ps.setString(2, c.getLastName());
                        ps.setString(3, c.getEmail());
                        ps.setString(4, c.getPhone());
                        ps.setInt(5, c.getId());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res; 
    }

    @Override
    public int deleteCustomer(int id) {
         int res = -1;
		try {
			PreparedStatement ps = con.prepareStatement("delete from customers where id = ?");
                        ps.setInt(1, id);
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;  //To change body of generated methods, choose Tools | Templates.
    }
    
}
