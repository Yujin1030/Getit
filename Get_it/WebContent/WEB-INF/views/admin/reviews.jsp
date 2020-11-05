<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reviews</title>
</head>
<body>

	<h1>Review</h1>
	
	<form action="/reviews/writeForm" method="get">
		<input type="submit" value="추가">
	</form>
	<a href="/reviews/delete">삭제</a>
	
	<table border="1">
		<tr>
		
			
			<th><input type="checkbox">전체 체크</th>
			<th>후기 번호</th>
			<th>제목</th>
			<th>날짜</th>
			<th>회원아이디</th>
			
		</tr>
		
		<c:forEach items="${rvList}" var="reviews" varStatus="index">
			<input type="checkbox" id="select">
			<tr>
				
				<td><input type="checkbox"></td>
				<td>${reviews.reviewsNo }</td>
				<td>${reviews.rTitle }</td>
				<td>${reviews.rDate }</td>
				<td>${reviews.memberId }</td>
			
			</tr>	
		</c:forEach>
	</table>
	

</body>
</html>