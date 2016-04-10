<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Item" %>    
<% Item item = (Item)request.getAttribute("item"); %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Items</title>
</head>
<body>

<h1>Update Items</h1>

<form name=updateForm action=updateItem method=get>
	
	<label>
	Product SKU:
	</label>
	<input type=text name=sku value="<%= item.getSku() %>" />
	<br />
	
	<label>
	Product Product Type:
	</label>
	<input type=text name=productType value="<%= item.getProductType() %>" />
	<br />
	
	<label>
	Product Flavor:
	</label>
	<input type=text name=flavor value="<%= item.getFlavor() %>" />
	<br />
	
	<label>
	Product Cost:
	</label>
	<input type=text name=cost value="<%= item.getCost() %>" />
	<br />
	
	<label>
	Product Price:
	</label>
	<input type=text name=price value="<%= item.getPrice() %>" />
	<br />
	
	<label>
	Product Quantity:
	</label>
	<input type=text name=quantity value="<%= item.getQuantity() %>" />
	<br />
	
	
	<input type=submit name=submit value="Update Item"/>

</form>


</body>
</html>