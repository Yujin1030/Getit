<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입금 대기</title>
</head>
<body>
	<h1>입금대기</h1>
	<table border="1">
		<tr>
			<th>주문날짜</th>
			<th>고객 ID</th>
			<th>고객명</th>
			<th>연락처</th>
			<th>상품 상세정보</th>
			<th>주소</th>
			<th>택배사</th>
			<th>배송 요청사항</th>
		</tr>
		
		<c:forEach items="${dList}" var="deposit" varStatus="index">
			<tr>
				<td>${deposit.orderDate }</td>
				<!-- 하나의 게시글에 대한 내용을 검색하기 위해서 noticeNo를 서블릿으로 넘겨줌-->
				<td>${deposit.userID }</td>
				<td>${deposit.userName }</td>
				<td>${deposit.phone }</td>
				<td>${deposit.orderInfo }</td>
				<td>${deposit.address }</td>
				<td>${deposit.deliveryCP }</td>
				<td>${deposit.deliveryRequest }</td>
			</tr>	
		</c:forEach>
	</table>

</body>
</html>