<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/style.css" type="text/css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- login and register button font -->
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR" rel="stylesheet">

<style type="text/css">

.failMeta_body{

position:absolute;
top:100px;
left:200px;
margin-right:100px;
margin-left:100px;
margin-top:50px;
}


.form-control.failMeta{
font-family: 'Noto Sans KR', sans-serif;
font-size:10px;
margin:0 auto;
}
.ins{
width:150%;
margin-top:30px;
margin-bottom:30px;
}

.row{
height:50px;
}

.failMeta_panel{
width:500px;
height:500px;
}


</style>


</head>
<body>

	<div class="failMeta_body">
		<h1>메타마스크에 접속하고 로그인하시길 바랍니다.</h1>
		<div>
		    <div>
	            <div class="failMeta_panel">
	                <form action="login.bla" method="POST">
	                    <div class="ins">
	                        <button type="submit" id="loginBTN" class="form-control failMeta btn btn-danger">로그인</button>
	                    </div>
	                    
	                </form>
	            </div>
		    </div>
		</div>
	</div>

</body>
</html>