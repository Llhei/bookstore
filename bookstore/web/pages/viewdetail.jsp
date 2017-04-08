<%-- 
    Document   : viewdetail
    Created on : 08-Apr-2017, 20:53:52
    Author     : robertcinca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<!-- Meta attributes -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="robots" content="noindex, nofollow">
	<meta name="title" content="Online Bookstore">
	<meta name="description" content="An online marketplace for buying books.">

	<title>Welcome to our Online Bookstore!</title>

	<!-- CSS Pages -->
	<link href="../../css/theme.css" rel="stylesheet">
	<link href="../../css/browse.css" rel="stylesheet">

	<!-- JS Pages -->

	</head>
	<body>
		<header>
			<iframe id="disclaimer" name="disclaimer" src="../iframes/disclaimer.html" width="100%">
            [Your user agent does not support frames or is currently configured not to display frames.]
        	</iframe>
		</header>

		<!-- Navigation -->
        <div class="dropdown">
            <button class="dropbtn">MENU</button>
            <div class="dropdown-content">
                <ul class="nav">
                    <li><a href="../pages/index.html">Login</a></li>
                    <li><a href="../pages/browse.html">Browse</a></li>
                    <li><a href="../pages/viewcart.html">View Cart</a></li>
                    <li><a href="../pages/payment.html">Pay Now</a></li>

                </ul>
            </div>
        </div>

		<h1>Account Detail</h1>
		<a href="browse.html" class="button">Back to Browse</a>
		<a href="viewcart.html" class="button">View Cart</a>
		<br>

		<!--Purchased book-->

		<h2>Purchased book</h2>
		<table class="purchasedBook">
			<col width="40%">
  		<col width="10%">
			<col width="10%">
  		<col width="20%">
			<col width="20%">

		  <tr>
				<th>Book Title</th>
		    <th>Price</th>
		    <th>Quantity</th>
				<th>Status</th>
				<th></th>

		  </tr>
		  <tr>
		    <td >Book Title</td>
		    <td >HKD 100</td>
				<td >1</td>
				<td >purchased</td>
				<td >
					<form class="refundButton" style="float:right">
						<input type="button" value="Request Refund">
					</form>
				</td>
		  </tr>
			<tr>
		    <td >Book Title</td>
		    <td >HKD 100</td>
				<td >1</td>
				<td >refund accepted</td>
				<td >

				</td>
		  </tr>
		</table>

		<!--user detail-->

		<h2>Account Detail</h2>

<fieldset>

		<h3>User Info</h3>
		<p>Username: </p>
		<p>Password: </p>
		<p>Role: </p>
		<p>Loyalty Points: </p>
		<br>

		<h3>Credit Card Info</h3>
		<p>Card Name: </p>
		<p>Card Number: </p>
		<p>Expiry Date: </p>
		<br>

		<h3>Address</h3>
		<p>Address: </p>
		<p>City: </p>
		<p>Country: </p>
		<p>Post Code (if any): </p>
		<br>

		<a href="editAccount.html" class="button">Edit Account</a>
</fieldset>





		<footer>
			<iframe id="disclaimer" name="disclaimer" src="../iframes/disclaimer.html" width="100%">
            [Your user agent does not support frames or is currently configured not to display frames.]
        	</iframe>
        	<iframe id="bookstorefooter" name="bookstorefooter" src="../iframes/bookstorefooter.html" width="100%" height="400px">
            [Your user agent does not support frames or is currently configured not to display frames.]
        	</iframe>
		</footer>
	</body>
</html>
