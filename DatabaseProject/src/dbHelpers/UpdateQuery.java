/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Item;

/**
 * @author plm12
 *
 */
public class UpdateQuery {

	private Connection connection;
	
	public UpdateQuery(String dbName, String uname, String pwd){
		
		String url = "jdbc:mysql://localhost/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void doUpdate(Item item){
	String query = "update products set sku=?, productType=?, flavor=?, cost=?, price=?, quantity=?";

	try {
		PreparedStatement ps = connection.prepareStatement(query);
	
		ps.setString(1, item.getSku());
		ps.setString(2, item.getProductType());
		ps.setString(3, item.getFlavor());
		ps.setDouble(4, item.getCost());
		ps.setDouble(5, item.getPrice());
		ps.setInt(6, item.getQuantity());
		
		ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
