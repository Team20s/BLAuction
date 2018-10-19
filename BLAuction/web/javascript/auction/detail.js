// 필요 작성 기능
// 1. 초기 데이터 뿌리기 ----- 서버사이드 에서 실행
// 2. 경매 입찰 ---- by web3 and ajax
// 3. 실시간으로 경매 시간 refresh. 서버시간 이용하기!
// 4. 내림 경매일 경우 시간이 지남에 따라 가격 변동 보여주기
// 5. 비밀 경매의 경우 한 사람이 여러번 입찰 하는 것이 필요 할 거 같음
//       --- 그러면 올림 경매일 경우에는??
// 6. 입찰 버튼 클릭시 입찰 모달 보여주기 ----- 경매 종류에 따라 다르게

var date;
var dtA;
var timeInterval;


function srvTime(auct_id) {
	  $.ajax({
	    type: 'GET',
	    cache: false,
	    url: '/timestamp.bla',
	    complete: function (req, textStatus) {
	      var dateString = req.getResponseHeader('Date');
	      if (dateString.indexOf('GMT') === -1) {
	        dateString += ' GMT';
	      }
	      date = new Date(dateString);
	      var timediff = dtA.getTime() - date.getTime();
	      
	      if(timediff <= 0){
	          $("#currentTimelimit").text('경매완료');
	          
	          var params = {
	      			"auct_id":auct_id
	      		}
	          
	          $.ajax({
	      		type:'POST',
	      		url:'successfulbiddingimpl.bla', /* DB로 접근 */
	      		data:params,
	      		datatype:'json',
	      		success:function(data){
	      			window.clearInterval(timeInterval);
      			},
	      		error:function(data){
	      			alert(data)
	      		}
	      	  })
	          return;
	      }
	      
	      timediff /= 1000;
	      var s = '';
	      
	      if(parseInt(timediff/86400) >= 1){
	      	s += parseInt(timediff/86400) + '일 '
	          timediff %= 86400;
	      }
	      if(parseInt(timediff/3600) >= 1){
	      	s += parseInt(timediff/3600) + '시간 '
	          timediff %= 3600;
	      }
	      if(parseInt(timediff/60) >= 1){
	      	s += parseInt(timediff/60) + '분 '
	          timediff %= 60;
	      }
	      s += Math.floor(timediff) + '초';
	      $("#currentTimelimit").text(s);
	      $("#currentTimelimitModal").text(s);
	    }
	  });
}

function getTimeStamp(d) {
	  var s =
	    leadingZeros(d.getMonth() + 1, 2) + '-' +
	    leadingZeros(d.getDate(), 2) + ' ' +

	    leadingZeros(d.getHours(), 2) + ':' +
	    leadingZeros(d.getMinutes(), 2) + ':' +
	    leadingZeros(d.getSeconds(), 2);

	  return s;
	}

function leadingZeros(n, digits) {
var zero = '';
n = n.toString();

if (n.length < digits) {
  for (i = 0; i < digits - n.length; i++)
    zero += '0';
}
return zero + n;
}


function makebidding(auction_id, secret){
	var price = $("#suggestedPrice").val();
	var cur_price = Number($("#currentPrice").text());
	
	price *= 1000;
	
	if(price ==0){
		alert("가격을 입력하세요");
		return;
	}
	if(secret==1){
		if(price < cur_price){
			alert("현재 가격보다 높은 가격을 입력하세요");
		}
	}
	var params = {
			"price":price,
			"auction_id":auction_id,
			"time":date.getTime(),
		}
	
	$.ajax({
		type:'POST',
		url:'biddingimpl.bla', /* DB로 접근 */
		data:params,
		datatype:'json',
		success:function(data){
			getBidList(auction_id);
			$("#biddingModal").modal('hide');
		},
		error:function(data){
			alert("biddingimpl.bla error")
		}
	})

	bidding(auction_id, price, date.getTime());
}

function getBidList(auction_id){
	var databaseTable = $("#databaseTable");
	databaseTable.empty();
	databaseTable.append("<tr><th>입찰자</th><th>입찰가</th><th>입찰 시간</th><th>트랜잭션 상태</th></tr>");
	
	var params = {
			"auction_id":auction_id
		}
	
	$.ajax({
		type:'POST',
		url:'auctionbidlist.bla', /* DB로 접근 */
		data:params,
		datatype:'json',
		success:function(data){
			for(i in data){
				s = "<tr>";
				s += "<td id=BidderName" + i +"> "+ data[i].bid_member_name + "</td>";
				s += "<td id=BiddersPrice" + i +"> "+ (data[i].bid_price * 0.001).toFixed(3) + "</td>";
				s += "<td id=BiddingTimestamp" + i +"> "+ getTimeStamp(new Date(data[i].bid_time)) + "</td>";
				s += "<td id=transactionStatus" + i +"> "+ data[i].bid_conf_status + "</td>";
				s += "</tr>"
				databaseTable.append(s);
			}
			//"<tr><td id="BidderName">회원1</td><td id="BiddersPrice">10</td><td id="BiddingTimestamp">12:00</td><td id="transactionStatus">Confirmed</td>"
		},
		error:function(data){
			alert(data)
		}
	})

}

function getBidListFromContract(){
	
}

