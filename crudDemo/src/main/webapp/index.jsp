<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<form action="add">
			Enter ID:<input type="number" name="id"><br><br>
			Enter name:<input type="text" name="name"><br><br>
			Enter DOB:<input type="date" name="dob"><br><br>
			Enter phone no:<input type="text" name="phno"><br><br>
			<input type="submit" value="Add"><br><br>
		</form>
		
		<form action="show">
			Enter ID:<input type="number" name="id"><br><br>
			<input type="submit" value="Find"><br><br>
		</form>
		
		<form action="delete">
			Enter ID:<input type="number" name="id"><br><br>
			<input type="submit" value="Delete"><br><br>
		</form>
		
		<form action="update">
			Enter ID:<input type="number" name="id"><br><br>
			<input type="submit" value="Update"><br><br>
		</form>
	</body>
</html>