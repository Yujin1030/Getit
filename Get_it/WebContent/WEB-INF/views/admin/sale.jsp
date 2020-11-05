<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매중</title>
</head>
<body>

	<h1>판매 중</h1>
	<input type="button" id="delete"><label for="id">삭제</label>
	<table border="1">
		<tr>
			<th>상품번호</th>
			<th>상품코드</th>
			<th>상품이름</th>
			<th>상품수량</th>
			<th>상품가격</th>
			<th>상세내용</th>
		</tr>
		
		<c:forEach items="${saleList}" var="sale" varStatus="index">
			<input type="checkbox" id="select">
			<tr>
				<td>${sale.productNo }</td>
				<td>${sale.productCode }</td>
				<td>${sale.productName }</td>
				<td>${sale.productAmount }</td>
				<td>${sale.productPrice }</td>
				<td><a href="/Inventory/productInfo?productNo=${sale.productNo}">${sale.productInfo }</a></td>
				
			</tr>	
		</c:forEach>
	</table>
	

</body>
</html>