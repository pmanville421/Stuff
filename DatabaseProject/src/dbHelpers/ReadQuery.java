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
 * @author pmanville
 *
 */
public class ReadQuery {

	private Connection connection;
	private ResultSet results;
	
	public ReadQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		//set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		//establishing our connection
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//doRead method and preparing our query
	public void doRead(){
		String query = "select * from grocery";
		
		try {
			PreparedStatement rs = this.connection.prepareStatement(query);
			this.results = rs.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//HTML output
	public String getHTMLtable(){
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()){
				Item item = new Item();
				item.setSku(this.results.getString("sku"));
				item.setProductType(this.results.getString("productType"));
				item.setFlavor(this.results.getString("flavor"));
				item.setCost(this.results.getDouble("cost"));
				item.setPrice(this.results.getDouble("price"));
				item.setQuantity(this.results.getInt("quantity"));
				
				table += "<tr>";
					table += "<td>";
					table += item.getSku();
					table += "</td>";
					table += "<td>";
					table += item.getProductType();
					table += "</td>";
					table += "<td>";
					table += item.getFlavor();
					table += "</td>";
					table += "<td>";
					table += item.getCost();
					table += "</td>";
					table += "<td>";
					table += item.getPrice();
					table += "</td>";
					table += "<td>";
					table += item.getQuantity();
					table += "</td>";
					
					//Add and Delete
						table += "<a href=update?sku=" + item.getSku() + ">update</a><a href=delete?sku=" + item.getSku() + ">delete</a>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}
	
}
