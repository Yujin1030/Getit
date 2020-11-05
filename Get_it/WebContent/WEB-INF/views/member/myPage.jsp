<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>

<form action="/member/update" method="post">
	<fieldset>
	<legend>마이페이지</legend>
		<ul>
			<li>아이디 *</li>
			<li><input type="text" placeholder="아이디를 입력하세요" name="userId"
				id="userId" value="${sessionScope.member.memberId }" style="color:gray;" readonly></li>
			<br>
			<li>이메일 *</li>
			<li><input type="email" placeholder="이메일을 입력하세요" name="email"
				id="email" value="${member.email }"style="color : gray;" readonly ></li>
			<br>
			<li>이름 *</li>
			<li><input type="text" placeholder="이름을 입력하세요" name="userName"
				id="userName" value="${sessionScope.member.memberName }" style="color : gray;" readonly></li>
			<br>
			
			<li>비밀번호*</li>
			<li><input type="password" placeholder="기존 비밀번호"
				name="userPwd" id="userPwd" required></li><span id="out"></span>
			
			<li>새비밀번호*</li>
			<li><input type="password" placeholder="새 비밀번호"
				name="userPwd" id="userPwd" required></li><span id="out"></span>
			<br>
			<li>새비밀번호 확인*</li>
			<li><input type="password" placeholder="새 비밀번호를 다시 입력하세요"
				name="userPwdRe" required></li>
			<br>
			<li>휴대폰 번호*</li>
			<li><input type="phone" placeholder="휴대폰 번호를 입력하세요" name="phone"
				value="${member.phone }"></li>
			<br>
			
			<li>우편주소*</li>			
			<li><input type="text" id="postcode" name="zipcode" placeholder="우편번호" value="${member.zipcode }" ></li>
			<li><input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br></li>
			<li><input type="text" id="address" name="address"placeholder="주소" value="${member.address }"><br></li>
			<li><input type="text" id="detailAddress"name ="detailAddress" placeholder="상세주소" value="${member.detailAddress }"></li>
			
			

			<li>생년월일*</li>
			<li><input type="text" placeholder="나이를 입력하세요" name="dob" value="${member.dob }" readonly></li>
			<br>
			<li>성별 *</li>
			<li>
				<c:if test="${member.gender eq 'M' }">
				<input type="radio" name="gender" value="M" checked> Male
				<input type="radio"	name="gender" value="F" readonly> Female
				</c:if>
				<c:if test="${member.gender eq 'F' }">
				<input type="radio" name="gender" value="M" readonly>Male
				<input type="radio"	name="gender" value="F" checked>Female
				</c:if>
			</li>
			
		<!-- 	<li><input type="radio" name="gender" class="gender" value="M">Male
				<input type="radio" name="gender" class="gender" value="F">Female<br></li> -->
							

			<li><input type="submit" value="수정"></li>
			<li><input type="reset" value="취소"></li>

		</ul>
	
		</fieldset>
	</form>
	
	<script>
		function question(){
			return confirm("정말로 탈퇴하시겠습니까?");
		}
	</script>
	
	<a href="/index.jsp">메인페이지 이동하기</a>
	<a href="/member/delete" onclick='return question();'>회원 탈퇴하기</a>

</body>
</html>