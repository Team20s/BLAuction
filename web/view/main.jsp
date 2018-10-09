<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BLAuction</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/style.css" type="text/css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<!-- Header -->
<!-- ********************************************************************************************* -->
<nav class="navbar navbar">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="main.bla"><img src="img/logo.PNG"></a>
    </div>
    
    <div class="collapse navbar-collapse" id="myNavbar">     
      <form class="navbar-form navbar-left" action="/search.bla">
	  <div class="input-group" id="searchingbar_main">
	  	<input type="text" class="form-control" placeholder="#">
	  </div>
	  </form>

      <ul class="nav navbar-nav navbar-right" id="rightNav">
      	<li><a href="#"><img src="img/auction.png"></img>경매등록</a></li>
      	<li><a href="#"><img src="img/customer.png"></img>마이페이지</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- Center -->
<!-- ********************************************************************************************* -->	 
<div class="container-fluid text-center">   
  <div class="row content">
  
    <!-- Menu Navigation -->
    <div class="col-sm-2 sidenav" id="menu">
      <div>
      	<p><a href="main.bla"><strong>전체 카테고리</strong></a></p>
      </div>
      <div id="menu_category">
	    <p><a href="clothing.bla?category=0">의류/잡화</a></p>
	    <p><a href="beauty.bla?category=1">뷰티/미용</a></p>
	    <p><a href="sports.bla?category=2">스포츠/레저</a></p>
	    <p><a href="digital.bla?category=3">디지털/가전</a></p>
	    <p><a href="furniture.bla?category=4">생활/가구</a></p>
	    <p><a href="etc.bla?category=5">기타</a></p>
      </div>
    </div>
    <!-- Content -->
    <!-- ***************************************************************************************** -->	
    	<c:choose>
    		<c:when test="${centerpage != null}">
    			<jsp:include page="${centerpage }.jsp"></jsp:include>
    		</c:when>
    		<c:otherwise>
    			<jsp:include page="center.jsp"></jsp:include>
    		</c:otherwise>
    	</c:choose>
    <!-- ***************************************************************************************** -->	 
  </div>
</div>

<!-- Footer -->
<!-- ********************************************************************************************* -->
<footer class="container-fluid text-center">
  <p>created by Team20's designed by Eileen</p>
</footer>

</body>
</html>