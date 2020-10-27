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
			<li>완제품 이름: <input type="text" name="aName">
			</li>
			<li>완제품 가격: <input type="text" name="aPrice">
			</li>
			<li>완제품 수량: <input type="text" name="aAccount"></li>
			<li>완제품 상세내용: <input type="text" name="aDetail"></li>
			<li>상품 카테고리 : <select name="category">
					<option value="사무용">사무용</option>
					<option value="게임용">게임용</option>
					<option value="그래픽용">그래픽용</option>
					<option value="방송용">방송용</option>
			</select>
			</li>
			<li>---------------------완제품 부품 리스트---------------------</li>
			<li>POWER 코드: <select name="powerCode">
					<option value="">--선택--</option>
					<c:forEach var="powerList" items="${powerList }">
						<option value="${powerList.powerCode }">${powerList.powerCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>POWER 이름: <select name="powerName">
					<option value="">--선택--</option>
					<c:forEach var="powerList" items="${powerList }">
						<option value="${powerList.powerName }">${powerList.powerName }</option>
					</c:forEach>
			</select>
			</li>
			<li>POWER 가격: <input type="text" name="powerPrice"></li>
<li>=======================================</li>
			<li>SSD 코드: <select name="ssdCode">
					<option value="">--선택--</option>
					<c:forEach var="ssdList" items="${ssdList }">
						<option value="${ssdList.ssdCode }">${ssdList.ssdCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>SSD 이름: <select name="ssdName">
					<option value="">--선택--</option>
					<c:forEach var="ssdList" items="${ssdList }">
						<option value="${ssdList.ssdName }">${ssdList.ssdName }</option>
					</c:forEach>
			</select>
			</li>
			<li>SSD 가격: <input type="text" name="ssdPrice"></li>
<li>=======================================</li>
			<li>케이스 코드: <select name="skinCode">
					<option value="">--선택--</option>
					<c:forEach var="skinList" items="${skinList }">
						<option value="${skinList.skinCode }">${skinList.skinCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>케이스 이름: <select name="skinName">
					<option value="">--선택--</option>
					<c:forEach var="skinList" items="${skinList }">
						<option value="${skinList.skinName }">${skinList.skinName }</option>
					</c:forEach>
			</select>
			</li>
			<li>케이스 가격: <input type="text" name="skinPrice"></li>
<li>=======================================</li>
			<li>GPU 코드: <select name="gcardCode">
					<option value="">--선택--</option>
					<c:forEach var="gcardList" items="${gcardList }">
						<option value="${gcardList.gcardCode }">${gcardList.gcardCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>GPU 이름: <select name="gpuName">
					<option value="">--선택--</option>
					<c:forEach var="gcardList" items="${gcardList }">
						<option value="${gcardList.gcardName }">${gcardList.gcardName }</option>
					</c:forEach>
			</select>
			</li>
			<li>GPU 가격: <input type="text" name="gpuPrice"></li>
<li>=======================================</li>
			<li>HDD 코드: <select name="hddCode">
					<option value="">--선택--</option>
					<c:forEach var="hddList" items="${hddList }">
						<option value="${hddList.hddCode }">${hddList.hddCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>HDD 이름: <select name="hddName">
					<option value="">--선택--</option>
					<c:forEach var="hddList" items="${hddList }">
						<option value="${hddList.hddName }">${hddList.hddName }</option>
					</c:forEach>
			</select>
			</li>
			<li>HDD 가격: <input type="text" name="hddPrice"></li>
<li>=======================================</li>
			<li>CPUCOOLER 코드: <select name="coolerCode">
					<option value="">--선택--</option>
					<c:forEach var="coolerList" items="${coolerList }">
						<option value="${coolerList.coolerCode }">${coolerList.coolerCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>CPUCOOLER 이름: <select name="coolerName">
					<option value="">--선택--</option>
					<c:forEach var="coolerList" items="${coolerList }">
						<option value="${coolerList.coolerName }">${coolerList.coolerName }</option>
					</c:forEach>
			</select>
			</li>
			<li>CPUCOOLER 가격: <input type="text" name="cclPrice"></li>
<li>=======================================</li>
			<li>RAM 코드: <select name="ramCode">
					<option value="">--선택--</option>
					<c:forEach var="ramList" items="${ramList }">
						<option value="${ramList.ramCode }">${ramList.ramCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>RAM 이름: <select name="ramName">
					<option value="">--선택--</option>
					<c:forEach var="ramList" items="${ramList }">
						<option value="${ramList.ramName }">${ramList.ramName }</option>
					</c:forEach>
			</select>
			</li>
			<li>RAM 수량: <input type="text" name="ramAccount">
			</li>
			<li>RAM 가격: <input type="text" name="ramPrice"></li>
<li>=======================================</li>
			<li>CPU 코드: <select name="cpuCode">
					<option value="">--선택--</option>
					<c:forEach var="cpuList" items="${cpuList }">
						<option value="${cpuList.cpuCode }">${cpuList.cpuCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>CPU 이름: <select name="cpuName">
					<option value="">--선택--</option>
					<c:forEach var="cpuList" items="${cpuList }">
						<option value="${cpuList.cpuName }">${cpuList.cpuName }</option>
					</c:forEach>
			</select>
			</li>
			<li>CPU 가격: <input type="text" name="cpuPrice"></li>
<li>=======================================</li>
			<li>메인보드 코드: <select name="mainboardCode">
					<option value="">--선택--</option>
					<c:forEach var="mainboardList" items="${mainboardList }">
						<option value="${mainboardList.mainboardCode }">${mainboardList.mainboardCode }</option>
					</c:forEach>
			</select>
			</li>
			<li>메인보드 이름: <select name="mainboardName">
					<option value="">--선택--</option>
					<c:forEach var="mainboardList" items="${mainboardList }">
						<option value="${mainboardList.mainboardName }">${mainboardList.mainboardName }</option>
					</c:forEach>
			</select>
			</li>
			<li>메인보드 가격: <input type="text" name="mainboardPrice"></li>
			<li>파일 업로드: <input type="file" name="upFile"></li>
		</ul>
		<input type="submit" value="등록하기"> <a
			href="javascript:history.back()">돌아가기</a>
	</form>
</body>
</html>