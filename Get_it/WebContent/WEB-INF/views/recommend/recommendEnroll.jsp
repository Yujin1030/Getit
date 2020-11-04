<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 화면</title>

</head>
<body>
	<form action="/recommend/insert" method="post"
		encType="multipart/form-data">
		<ul style="list-style: none">
			<li>상품 코드 (P_CODE): <input type="text" name="pCode">
			</li>
			<li>상품구분코드 (SEP_CODE) : <select name="sepCode">
					<option value="component">부속품</option>
					<option value="recommend">완제품</option>
					<option value="other">기타부품</option>
			</select>
			</li>
			<li>상품 이름 (P_NAME): <input type="text" name="pName">
			</li>
			<li>상품 가격 (P_PRICE ): <input type="text" name="pPrice"></li>
			<li>상품 내용 (P_Contents): <input type="text" name="pContents"></li>
			<li>상품카테고리 (P_CATEGORY) : 
			<select name="category">
					<option value="null">없음</option>
					<option value="사무용"> 사무용</option>
					<option value="게임용">게임용</option>
					<option value="그래픽용"> 그래픽용</option>
					<option value="방송용">방송용</option>
			</select>
			</li>
			<li>호환 코드 (P_COMCODE ): <input type="text" name="pComcode"></li>
			<li>완제품 관련 코드 (RELATED_PRODUCT) : <input type="text" name="relatedProduct"></li>
			<li>파일 업로드: <input type="file" name="upFile"></li>
		</ul>
		<input type="submit" value="등록하기"> <a
			href="javascript:history.back()">돌아가기</a>
	</form>
</body>
</html>