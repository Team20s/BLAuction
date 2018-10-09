<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BLAuction</title>
</head>
<body>

<!-- Content -->
<div id="list_area">
	<div class="col-sm-8 text-left">	
	<div class="card group" id="card_group">
	  <div class="card" style="width: 18rem;">
	  	<h5 class="card-title" id="time_limit">12:00:00</h5>
		  <a href="auctiondetail.bla?auctionid=auctionid"><img class="card-img-top" src="img/se.jpg" alt="Card image cap"></a>
		  <div class="card-body">
		    <a href="auctiondetail.bla?auctionid=auctionid" class="card-text" id="auction_name">iPhone SE(rose gold)</a>
		    <p class="card-text" id="auction_price">38</p>
		  </div>
	  </div>
	  <div class="card" style="width: 18rem;">
	  	<h5 class="card-title" id="time_limit">12:00:00</h5>
		  <a href="auctiondetail.bla?auctionid=auctionid"><img class="card-img-top" src="img/se.jpg" alt="Card image cap"></a>
		  <div class="card-body">
		    <a href="auctiondetail.bla?auctionid=auctionid" class="card-text" id="auction_name">iPhone SE(rose gold)</a>
		    <p class="card-text" id="auction_price">38</p>
		  </div>
	  </div>
	</div>
</div>

<!-- Adds Navigation -->
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
    </div>
    
</body>
</html>