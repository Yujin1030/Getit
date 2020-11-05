<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q&A 게시판</title>
</head>
<body>
		
	<h1>Q&A 게시판</h1>
	
	<form action="/qa/addqa" method="get">
		<input type="submit" value="추가">
	</form>
	<a href="/qa/deleteqa">삭제</a>
	
	<table border="1">
		<tr>
		
			
			<th><input type="checkbox">전체 체크</th>
			<th>글 번호</th>
			<th>글 제목</th>
			<th>글 쓴이</th>
			<th>작성일</th>
			
		</tr>
		
		<c:forEach items="${qList}" var="qaBoard" varStatus="index">
			<input type="checkbox" id="select">
			<tr>
				
				<td><input type="checkbox"></td>
				<td>${qaBoard.qNo }</td>
				<td>${qaBoard.qTitle }</td>
				<td>${qaBoard.memberId }</td>
				<td>${qaBoard.qDate }</td>
			
			</tr>	
		</c:forEach>
	</table>

</body>
</html>