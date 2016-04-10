<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products - Add Items</title>
</head>
<body>
<h1>Products - Add Items</h1>

<form name=addForm action=addItem method=get>
	
	<label>
	Product SKU:
	</label>
	<input type=text name=title value="" />
	<br />
	
	<label>
	Product SKU:
	</label>
	<input type=text name=title value="" />
	<br />
	
	<label>
	Product SKU:
	</label>
	<input type=text name=sku value="" />
	<br />
	
	<label>
	Product Type:
	</label>
	<input type=text name=productType value="" />
	<br />
	
	<label>
	Product Flavor:
	</label>
	<input type=text name=flavor value="" />
	<br />
	
	<label>
	Product Cost:
	</label>
	<input type=text name=cost value="" />
	<br />
	
	<label>
	Product Price:
	</label>
	<input type=text name=price value="" />
	<br />
	
	<label>
	Product Quantity:
	</label>
	<input type=text name=quantity value="" />
	<br />
	
	<input type=submit name=submit value="Add Item"/>

</form>

</body>
</html>