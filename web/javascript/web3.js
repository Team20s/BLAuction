/* 브라우저의 MetaMask 주소 값으로 web3 호출 */
$(document).ready(function(){
    if( typeof web3 !== 'undefined')
    {
        <!--현재 이더리움 네트워크에 연결된 커넥션 정보-->
        web3 = new Web3(web3.currentProvider)
        client_address = web3.eth.accounts[0];
    }
    else{
        alert('metamask를 준비하세요.')
        alert('없으면 수동으로 이더리움넷에 접속합니다.')
        web3 = new Web3(Web3.providers.HttpProvider('이더리움 넷 주소'))
    }
})

	<!-- Variables -->
var client_address = ''
var bidder_id = 0

	/* ************************************* */
	/* ********** Auction Manager ********** */
	/* ************************************* */

var manager_address = ''
var manager = web3.eth.contract(manager_ABI).at(manager_address)

/**
 * 1. Ajax로 DB에 경매정보를 등록
 * 2. fallback function으로 auction_id를 반환받음
 * 3. 반환받은 auction_id 및 경매정보로 Auction_Manager의 makeAuction을 실행
 * 4. makeAuctionEvent를 통해서 경매등록 시 이벤트 처리
 */
function makeAuction(){
	var due_date = $("#due_date").val()
	var auction_type = $("#auction_type").val()
	var start_price = $("#start_price").val()
	var cate_type_id = $("#cate_type_id").val()
	var description = $("#description").val()
	var down_price = $("#down_price").val()
	var down_term = $("#down_term").val()
	var auction_address = ''
	var auction_status = ''
	
	var params = {
		"bidder_id":bidder_id,
		"due_date":due_date,
		"auction_type":auction_type,
		"start_price":start_price,
		"seller_account":client_address,
		"cate_type_id":cate_type_id,
		"description":description,
		"down_price":down_price,
		"down_term":down_term,
		"auction_status":auction_status,
		"auction_address":auction_address
	}
		
	$.ajax({
		type:'POST',
		url:'createAuction.bla',
		data:params,
		datatype:'json',
		success:function(data){
			auction_id = data
			manager.makeAuction(function(err,res){
			}, auction_id, seller_id, due_date, start_price, auction_type, down_price, down_term)
		},
		error:function(data){
			alert(data)
		}
	})
}

/**
 * 옥션의 주소값을 반환하는 함수
 * 반환값을 auction_address 변수에 저장
 */
function getAuction(auction_id){
	manager.getAuction(function(err,res){ 
		auction_address = res
	}, auction_id)
}

/**
 * 경매등록 후 발생하는 이벤트
 */
manager.makeAuctionEvent().watch(function(err,res){
	var auction_id = res.args.auction_id
	var auction_address = res.args.auction_address
	
	/* ↓↓ 등록성공 화면처리 ↓↓ */
	
})

	/* ***************************** */
	/* ********** Auction ********** */
	/* ***************************** */	

/** 
 * Auction 컨트랙을 호출
 * 브라우저가 어떤 Auction에 대해 입찰할지 모르기 때문에 입찰 전 세팅 
 */
var auction_address = ''
var auction = ''
	
function set_auction(){
	auction = web3.eth.contract(auction_ABI).at(auction_address)
}

/**
 * 입찰 함수
 * 올림경매 : 현재 입찰자일 때 불가능
 * 내림경매 : 최초 1회만 가능
 * 비밀경매 : 최초 1회만 가능
 * 
 * TODO
 * 1. Ajax로 DB에 입찰자 정보를 등록
 * 2. fallback function으로 bid_id를 반환받음
 * 3. 반환받은 bid_id 및 입찰자 정보로 Auction의 bidding을 실행
 * 4. biddingEvent를 통해서 입찰 성공 시 이벤트 처리
 */
function bidding(price){
	var auction_id /* 쿠키에서 정보를 받아옴*/
	var price = $("#price").val()
	var time = new Date().getTime()
	
	var params = {
		"bidder_id":bidder_id,
		"auction_id":auction_id,
		"price":price,
		"time":time,
		"client_address":client_address
	}
	
	$.ajax({
		type:'POST',
		url:'bidding.bla', /* DB로 접근 */
		data:params,
		datatype:'json',
		success:function(data){
			alert(data)
		},
		error:function(data){
			alert(data)
		}
	})
	
	auction.bidding.sendTransaction(bidder_id, time, {from:client_address, value:web3.toWei(price, "finney")},  function(err, res){
        console.log("bidding() : ")
        console.log(res)
    });
}

auction.makeBidEvent().watch(function(){
	var bid_id = res.args.bid_id
	/* ↓↓ 입찰성공 화면처리 ↓↓ */
})

/** 
 * 낙찰 후 판매자 출금 함수 
 */
function withdraw_for_owner(fee){
	auction.withdraw_for_owner(function(err,res){
	}, fee)
}

auction.ownerWithdrawEvent().watch(function(err,res){
	var money = res.args.money
	var fee = res.args.fee
	/* ↓↓ 출금성공 화면처리 ↓↓ */
	
})

/**
 * 유찰자에 대한 환불 함수
 * TODO
 * 올림경매 : 유찰 시 바로 호출 가능
 * 내림경매 : 호출 불가능
 * 비밀경매 : 경매 종료 후 호출 가능
 */

function withdraw(){
	auction.withdraw(function(err,res){
	})
}

auction.withdrawEvent().watch(function(){
	var money = res.args.money
	/* ↓↓ 환불성공 화면처리 ↓↓ */
})

	/* ************************** */
	/* ********** ABIs ********** */
	/* ************************** */

var manager_ABI = [] 
var auction_ABI = []

	
	