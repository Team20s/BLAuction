<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BLAuction_회원가입</title>
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


<script src="https://github.com/ethereum/web3.js/blob/develop/dist/web3.min.js"></script>
<!-- web3.eth.accounts[0] -->


<link href="https://fonts.googleapis.com/css?family=Jua|Stylish" rel="stylesheet">

<script type="text/javascript">
// opener관련 오류가 발생하는 경우 아래 주석을 해지하고, 사용자의 도메인정보를 입력합니다.
// (＂팝업 API 호출 소스"도 동일하게 적용시켜야 합니다.)
//document.domain = "abc.go.kr";
function goPopup(){
//경로는 시스템에 맞게 수정하여 사용
//호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를
//호출하게 됩니다.
var pop = window.open("jusoPopup.bla","pop","width=570,height=420, scrollbars=yes, resizable=yes");
//** 2017년 5월 모바일용 팝업 API 기능 추가제공 **/
// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서
// 실제 주소검색 URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.
// var pop = window.open("/popup/jusoPopup.jsp","pop","scrollbars=yes, resizable=yes");
}
function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn , detBdNmList, bdNm, bdKdcd, siNm, sggNm, emdNm, liNm, rn, udrtYn, buldMnnm, buldSlno, mtYn, lnbrMnnm, lnbrSlno, emdNo){
// 2017년 2월 제공항목이 추가되었습니다. 원하시는 항목을 추가하여 사용하시면 됩니다.
document.form.roadFullAddr.value = roadFullAddr;
document.form.roadAddrPart1.value = roadAddrPart1;
document.form.roadAddrPart2.value = roadAddrPart2;
documentform.addrDetail.value = addrDetail;
document.form.zipNo.value = zipNo;
}
</script>




<script>

var resultt = "<%=(String)request.getAttribute("resultt")%>"

if(resultt != 'null') {
	if(resultt == 'asdd') {
		alert("이미 있는 email 입니다.");
	}
}
</script>


<script type="text/javascript">
$(function(){
   if(typeof web3 !== 'undefined'){
        web3 = new Web3(web3.currentProvider);
        //alert(web3.currentProvider) //현재 이더리움 네트워크에 연결된 커넥션
        $("#member_account").val(web3.eth.accounts[0]);
    }
    else{
        alert('metamask를 준비하세요');
        alert('없으면 수동으로 이더리움넷에 접속합니다.');
        web3 = new Web3(Web3.providers.HttpProvider('이더리움 넷 주소'))
    }
   
   
})


</script>

<script type="text/javascript">
    function tocheckpw2() {
        var pw = document.getElementById("pw").value;
        var pwck = document.getElementById("pwd2").value;
 
        if (pw != pwck) {
            document.getElementById('pwsame').innerHTML = '비밀번호가 틀렸습니다. 다시 입력해 주세요';
            return false;
        }
    }
</script>


<script>
$(document).ready(function(){
$('.pass_show').append('<span class="ptxt">Show</span>');  
$("#address").val($("#confmKey").val());

});
  

$(document).on('click','.pass_show .ptxt', function(){ 

$(this).text($(this).text() == "Show" ? "Hide" : "Show"); 

$(this).prev().attr('type', function(index, attr){return attr == 'password' ? 'text' : 'password'; }); 

});  
</script>


<style type="text/css">

.register_body{

position:absolute;
top:100px;
left:200px;
margin-right:100px;
margin-left:100px;
margin-top:50px;
}


.form-control.registers{
font-family: 'Noto Sans KR', sans-serif;
font-size:10px;
margin:0 auto;
}

.write{
font-family: 'Jua', sans-serif;
font-family: 'Stylish', sans-serif;
font-size:20px;
}

.ins{
width:150%;
margin-top:30px;
margin-bottom:30px;
}


.row{
height:50px;
}

#userNAME{
   margin:0 auto;
}
.register_panel{
width:500px;
height:500px;
}

#confrimRESULT{
text-color:red;
}

.pass_show{position: relative} 

.pass_show .ptxt { 

position: absolute; 

top: 50%; 

right: 10px; 

margin-left:100px;

padding-left:50px;	

z-index: 1; 

color: #f36c01; 

margin-top: 5px; 

cursor: pointer; 

transition: .3s ease all; 

} 

.pass_show .ptxt:hover{color: #333333;} 


</style>



</head>
<body>
   <div class="register_body">
      <img src="img/logo.PNG">
      <div>
          <div>
               <div>
                   <form action="registerimpl.bla" class="register_panel" method="POST" onsubmit="return tocheckpw2()" >
                      <div class="ins">
                      	<label class="write">이름</label>
                           <input type="text" id="name" class="form-control registers" name="name" placeholder="NAME" autofocus required>
                      </div>
                   
                      <div class="ins">
                      <label class="write">이메일</label>
                           <input type="text" id="email" class="form-control registers" name="email" placeholder="EMAIL" autofocus required>
                      </div>
                      
                      <div class="ins">
                      <label class="write">전화번호</label>
                           <input type="text" id="phone" class="form-control registers" name="phone" placeholder="PHONE NUMBER" autofocus required>
                      </div>
                      
                      <div class="ins pass_show">
                      	<label class="write">비밀번호</label>
	                        <input type="password" id="pw" class="form-control registers" name="pw" placeholder="Password" autofocus required>
	                            
                       </div>
                      
                      <div class="ins pass_show">
                      <label class="write">비밀번호 재확인</label>
                           <input type="password" id="pwd2" class="form-control registers" placeholder="Password Confirm" autofocus required>
                      </div>
                      
                      <p id="pwsame" style="color:red;"></p>
                      
                      <div class="ins">
                      <label class="write">생년월일</label>
                         <input type="date" id="birth" class="form-control registers" name="birth" placeholder="Birth" autofocus required>
                      </div>
                      
                      <div class="ins">
                      	<label class="write">지갑 주소</label>
                      	<input type="text" id="member_account" class="form-control registers" name="member_account">
                      </div>
                      
                      
                      <div class="ins">
                      <label class="write">거주지</label>
                         <div class="row">
                            <div class="col-lg-11 col-md-11 col-xs-11">
                               <input type="text" id="address" class="form-control registers" name="address" placeholder="Home address" autofocus required>
                            </div>
                            
                            <button onClick="goPopup();" value="팝업"><img src="img/map.png"></button>
                     		<!--도로명주소 전체(포맷)<input type="text" id="roadFullAddr" name="roadFullAddr" /><br>
도로명주소 <input type="text" id="roadAddrPart1" name="roadAddrPart1" /><br>
고객입력 상세주소<input type="text" id="addrDetail" name="addrDetail" /><br>
참고주소<input type="text" id="roadAddrPart2" name="roadAddrPart2" /><br>
우편번호<input type="text" id="zipNo" name="zipNo" /> -->
                         
                         
                         </div>
       
                      </div>

                       <div class="ins">
                           <input type="submit" id="registerBTN" class="form-control registers btn btn-danger" value="회원가입">
                       </div>
                   </form>
               </div>
          </div>
      </div>
   </div>
   


</body>
</html>