<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중고거래 게시판 예제</title>
</head>
<body>
	
<table border="1">
		<tr>
			<th>사진</th>
			<th>제목</th>
			<th>가격</th>
		</tr>
		 <c:forEach items="${dList }" var="deal" varStatus="index">
		 	<tr>
		 		<td><a href="/deal/select?dealNo=${deal.dealNo }">${deal.dealTitle }</a></td>
		 		<!-- 사진 넣는곳 -->
		 		<td>${deal.dealTitle }</td>
		 		<td>${deal.dealPrice }</td>
		 	</tr>
		 </c:forEach>
		 <tr>
		 	<td colspan="3" align="center">
		 		<form action="/deal/search" method="get">
		 			<input type="text" name="search">
		 			<input type="submit" value="검색">
		 		</form>
		 	</td>
		 	<td align="right">
				<form action="/deal/writeform" method="post">
					 <input type="submit" value="글쓰기">
				</form>
		 	</td>
		 </tr>
		 <tr>
		 	<td colspan="4" align="center">
		 		${pageNavi }
		 	</td>
		 </tr>
	</table>

</body>
</html>