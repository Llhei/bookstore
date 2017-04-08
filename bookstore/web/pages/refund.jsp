<%-- 
    Document   : refund
    Created on : 08-Apr-2017, 20:52:46
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

		<h1>Refund Requests</h1>

		<a href="mbrowse.html" class="button">Back to browse</a>
		<br>

		<!--Refund Requests-->

		<table class="refundRequest">
			<col width="20%">
  		<col width="40%">
			<col width="15%">
  		<col width="10%">
			<col width="15%">

		  <tr>
				<th>User</th>
		    <th>Book Title</th>
		    <th>Price</th>
				<th>Quantity</th>
				<th></th>

		  </tr>
		  <tr>
		    <td >Username</td>
		    <td >Book Title</td>
				<td >HKD 100</td>
				<td >1</td>
				<td >
					<form class="refundButton" style="float:right">
						<input type="button" value="Accept">
						<input type="button" value="Decline">
					</form>
				</td>
		  </tr>
		  <tr>
				<td >Username</td>
		    <td >Book Title</td>
				<td >HKD 100</td>
				<td >1</td>
				<td >
					<form class="refundButton" style="float:right">
						<input type="button" value="Accept">
						<input type="button" value="Decline">
					</form>
				</td>
		  </tr>
		</table>


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
