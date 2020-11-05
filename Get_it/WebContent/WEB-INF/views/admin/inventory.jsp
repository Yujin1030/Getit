<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재고관리</title>
</head>
<body>
	
	<h1>재고관리</h1>
	<input type="button" id="add"><label for="id">추가</label>
	<input type="button" id="delete"><label for="id">삭제</label>
	<table border="1">
		<tr>
		<!-- 	<th>재고번호</th>
			<th>상품번호</th>
			<th>상품코드</th>
			<th>상품이름</th>
			<th>상품수량</th>
			<th>상품가격</th>
			<th>상세내용</th> -->
			
			<th><input type="checkbox">전체 체크</th>
			<th>이미지</th>
			<th>상품명</th>
			<th>상품가격</th>
			<th>카테고리</th>
		</tr>
		
		<c:forEach items="${ivList}" var="inventory" varStatus="index">
			<input type="checkbox" id="select">
			<tr>
			
				<td><input type="checkbox"></td>
				<td>${inventory.productImg }</td>
				<td>${inventory.productName }</td>
				<td>${inventory.productPrice }</td>
				<td>${inventory.productCategory }</td>
				<%-- <td>${inventory.inventoryNo }</td>
				<td>${inventory.productNo }</td>
				<td>${inventory.productCode }</td>
				<td>${inventory.productName }</td>
				<td>${inventory.productAmount }</td>
				<td>${inventory.productPrice }</td>
				<td><a href="/admin/productInfo?productNo=${stock.productNo}">${sale.productInfo }</a></td>
				 --%>
			</tr>	
		</c:forEach>
	</table>


</body>
</html>