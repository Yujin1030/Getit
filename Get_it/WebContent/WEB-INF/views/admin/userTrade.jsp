<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중고 거래</title>
</head>
<body>

<h1>중고 거래</h1>
	
	<form action="/usertrade/addWrite" method="get">
		<input type="submit" value="추가">
	</form>
	<a href="/usertrade/delete">삭제</a>
	
	<table border="1">
		<tr>
		
			
			<th><input type="checkbox">전체 체크</th>
			<th>게시물번호</th>
			<th>제목</th>
			<th>이미지</th>
			<th>가격</th>
			<th>작성일</th>
			<th>회원아이디</th>
			
		</tr>
		
		<c:forEach items="${utList}" var="utBoard" varStatus="index">
	
			<tr>
				
				<td><input type="checkbox"></td>
				<td>${utBoard.uNo }</td>
				<td>${utBoard.uTitle }</td>
				<td>${utBoard.uImg }</td>
				<td>${utBoard.uPrice }</td>
				<td>${utBoard.uDate }</td>
				<td>${utBoard.memberId }</td>
			
			</tr>	
		</c:forEach>
	</table>

</body>
</html>