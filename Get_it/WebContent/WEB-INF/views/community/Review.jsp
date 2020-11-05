<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/community/review.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
    
<script>
    $(document).ready(function(){
      $(window).scroll(function(){
        var scroll = $(window).scrollTop();
        if (scroll > 1) {
          $("#nav_bar").css("background" , "white");
          $("#nav_bar").css("opacity" , "0.5");
          $("#nav_bar").css("color" , "black");
        }
        else{
          $("#nav_bar").css("background" , "white");
          $("#nav_bar").css("opacity" , "1");  
        }
      })
    })
</script>
</head>
<body>
	<header>
        <div id="nav_bar">
            <div id="nav_bar_menu">
                <ul>
                    <li><a href="#">Recommend</a></li>
                    <li><a href="#">Self</a></li>
                    <li><a href="/other/allList">Other</a></li>
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
                  <input id="search" name="search" type="text" placeholder="검색어를 입력하세요."><input id="search_submit" value="Rechercher" type="submit"> 
                  </form>
                </div>
                <div id="cart">
                    <a href="#" class="fas fa-shopping-cart fa-lg" style="color: black;"></a>
                </div>
                <div id="login">
                    <a href="#" class="fas fa-user fa-lg" style="color: black;"></a>
                </div>
            </div>
        </div>
    </header>
    <section>
        <div id="main_image">
        	<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
			  <ol class="carousel-indicators">
			    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
			    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
			  </ol>
			  <div class="carousel-inner">
			    <div class="carousel-item active">
			      <img src="/img/nakseo1.PNG" class="d-block w-100" alt="First" style="height: 800px;">
			    </div>
			    <div class="carousel-item">
			      <img src="/img/nakseo2.PNG" class="d-block w-100" alt="Second" style="height: 800px;">
			    </div>
			    <div class="carousel-item">
			      <img src="/img/nakseo3.PNG" class="d-block w-100" alt="Third" style="height: 800px;">
			    </div>
			  </div>
			  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
        </div>
        <div id="section_title2">
        
        <!--  ----------------------------------------------------------------------------------------------------------------------------------------------------------- -->
            <p>Community</p>
            <p><a href="#">QnA</a> | <a href="#" style="font-weight: bold;">후기</a></p>
            <div id="wrap2">
               <form action="/review/search" method="get" autocomplete="on">
               <input id="search" name="search1" type="text" placeholder="검색어를 입력하세요.">
               <input id="search_submit" value="Rechercher" type="submit"> 
               </form>
            </div>
            <hr style="width: 80%;">
        </div>
        <div id="empty_space1"></div>
        <table class="table table-hover" id="tb-list">
			<thead>
			  <tr>
			    <th scope="col">No</th>
			    <th scope="col">제목</th>
			    <th scope="col">작성자</th>
			    <th scope="col">등록날짜</th>
			    <th scope="col">조회수</th>
			  </tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="rv" varStatus="index">
					<tr>
					    <th scope="row">${rv.reviewNo }</th>
					    <td><a href="/review/select?reviewNo=${rv.reviewNo }" style="color: black;">${rv.rTitle }</a></td>
					    <td>${rv.memberId }</td>
					    <td>${rv.rDate }</td>
					    <td>${rv.viewCnt }</td>
				  	</tr>
				</c:forEach>
			</tbody>
		</table>
    	<div id="section_title2">
        	<nav aria-label="Page navigation example" id="paging">
        		<ul class="pagination">
        			${ pageNavi }
        		</ul>
        	</nav>
        	<div class="btn-group-toggle" id="input_btn" data-toggle="buttons">
        	<form action="/review/writeform" method="get">
			  <label class="btn btn-secondary active">
			    <input type="submit" value="작성하기">작성하기
			  </label>
			</form>
			</div>
	    </div>
	    
    </section>
    <footer>
        <div id="empty_space2"></div>
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
            <div id="footer_empty"></div>
            <div id="footer_contents1">
                <ul>
                    <li class="account">국민은행 01234567-00-1234567</li>
                    <li class="account_holder">예금주: 노유진</li>
                </ul>
            </div>
        </div>
        <div id="empty_space2"></div>
    </footer>
</body>
</html>