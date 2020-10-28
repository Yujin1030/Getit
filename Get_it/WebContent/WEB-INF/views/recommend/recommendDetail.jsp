<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인페이지</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/recommendDetail.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

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
    </script>

</head>

<body>
    <header>
        <div id="nav_bar">
            <div id="nav_bar_menu">
                <ul>
                    <li><a href="#">Recommend</a></li>
                    <li><a href="#">Self</a></li>
                    <li><a href="#">Other</a></li>
                    <li><a href="#">Used Deal</a></li>
                    <li><a href="#">Community</a></li>
                </ul>
            </div>
            <div id="nav_bar_logo">
                <a href="#">Assemble</a>
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
    <div class="header_space"></div>


    <section>
        <div class="aside"></div>
        <div class="section_main">
            <div id="detail_main">
                <table>
                    <tr>
                        <th style="padding-left: 65px;"></th>
                        <th style="font-size: 22px; font-weight: bolder;">부품</th>
                        <th style="font-size: 22px; font-weight: bolder; padding-left: 100px;">수량</th>
                        <th style="font-size: 22px; font-weight: bolder;">가격</th>
                    </tr>
                    <tr>
                    	<!-- CPU -->
                        <td class="detail_img" rowspan="9"><img src="/upload/${recommend.fileName }" style="width: 80%; height: 70%;"></td>
                        <td class="detail_component">${cpu.cpuName}</td>
                        <td class="detail_count">${cpu.cpuPrice }</td>
                        <td class="detail_price">${cpu.cpuCount }</td>
                    </tr>
                    <tr>
                    	<!-- 메인보드 -->
                        <td class="detail_component">${mainboard.mainboardName }</td>
                        <td class="detail_count">${mainboard.mainboardCount }</td>
                        <td class="detail_price">${mainboard.mainboardPrice }</td>
                    </tr>
                    <tr>
                    	<!-- 그래픽카드 -->
                        <td class="detail_component">${gcard.gcardName }</td>
                        <td class="detail_count">${gcard.gcardCount }</td>
                        <td class="detail_price">${gcard.gcardPrice }</td>
                    </tr>
                    <tr>
                    	<!-- HDD -->
                        <td class="detail_component">${hdd.hddName }</td>
                        <td class="detail_count">${hdd.hddCount }</td>
                        <td class="detail_price">${hdd.hddPrice }</td>
                    </tr>
                    <tr>
                    	<!-- SSD -->
                        <td class="detail_component">${ssd.ssdName }</td>
                        <td class="detail_count">${ssd.ssdCount }</td>
                        <td class="detail_price">${ssd.ssdPrice }</td>
                    </tr>
                    <tr>
                    	<!-- RAM -->
                        <td class="detail_component">${ram.ramName }</td>
                        <td class="detail_count">${ram.ramCount }</td>
                        <td class="detail_price">${ram.ramPrice }</td>
                    </tr>
                    <tr>
                    	<!-- POWER -->
                        <td class="detail_component">${power.powerName }</td>
                        <td class="detail_count">${power.powerCount }</td>
                        <td class="detail_price">${power.powerPrice }</td>
                    </tr>
                    <tr>
                    	<!-- COOLER -->
                        <td class="detail_component">${cooler.coolerName }</td>
                        <td class="detail_count">${cooler.coolerCount }</td>
                        <td class="detail_price">${cooler.coolerPrice }</td>
                    </tr>
                    <tr>
                    	<!-- SKIN -->
                        <td class="detail_component">${skin.skinName }</td>
                        <td class="detail_count">${skin.skinCount }</td>
                        <td class="detail_price">${skin.skinPrice}</td>
                    </tr>
                </table>

            </div>
            <hr style="width: 51%;height: 2px; background-color:gray; border-top: 1px;opacity: 0.4; margin-left: 620px;">
            <div id="account">
                <div class="detail_main_top_left"><b>총 합계 금액</b></div>
                <div class="detail_main_top_right">999999</div>
            </div>
            <div id="basket">
                <img src="/img/%EC%9E%A5%EB%B0%94%EA%B5%AC%EB%8B%88.PNG" alt="장바구니" style="width: 80px; padding-bottom: 30px;">
                &nbsp;&nbsp;
                <a href="#"><b style="font-size: 50px;">장바구니</b></a>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <img src="/img/%EA%B2%B0%EC%A0%9C%EB%B2%84%ED%8A%BC.PNG" alt="결제하기" style="width: 80px; padding-bottom: 37px;">
                &nbsp;&nbsp;
                <a href="#"><b style="font-size: 50px; color: red;">결제하기</b></a>
            </div>
            <div id="info">
                <a href="#">상품정보</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="#">구매후기</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="#">취소/반품/교환 정보</a>
            </div>
            <hr style="width: 87.5%;height: 2px; background-color:gray; border-top: 1px;opacity: 0.4;">
            <div id="content">
                <div class="component">
                    <div class="component_left">
                        ${cpu.cpuName} <br>
                        ${cpu.cpuCode} <br>
                        ${cpu.cpuContent}
                    </div>
                    <div class="component_right"><img src="#"> </div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
                <div class="component">
                    <div class="component_left"></div>
                    <div class="component_right"></div>
                </div>
            </div>
            <div class="section_space" style="text-align: center;">구매후기</div>
            <div class="review">
                <table border="1;">
                    <tr>
                        <td class="review_title_top">제목</td>
                        <td class="review_memeber">작성자</td>
                        <td class="review_enrolldate">등록일자</td>
                    </tr>
                    <tr>
                        <td class="review_title">1</td>
                        <td class="review_memeber">후보1</td>
                        <td class="review_enrolldate">sysdate</td>
                    </tr>
                    <tr>
                        <td class="review_title">2</td>
                        <td class="review_memeber">후보2</td>
                        <td class="review_enrolldate">sysdate</td>
                    </tr>
                    <tr>
                        <td class="review_title">3</td>
                        <td class="review_memeber">후보3</td>
                        <td class="review_enrolldate">sysdate</td>
                    </tr>
                    <tr>
                        <td class="review_title">4</td>
                        <td class="review_memeber">후보4</td>
                        <td class="review_enrolldate">sysdate</td>
                    </tr>
                    <tr>
                        <td class="review_title">5</td>
                        <td class="review_memeber">후보5</td>
                        <td class="review_enrolldate">sysdate</td>
                    </tr>
                    <tr>
                        <td colspan="4">여기는 페이징</td>
                    </tr>
                </table>
                <div style="text-align: right; padding-right: 30px;"><a href="#">구매후기 작성</a></div>
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

</body></html>