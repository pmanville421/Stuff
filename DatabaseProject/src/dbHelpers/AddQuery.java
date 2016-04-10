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
public class AddQuery {

		public Connection connection;
		
		public AddQuery(String dbName, String uname, String pwd){
			String url = "jdbc:mysql://localhost:3306/" + dbName;
			
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				this.connection = DriverManager.getConnection(url, uname, pwd);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
public void doAdd(Item item){
	String query = "insert into products (sku, productType, flavor, cost, price, quantity) values(?, ?, ?, ?, ?, ?)";

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
