<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지</title>
</head>
<body>
	<div class="order">
		<h2><img src=""> 주문</h2>
		<ul>
			<li><img src=""><a href="/admin/deopositWaiting">입금 대기</a></li> <li>개</li><br>
			<li><img src=""><a href="/admin/paymentCompleted">결제 완료</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/readyfordelivery">배송 준비</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/delivering">배송 중</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/return">취소 요청</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/exchange">반품 요청</a></li> <li>${ }개</li><br>
		</ul>
	</div>
	<div class="product">
		<h2><img src=""> 상품</h2>
		<ul>
			<li><img src=""><a href="/admin/sale">판매 중</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/outofstock">품절</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/inventory">재고 관리</a></li> <li>${ }개</li><br>
		</ul>
	</div>
	<div class="board">
		<h2><img src=""> 게시글</h2> 
		<ul>
			<li><img src=""><a href="/admin/qa">Q&A</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/usertrade">중고 거래</a></li> <li>${ }개</li><br>
			<li><img src=""><a href="/admin/reviews">Review</a></li> <li>${ }개</li><br>
			
		</ul>
	</div>


</body>
</html>