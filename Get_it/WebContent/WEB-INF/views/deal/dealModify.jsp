<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>
	<h1>게시물 수정</h1>
	<form action="/deal/modify" method="post" enctype="multipart/form-data">
		<input type="hidden" name="dealNo" value="${deal.dealNo }">
		<input type="hidden" value="${member.memberId }">
		<input type="text" size="100" placeholder="제목을 작성하세요" name="title"><br>
		사진 업로드하기 : <input type="file" name="image"><br>
		<textarea rows="30" cols="100" placeholder="내용을 작성하세요" name="contents"></textarea><br>
		<input type="text" size="100" placeholder="판매 금액을 작성하세요" name="price"><br>
		<input type="submit" value="완료">
		<input type="reset" value="취소">
	</form>
</body>
</html>