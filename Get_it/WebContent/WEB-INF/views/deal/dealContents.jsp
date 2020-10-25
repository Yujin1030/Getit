<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>중고거래 게시물</title>
	
	<script>
		function question1() {
			return confirm ("정말로 수정하시겠습니까?");
		}
	
   		function question2() {
   			return confirm ("정말로 삭제하시겠습니까?");
   		}
   		
    </script>  
    
</head>
<body>
	<div style="border:1px solid black; height:100px; width:100px;"><img src="${pageContext.request.contextPath}//WEB-INF/image/?dealFileName=${contents.dealFileName }"></div>
	<h2>작성자 아이디 : ${contents.memberId }</h2>
		<input type="submit" value="채팅하기" onclick="window.open('/deal/chatToWriter', '판매자와 채팅중', 'width=400px, height=400px')">
	<br>
		<input type="submit" value="채팅하기" onclick="window.open('/deal/chatToBuyer', '구매자와 채팅중', 'width=400px, height=400px')">
	<h6> 
	제목 : ${contents.dealTitle }  / 
	작성일 : ${contents.dealDate } /
	가격 : ${contents.dealPrice }</h6>
	<h3>${contents.dealContents }</h3>
	<a href="/deal/main">목록</a>
	
	<!--  
	<c:if test="${contents.memberId eq sessionScope.member.memberId }">
	<a href="/deal/modifyform?dealNo=${contents.dealNo }" onclick="return question1();">수정</a>
	<a href="/deal/delete?dealNo=${contents.dealNo }" onclick="return question2();">삭제</a>
	</c:if>
	-->
	
</body>
</html>