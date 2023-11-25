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
import stock.management.config.DbConnect;
import stock.management.models.Admin;

/**
 *
 * @author amine_meyssa
 */
public class AdminDAOImp implements AdminDAO{
    Connection con=new DbConnect().getCon();

    @Override
    public Admin login(String email, String password) {
        Admin a = new Admin();
            
		try {
			PreparedStatement ps = con.prepareStatement("select * from admin where email = ? and password = ?");
			ps.setString(1,email);
                        ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				a = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                                System.out.println(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
    }

   
}
