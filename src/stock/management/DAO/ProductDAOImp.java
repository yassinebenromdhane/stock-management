/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import stock.management.config.DbConnect;
import stock.management.models.Product;

/**
 *
 * @author amine_meyssa
 */
public class ProductDAOImp implements ProductDAO{
    Connection con=new DbConnect().getCon();    
    @Override
    public int createProduct(Product product) {
        int res =-1;
        try {
			PreparedStatement ps = con.prepareStatement("insert into products(title,descrip,stock,price,cat_id) values(?,?,?,?,?)");
			ps.setString(1, product.getTitle());
			ps.setString(2, product.getDesc());
                        ps.setInt(3, product.getStock());
                        ps.setDouble(4,product.getPrice());
                        ps.setInt(5, product.getCat_id());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
        
    }


    @Override
    public int updateproduct(Product product) {
        int res = -1;
		try {
			PreparedStatement ps = con.prepareStatement("update products set title = ?, descrip = ? , stock =? ,price=? , cat_id=? where id = ?");
	
			ps.setString(1, product.getTitle());
			ps.setString(2, product.getDesc());
                        ps.setInt(3, product.getStock());
                        ps.setDouble(4, product.getPrice());
                        ps.setInt(5, 1);
                        ps.setInt(6, product.getId());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteProduct(int id) {
         int res = -1;
		try {
			PreparedStatement ps = con.prepareStatement("delete from products where id = ?");
                        ps.setInt(1, id);
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res; //To change body of generated methods, choose Tools | Templates.
    }
    
}
