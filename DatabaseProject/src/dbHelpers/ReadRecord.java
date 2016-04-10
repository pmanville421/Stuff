/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Item;

/**
 * @author plm12
 *
 */
public class ReadRecord {

	private Connection connection;
	private ResultSet results;
	
	private Item item = new Item();
	private String sku;
	
	public ReadRecord(String dbName, String uname, String pwd, String sku){
		
		String url = "jdbc:mysql://loalhost:3306/" + dbName;
		this.sku = sku;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void doRead(){
		String query = "select * from products where sku = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
		
			ps.setString(1, this.sku);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			item.setSku(this.results.getString("sku"));
			item.setProductType(this.results.getString("productType"));
			item.setFlavor(this.results.getString("flavor"));
			item.setCost(this.results.getDouble("cost"));
			item.setPrice(this.results.getDouble("price"));
			item.setQuantity(this.results.getInt("quantity"));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Item getItem(){
		return this.item;
		
	}

}
