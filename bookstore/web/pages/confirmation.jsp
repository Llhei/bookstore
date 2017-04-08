<%-- 
    Document   : confirmation
    Created on : 08-Apr-2017, 20:51:24
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
		
		<h1>Payment Confirmation Page</h1>
		<p>Success! Your payment has been processed.</p>
		<a href="browse.html" class="button">Continue Browsing Bookstore...</a>
        <a href="viewDetail.html" class="button">View your member details</a>
		<a href="index.html" class="button">Sign Out</a>
		<br>

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