<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<!-- scirpt추가 -->
<link rel="stylesheet" type="text/css" href="/css/recommendDetail.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

<script>
	$(document).ready(function() {
		$(window).scroll(function() {
			var scroll = $(window).scrollTop();
			if (scroll > 1) {
				$("#nav_bar").css("background", "white");
				$("#nav_bar").css("opacity", "0.5");
				$("#nav_bar").css("color", "black");
			} else {
				$("#nav_bar").css("background", "white");
				$("#nav_bar").css("opacity", "1");
			}
		})
	})

	function review(memberId) {
		if (memberId = null) {
			alert("로그인 후 이용 가능합니다.");
			return false;
		} else {
			return true;
		}
	}
	
    $(document).ready(function() {  /* script 추가 */
        $(".review .accordion_title").click(function() {
            if ($(this).next("div").is(":visible")) {
                $(this).next("div").slideUp("fast");
            } else {
                $(".review .accordion_sub").slideUp("fast");
                $(this).next("div").slideToggle("fast");
            }
        });
    });
	
    function reviewdelete() {
    	return confirm("삭제하시겠습니까?");	
    };
</script>

</head>

<body>
	<header>
		<div id="nav_bar">
			<div id="nav_bar_menu">
				<ul>
					<li><a href="/recommend/listview">Recommend</a></li>
					<li><a href="#">Self</a></li>
					<li><a href="#">Other</a></li>
					<li><a href="#">Used Deal</a></li>
					<li><a href="#">Community</a></li>
				</ul>
			</div>
			<div id="nav_bar_logo">
				<a href="/mainpage/view">Assemble</a>
			</div>
			<div id="nav_bar_other">
				<div id="wrap">
					<form action="" autocomplete="on">
						<input id="search" name="search" type="text"
							placeholder="검색어를 입력하세요."><input id="search_submit"
							value="Rechercher" type="submit">
					</form>
				</div>
				<div id="cart">
					<a href="#" class="fas fa-shopping-cart fa-lg"
						style="color: black;"></a>
				</div>
				<div id="login">
					<a href="#" class="fas fa-user fa-lg" style="color: black;"></a>
				</div>
			</div>
		</div>
	</header>
	<div class="header_space"></div>


	<section>
		<div class="aside"></div>
		<div class="section_main">
			<div id="detail_main">
				<div class="detail_main_left">
					<img src="/upload/${pFilename }"
						style="width: 90%; height: 90%; padding-top: 120px; padding-left: 100px;">
				</div>
				<div class="detail_main_right">
					<table>
						<tr>
							<th
								style="font-size: 22px; font-weight: bolder; text-align: center">부품</th>
							<th
								style="font-size: 22px; font-weight: bolder; padding-left: 100px; text-align: right;">수량</th>
							<th
								style="font-size: 22px; font-weight: bolder; text-align: center;">가격</th>
						</tr>
						<c:forEach var="productList" items="${productList }">
							<c:if test="${fn:contains(productList.pCode,'CPU') }">
								<tr>
									<!-- CPU  -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>

								</tr>
							</c:if>

							<c:if test="${fn:contains(productList.pCode,'MAINBOARD') }">
								<tr>
									<!-- 메인보드 -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>

							<c:if test="${fn:contains(productList.pCode,'GPU') }">
								<tr>
									<!-- 그래픽카드 -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>

							<c:if test="${fn:contains(productList.pCode,'HDD') }">
								<tr>
									<!-- HDD -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>

							<c:if test="${fn:contains(productList.pCode,'SSD') }">
								<tr>
									<!-- SSD -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>
							<c:if test="${fn:contains(productList.pCode,'RAM') }">
								<tr>
									<!-- RAM -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>
							<c:if test="${fn:contains(productList.pCode,'POWER') }">
								<tr>
									<!-- POWER -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>
							<c:if test="${fn:contains(productList.pCode,'COOLER') }">
								<tr>
									<!-- COOLER -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>
							<c:if test="${fn:contains(productList.pCode,'CASE') }">
								<tr>
									<!-- SKIN -->
									<td class="detail_component">${productList.pName}</td>
									<td class="detail_count">${productList.pAccount }</td>
									<td class="detail_price"><fmt:formatNumber value="${productList.pPrice }" pattern="###,###,###"/></td>
								</tr>
							</c:if>
						</c:forEach>
					</table>
				</div>
			</div>
			<hr
				style="width: 51%; height: 2px; background-color: gray; border-top: 1px; opacity: 0.4; margin-left: 645px;">
			<div id="account">
				<div class="detail_main_top_left">
					<b>총 합계 금액</b>
				</div>
				<div class="detail_main_top_right">
				<fmt:formatNumber value="${totalPrice }" pattern="###,###,###"/>
				</div>
			</div>
			<div id="basket">
				<img src="/img/%EC%9E%A5%EB%B0%94%EA%B5%AC%EB%8B%88.PNG" alt="장바구니"
					style="width: 80px; padding-bottom: 30px;"> &nbsp;&nbsp; <a
					href="/basket/insert?aNo=${recommend.aNo }"><b
					style="font-size: 50px;">장바구니</b></a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<img src="/img/%EA%B2%B0%EC%A0%9C%EB%B2%84%ED%8A%BC.PNG" alt="결제하기"
					style="width: 80px; padding-bottom: 37px;"> &nbsp;&nbsp; <a
					href="#"><b style="font-size: 50px; color: red;">결제하기</b></a>
			</div>
			<div id="info">
				<a href="#info">상품정보</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#order_review">구매후기</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#notice">취소/반품/교환 정보</a>
			</div>
			<hr
				style="width: 87.5%; height: 2px; background-color: gray; border-top: 1px; opacity: 0.4;">
			<div id="content">
				<c:forEach var="productList" items="${productList }">

					<c:if test="${fn:contains(productList.pCode,'CPU') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'HDD') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br> <br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'COOLER') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'GPU') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'MAINBOARD') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'POWER') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'RAM') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'CASE') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br> 
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>

					<c:if test="${fn:contains(productList.pCode,'SSD') }">
						<div class="component">
							<div class="component_left">
								${productList.pName} <br><br><br>
								${productList.pContents}
							</div>
							<div class="component_right">
								<img src="/upload/${productList.pFilename }">
							</div>
						</div>
					</c:if>
				</c:forEach>
				<div class="component">
					<div class="component_left">공백</div>
					<div class="component_right"></div>
				</div>
			</div>
			<div class="section_space" style="text-align: center;">
				<div id="order_review">구매 후기</div>
				<div class="buy_review"
					style="text-align: right; padding-right: 30px;">
					<a
						href="/recommend/writeform?pCode=${pCode }&pFilename=${pFilename}">구매후기
						작성</a>
				</div>
			</div>
			<div class="review">
				<!-- 수정 시작점 -->
				<div class="review_title" border="1">
					<div class="review_title_left">제목</div>
					<div class="review_title_middle">작성자</div>
					<div class="review_title_right">날짜</div>
				</div>
				<div class="review_contents">
					<c:forEach var="reviewList" items="${reviewList }">
						<div class="accordion_title">
							<div class="accordion_title_left">${reviewList.reviewTitle }</div>
							<div class="accordion_title_middle">${reviewList.memberId }</div>
							<div class="accordion_title_right">${reviewList.enrollDate }</div>
						</div>
						<div class="accordion_sub">
							<div style="width: 80%; height: 100%; float: left; line-height: 50px;">${reviewList.reviewContents }</div>
							<div
								style="width: 20%; height: 100%; float: left; line-height: 50px; padding-left: 75px;">
								<c:if test="${sessionScope.member.memberId eq reviewList.memberId }">
								<a class="btn btn-primary" href="/recommend/review/update?pCode=${pCode }&reviewNo=${reviewList.reviewNo }&pFilename=${pFilename}">수정</a> 
								<a	class="btn btn-primary" href="/review/delete?pCode=${reviewList.pCode }&reviewNo=${reviewList.reviewNo}&pFilename=${pFilename}" onclick="return reviewdelete()">삭제</a>
								</c:if>
							</div>
						</div>
					</c:forEach>
					<div id="section_contents_bottom"
						style="margin-left: 633px; margin-top: 14px;">
						${reviewpageNavi }</div>
				</div>
				<!-- 수정 끝나는곳 -->
			</div>
			<div class="notice">
				<div class="notice_change">
					<div class="notice_change_left"></div>
					<div class="notice_change_right"></div>
				</div>
				<div class="notice_warning">
					<div class="notice_warning_left"></div>
					<div class="notice_warning_right"></div>
				</div>
			</div>
		</div>
		<div class="aside"></div>
	</section>

	<footer>
		<div class="aside"></div>
		<div id="footer_icon">
			<h3>Assemble</h3>
		</div>
		<div id="footer_contents">
			<ul>
				<li>(주)어셈블</li>
				<li>대표이사: 노유진</li>
				<li>서울특별시 중구 남대문로 120 대일빌딩 2F,3F</li>
				<li>사업자등록번호: XXX-XX-XXXXXX</li>
				<li>COPYRIGHT © TENBYTEN ALL RIGHTS RESERVED.</li>
			</ul>
		</div>
		<div id="footer_icon">
			<div id="footer_icon_split">
				<i class="fas fa-headset fa-5x"></i>
			</div>
			<div id="footer_empty"></div>
			<div id="footer_icon_split">
				<i class="fas fa-money-check-alt fa-4x"></i>
			</div>
		</div>
		<div id="footer_contents">
			<div id="footer_contents1">
				<ul>
					<li class="phone">02-1234-5678</li>
					<li class="time">평일 09:00~18:00 / 점심시간 12:00~13:00</li>
					<li class="notice">주말 및 공휴일은 휴무입니다.</li>
				</ul>
			</div>
			<div id="footer_empty"></div>
			<div id="footer_contents1">
				<ul>
					<li class="account">국민은행 01234567-00-1234567</li>
					<li class="account_holder">예금주: 노유진</li>
				</ul>
			</div>
		</div>
		<div class="aside"></div>
	</footer>

	<!-- 후기 작성 글 보는 모달창 -->

	<%-- <div class="modal fade" id="modaltitle" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
				  <!-- modal창에 제목이 들어가는 부분 -->
				  <c:forEach var="reviewList" items="${reviewList }">
					<h5 class="modal-title" id="exampleModalLabel">
					${reviewList.reviewTitle }
					</h5>
					</c:forEach>
					<button class="close" type="button" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">X</span>
					</button>
				</div>
				<!-- modal창에 내용이 들어가는 부분 -->
				<div class="modal-body">내용</div>
				<div class="modal-footer">
					<a class="btn" id="modalY" href="">수정</a>
					<a class="btn" id="modalY" href="#">삭제</a>
				</div>
			</div>
		</div>
	</div> --%>
</body>
</html>