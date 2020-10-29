<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src='https://code.jquery.com/jquery-3.2.1.min.js'></script>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="/css/selfPage.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
    <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter bootstrap/3.3.7/css/bootstrap.min.css"/> -->
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

													<!-- 아직 정리 덜 됨, 감안부탁합니다. ^오^7 -->










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
                    <a href="#" class="fas fa-shopping-cart fa-lg" style="color:black;"></a>
                </div>
                <div id="login">
                    <a href="#" class="fas fa-user fa-lg" style="color:black;"></a>
                </div>
            </div>
        </div>
    </header>
    
    
    
    
    
													<!-- SECTION AREA -->    
    
    <section>
      <form action="/test" method="get">
      <!-- Component Servlet AREA -->
      
      		<!-- 메인부품  --> 
           <input type="hidden" name="sendCPU" value="">
           <!-- <input type="hidden" name="sendMainboard">       일단 보류-->
           <input type="hidden" name="sendRAM">
           <input type="hidden" name="sendGCARD">
           <input type="hidden" name="sendSSD">
           <input type="hidden" name="sendCOOLER">
           <input type="hidden" name="sendPOWER">
           <input type="hidden" name="sendSKIN">
           <input type="hidden" name="sendHDD">
           
           <!-- 기타부품 -->
           <input type="hidden" name="sendDESKTOP">
           <input type="hidden" name="sendKEYBOARD">
           <input type="hidden" name="sendMOUSE">
           <input type="hidden" name="sendHEADSET">
           <input type="hidden" name="sendSPEAKER">
	  <!--  -->              
    <!-- M A I N  L O G O -->
        <div id="main_image">
            <img src="/img/onofflogo.gif" style="height: 100%; width: 100%;">
        </div>

    
    
    
    
    <!-- 셀프견적 영역 시작-->
         <div class="secHeader">
              <div class="sectextLine">
  <span class="fas fa-cog fa-spin" style="float: left;"></span><p><b>원하는 부품들을 선택하여 <br>
                   &nbsp;&nbsp;&nbsp;자신만의 PC를 조립해보세요 !</b></p>
              </div>
          <div class="sectextLineMiddle">
                  <p><b>S E L F</b></p>
          </div>
         </div>
        <!-- SECTION CONTENT AREA-->
        <div class="selfsectionContent">
            <div class="componentArea">
                <div class="componentAreaTopTitle">
                    <span class="fas fa-cog fa-spin" style="float: left; font-size: 25px;"></span>&nbsp;&nbsp;&nbsp;<b>PC Component</b>
                </div>
                <br><br><hr>
                          
                <div class="productListTop">
                    <div class="componentMenuBar"><b>부품선택</b></div>      
                    <div class="componentMenuBarTwo"><b>부품명</b></div>
                    <div class="componentMenuBarThree"><b>수량</b></div>
                    <div class="componentMenuBarFour"><b>가격</b></div>
                    <div class="productDelete"></div>
                </div>
                <br><hr>
                
                
                <!--모달 버튼영역-->
                
                <!--         CPU -->
             
                <div class="productList">
                     <div class="productButton">
  						<button type="button" data-toggle="modal" data-target="#CPU">
							<img src="/img_selfPage/CPUicon.png" alt="none"> 
						</button>
						                      
                     </div>  
                    <div class="productName">CPU : <span id="cpuName">미선택</span></div>
                    <div class="productCount"><span id="cpuCount"></span> EA</div>
                    <div class="productPrice"><span id="cpuPrice"></span> won</div>
                    <div class="productDelete"></div>
                    
                </div>
                
                
                
                <!--         MAINBOARD -->
                <div class="productList">
                     <div class="productButton">
				 	 	<button type="button" data-toggle="modal" data-target="#MAINBOARD">
							<img src="/img_selfPage/MAINBOARDicon.png" alt="none">
						</button>                    
                     </div>      
                    <div class="productName">메인보드 : <span id="mainboardName">미선택</span> </div>
                    <div class="productCount"><span id="mainboardName"></span> EA</div>
                    <div class="productPrice"><span id="mainboardPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                <!--         RAM -->
                <div class="productList">
                     <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#RAM">
							<img src="/img_selfPage/RAMicon.png" alt="none">
						</button>                     
                     </div>      
                    <div class="productName">RAM : <span id="ramName">미선택</span></div>
                    <div class="productCount"><span id="ramCount"></span> EA</div>
                    <div class="productPrice"><span id="ramPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                <!--         GCARD -->
                <div class="productList">
                     <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#GPU">
							<img src="/img_selfPage/GCARDicon.png" alt="none">
						</button>                     
                     </div>      
                    <div class="productName">그래픽카드 : <span id="gcardName">미선택</span></div>
                    <div class="productCount"><span id="gcardCount"></span> EA</div>
                    <div class="productPrice"><span id="gcardPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                
                <!--         SSD -->
                <div class="productList">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#SSD">
							<img src="/img_selfPage/SSDicon.png" alt="none"> 
						</button>
                    </div>      
                    <div class="productName">SSD : <span id="ssdName">미선택</span></div>
                    <div class="productCount"><span id="ssdCount"></span> EA</div>
                    <div class="productPrice"><span id="ssdPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                <!--         CPU-COOLER -->
                <div class="productList">
                     <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#CPUCOOLER">
							<img src="/img_selfPage/COOLERicon.png" alt="none">
						</button>                     
                     </div>      
                    <div class="productName"> CPU쿨러 : <span id="coolerName">미선택</span> </div>
                    <div class="productCount"><span id="coolerCount"></span> EA</div>
                    <div class="productPrice"><span id="coolerPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                <!--         POWER -->
                <div class="productList">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#POWER">
							<img src="/img_selfPage/POWERicon.png" alt="none">
						</button>                     
                    </div>      
                    <div class="productName">파워 : <span id="powerName">미선택</span> </div>
                    <div class="productCount"><span id="powerCount"></span> EA</div>
                    <div class="productPrice"><span id="powerPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                <!--         SKIN -->
                <div class="productList">
                     <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#SKIN">
							<img src="/img_selfPage/SKINicon.png" alt="none"> 
						</button>                     
                    </div>      
                    <div class="productName">케이스 : <span id="skinName">미선택</span> </div>
                    <div class="productCount"><span id="skinCount"></span> EA</div>
                    <div class="productPrice"><span id="skinPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                
                
                <!--         HDD -->
                <div class="productList">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#HDD">
							<img src="/img_selfPage/HDDicon.png" alt="none">
						</button>
                    </div>
                    <div class="productName">HDD : <span id="hddName">미선택</span></div>
                    <div class="productCount"><span id="hddCount"></span> EA</div>
                    <div class="productPrice"><span id="hddPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
            </div>   
            
            
            
            
            
            
        		<!-- 기타부품 영역-->
            <div class="componentAreaTwo">
              <div class="componentAreaTopTitleTwo">
				  <span class="fas fa-cog fa-spin" style="float: left; font-size: 25px;"></span>&nbsp;&nbsp;&nbsp;<b>PC 기타부품</b>                  
              </div>
               <br><br><hr>
                <div class="productListTop">
                    <div class="componentMenuBar"><b>부품선택</b></div>      
                    <div class="componentMenuBarTwo"><b>부품명</b></div>
                    <div class="componentMenuBarThree"><b>수량</b></div>
                    <div class="componentMenuBarFour"><b>가격</b></div>
                    <div class="productDelete">X</div>
                </div>
                <br><hr>
                
                
                
                
                <!-- 			모니터  -->
                <div class="productList2">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#DESKTOP">
							<img src="/img_selfPage/moniter.png" alt="none"> 
						</button>                    	
                    </div>      
                    <div class="productName">모니터 : <span id="desktopName">미선택</span></div>
                    <div class="productCount"><span id="desktopCount"></span> EA</div>
                    <div class="productPrice"><span id="desktopPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                <!--			키보드  -->
                <div class="productList2">
                     <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#KEYBOARD">
							<img src="/img_selfPage/KEYBOARDicon.png" alt="none"> 
						</button>                     	
                     </div>      
                    <div class="productName">키보드 : <span id="keyboardName">미선택</span></div>
                    <div class="productCount"><span id="keyboardCount"></span> EA</div>
                    <div class="productPrice"><span id="keyboardPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                <!--			마우스  -->
                <div class="productList2">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#MOUSE">
							<img src="/img_selfPage/MOUSEicon.png" alt="none"> 
						</button>	                    
                    </div>      
                    <div class="productName">마우스 : <span id="mouseName">미선택</span></div>
                    <div class="productCount"><span id="mouseCount"></span> EA</div>
                    <div class="productPrice"><span id="mousePrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                 
                 
                 
                <!--			헤드셋  -->
                <div class="productList2">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#HEADSET">
							<img src="/img_selfPage/HEADSETicon.png" alt="none"> 
						</button>                    
                    </div>      
                    <div class="productName">헤드셋 : <span id="headsetName">미선택</span></div>
                    <div class="productCount"><span id="headsetCount"></span> EA</div>
                    <div class="productPrice"><span id="headsetPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>
                
                
                
                
                <!--			스피커  -->
                <div class="productList2">
                    <div class="productButton">
						<button type="button" data-toggle="modal" data-target="#SPEAKER">
							<img src="/img_selfPage/SOUNDicon.png" alt="none">
						</button>               
                    </div>
                    <div class="productName">스피커 : <span id="speakerName">미선택</span></div>
                    <div class="productCount"><span id="speakerCount"></span>EA</div>
                    <div class="productPrice"><span id="speakerPrice"></span> won</div>
                    <div class="productDelete">X</div>
                </div>                                                                               
            </div>
            <div class="nullArea"></div>
            <div class="BuyCartArea">
				<button type="submit" class="btn btn-secondary btn-lg btn-block"><b>장바구니에 담기</b></button>
            </div>   
    </div>    
   	</form>
    
    
    
    
    
    
    													<!--              모달 영역 시작                             -->
    
    
    
    
    
    
    
    <!-- CPU Modal -->
	<div class="modal fade" id="CPU" tabindex="-1" role="dialog" aria-labelledby="CPU_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="CPU_TITLE"><b>CPU COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
			<c:forEach items="${ cpuList }" var="cList">
			<div>
				<span>
				<b><a href="javascript:cpuChoice('${cList.cpuCode}','${cList.cpuName}','${cList.cputCount}','${cList.cputPrice}')">${ cList.cpuCode }</a></b>
				 / ${ cList.productNum } / ${ cList.cpuName } / 
				 ${ cList.cputPrice } / ${ cList.cputContent } / 
				 ${ cList.cputCount }
				 </span>
			</div>					 
			</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div> 
	<script>
			function cpuChoice(code,name,count,price){
				$("input[name='sendCPU']").val(code);
			 	$("#cpuName").html(name);
				$("#cpuCount").html(count);
				$("#cpuPrice").html(price);
				$('#CPU').modal('hide');
			}
	</script>
	
	
	

	
	
	
	
	<!-- CPU @ COOLER  -->
	<div class="modal fade" id="CPUCOOLER" tabindex="-1" role="dialog" aria-labelledby="COOLER_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="COOLER_TITLE"><b>COOLER COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ coolerList }" var="coolList">
					<div>
						<span>
						<b><a href="javascript:coolerChoice('${coolList.coolerCode}','${coolList.coolerName}','${coolList.coolerCount}','${coolList.coolerPrice}')">${ coolList.coolerCode }</a></b> 
						/ ${ coolList.coolerNum } / ${ coolList.coolerName }
						/ ${ coolList.coolerPrice } / ${ coolList.coolerContent } 
						/ ${ coolList.coolerCount }
						 </span>
					</div>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function coolerChoice(code, name, count, price){
			$("input[name='sendCOOLER']").val(code);
		 	$("#coolerName").html(name);
			$("#coolerCount").html(count);
			$("#coolerPrice").html(price);
			$('#CPUCOOLER').modal('hide');			
		}
	</script>
	


	
	
	
	
	 	<!-- GPU  -->
	<div class="modal fade" id="GPU" tabindex="-1" role="dialog" aria-labelledby="GPU_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="GPU_TITLE"><b>GPU COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ gcardList }" var="gcardList">
					<div>
						<span>
						<b><a href="javascript:gpuChoice('${gcardList.gcardCode}','${gcardList.gcardName}','${gcardList.gcardCount }','${gcardList.gcardPrice}')">${ gcardList.gcardCode }</a></b> 
						/ ${ gcardList.gcardNum } / ${ gcardList.gcardName } 
						/ ${ gcardList.gcardPrice } / ${ gcardList.gcardContent } 
						/ ${ gcardList.gcardCount }
						</span>
					</div>					 
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function gpuChoice(code, name, count, price){
			$("input[name='sendGCARD']").val(code);
		 	$("#gcardName").html(name);
			$("#gcardCount").html(count);
			$("#gcardPrice").html(price);
			$('#GPU').modal('hide');			
		}
	
	</script>
	
	
	 

	
	
			<!-- HDD  -->
	<div class="modal fade" id="HDD" tabindex="-1" role="dialog" aria-labelledby="HDD_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="HDD_TITLE"><b>HDD COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ hddList }" var="hddList">
					<div>
						<span>
						<b><a href="javascript:hddChoice('${hddList.hddCode}','${hddList.hddName}','${hddList.hddCount}','${hddList.hddPrice}')">${ hddList.hddCode }</a></b> 
						/ ${ hddList.hddNum } / ${ hddList.hddName } 
						/ ${ hddList.hddPrice } / ${ hddList.hddContent } 
						/ ${ hddList.hddCount }
						</span>
					</div>					 
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function hddChoice(code, name, count, price){
			$("input[name='sendHDD']").val(code);
		 	$("#hddName").html(name);
			$("#hddCount").html(count);
			$("#hddPrice").html(price);
			$('#HDD').modal('hide');				
		}
	</script>
	
	
	
	
	
	
				<!-- RAM  -->
				
	<div class="modal fade" id="RAM" tabindex="-1" role="dialog" aria-labelledby="RAM_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="RAM_TITLE"><b>RAM COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ ramList }" var="ramList">
					<div>
						<span>
						<b><a href="javascript:ramChoice('${ramList.ramCode}','${ramList.ramName}','${ramList.ramCount}','${ramList.ramPrice}')">${ ramList.ramCode }</a></b> 
						/ ${ ramList.ramNum } / ${ ramList.ramName } 
						/ ${ ramList.ramPrice } / ${ ramList.ramContent } 
						/ ${ ramList.ramCount }
						</span>
					</div>					 
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function ramChoice(code, name, count, price) {
			$("input[name='sendRAM']").val(code);
		 	$("#ramName").html(name);
			$("#ramCount").html(count);
			$("#ramPrice").html(price);
			$('#RAM').modal('hide');	
		}
	</script>	

	
	
	
	
	
	
			<!-- SKIN  -->
	<div class="modal fade" id="SKIN" tabindex="-1" role="dialog" aria-labelledby="SKIN_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="SKIN_TITLE"><b>SKIN COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ skinList }" var="skinList">
					<div>
						<span>
						<b><a href="javascript:skinChoice('${skinList.skinCode}','${skinList.skinName }','${skinList.skinCount}','${skinList.skinPrice}')">${ skinList.skinCode }</a></b> 
						/ ${ skinList.skinNum } / ${ skinList.skinName } 
						/ ${ skinList.skinPrice } / ${ skinList.skinContent } 
						/ ${ skinList.skinCount }
						</span>
					</div>					 
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function skinChoice(code, name, count, price) {
			$("input[name='sendSKIN']").val(code);
		 	$("#skinName").html(name);
			$("#skinCount").html(count);
			$("#skinPrice").html(price);
			$('#SKIN').modal('hide');	
		}
	</script>		
	
	
	
	
	
	
			<!-- SSD Modal -->
	<div class="modal fade" id="SSD" tabindex="-1" role="dialog" aria-labelledby="SSD_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="SSD_TITLE"><b>SSD COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ ssdList }" var="ssdList">
					<div>
						<span>
						<b><a href="javascript:ssdChoice('${ssdList.ssdCode}','${ssdList.ssdName}','${ssdList.ssdCount}','${ssdList.ssdPrice}')">${ ssdList.ssdCode }</a></b> 
						/ ${ ssdList.ssdNum } / ${ ssdList.ssdName }
						 / ${ ssdList.ssdPrice } / ${ ssdList.ssdContent } 
						 / ${ ssdList.ssdCount }
						 </span>
					</div>					 
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div> 
	<script>
		function ssdChoice(code, name, count, price) {
			$("input[name='sendSSD']").val(code);
		 	$("#ssdName").html(name);
			$("#ssdCount").html(count);
			$("#ssdPrice").html(price);
			$('#SSD').modal('hide');	
		}
	</script>		
	

	
	
	
	
	
			<!-- POWER  -->
	<div class="modal fade" id="POWER" tabindex="-1" role="dialog" aria-labelledby="POWER_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="POWER_TITLE"><b>POWER COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ powerList }" var="powerList">
					<div>
						<span>
						<b><a href="javascript:powerChoice('${powerList.powerCode}','${powerList.powerName}','${powerList.powerCount}','${powerList.powerPrice}')">${ powerList.powerCode }</a></b>
						 / ${ powerList.powerNum } / ${ powerList.powerName }
						  / ${ powerList.powerPrice } / ${ powerList.powerContent } 
						  / ${ powerList.powerCount }
						  </span>	
					</div>
									 
				</c:forEach>

	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function powerChoice(code, name, count, price) {
			$("input[name='sendPOWER']").val(code);
		 	$("#powerName").html(name);
			$("#powerCount").html(count);
			$("#powerPrice").html(price);
			$('#POWER').modal('hide');	
		}
	</script>			
	
	
	
	
	
<%-- 		
			<!-- MAIN BOARD ( 일단 생략 )  -->
	<div class="modal fade" id="MAINBOARD" tabindex="-1" role="dialog" aria-labelledby="MAINBOARD_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="MAINBOARD_TITLE"><b>MAINBOARD COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${   }" var="">
					<c:if test="${ cpuList.cpuCode == mainboard.comCode }">
						<div>
							<span><b>${  }</b> / ${  } / ${  } / ${  } / ${  } / ${  }</span>
						</div>					 
					</c:if>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div> 
--%>
    
    
    
    
    
    	<!-- DESKTOP 모니터  -->
	<div class="modal fade" id="DESKTOP" tabindex="-1" role="dialog" aria-labelledby="DESKTOP_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="DESKTOP_TITLE"><b>DESKTOP COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ coolerList }" var="coolList">
					<div>
						<span>
						<b><a href="javascript:coolerChoice('${coolList.coolerCode}','${coolList.coolerName}','${coolList.coolerCount}','${coolList.coolerPrice}')">${ coolList.coolerCode }</a></b> 
						/ ${ coolList.coolerNum } / ${ coolList.coolerName }
						/ ${ coolList.coolerPrice } / ${ coolList.coolerContent } 
						/ ${ coolList.coolerCount }
						 </span>
					</div>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function coolerChoice(code, name, count, price){
			$("input[name='sendCooler']").val(code);
		 	$("#coolerName").html(name);
			$("#coolerCount").html(count);
			$("#coolerPrice").html(price);
			$('#CPUCOOLER').modal('hide');
		}
	</script>
    
    
    
    
    
    	<!-- 키보드  -->
	<div class="modal fade" id="KEYBOARD" tabindex="-1" role="dialog" aria-labelledby="KEYBOARD_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="KEYBOARD_TITLE"><b>KEYBOARD COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ coolerList }" var="coolList">
					<div>
						<span>
						<b><a href="javascript:coolerChoice('${coolList.coolerCode}','${coolList.coolerName}','${coolList.coolerCount}','${coolList.coolerPrice}')">${ coolList.coolerCode }</a></b> 
						/ ${ coolList.coolerNum } / ${ coolList.coolerName }
						/ ${ coolList.coolerPrice } / ${ coolList.coolerContent } 
						/ ${ coolList.coolerCount }
						 </span>
					</div>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function coolerChoice(code, name, count, price){
			$("input[name='sendCooler']").val(code);
		 	$("#coolerName").html(name);
			$("#coolerCount").html(count);
			$("#coolerPrice").html(price);
			$('#CPUCOOLER').modal('hide');			
		}
	</script>
    
    
    
    
    	<!-- MOUSE 마우스  -->
	<div class="modal fade" id="MOUSE" tabindex="-1" role="dialog" aria-labelledby="MOUSE_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="MOUSE_TITLE"><b>MOUSE COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ coolerList }" var="coolList">
					<div>
						<span>
						<b><a href="javascript:coolerChoice('${coolList.coolerCode}','${coolList.coolerName}','${coolList.coolerCount}','${coolList.coolerPrice}')">${ coolList.coolerCode }</a></b> 
						/ ${ coolList.coolerNum } / ${ coolList.coolerName }
						/ ${ coolList.coolerPrice } / ${ coolList.coolerContent } 
						/ ${ coolList.coolerCount }
						 </span>
					</div>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function coolerChoice(code, name, count, price){
			$("input[name='sendCooler']").val(code);
		 	$("#coolerName").html(name);
			$("#coolerCount").html(count);
			$("#coolerPrice").html(price);
			$('#CPUCOOLER').modal('hide');			
		}
	</script>
	
	
	
	
		<!-- HEADSET 헤드셋  -->
	<div class="modal fade" id="HEADSET" tabindex="-1" role="dialog" aria-labelledby="HEADSET_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="HEADSET_TITLE"><b>HEADSET COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ coolerList }" var="coolList">
					<div>
						<span>
						<b><a href="javascript:coolerChoice('${coolList.coolerCode}','${coolList.coolerName}','${coolList.coolerCount}','${coolList.coolerPrice}')">${ coolList.coolerCode }</a></b> 
						/ ${ coolList.coolerNum } / ${ coolList.coolerName }
						/ ${ coolList.coolerPrice } / ${ coolList.coolerContent } 
						/ ${ coolList.coolerCount }
						 </span>
					</div>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function coolerChoice(code, name, count, price){
			$("input[name='sendCooler']").val(code);
		 	$("#coolerName").html(name);
			$("#coolerCount").html(count);
			$("#coolerPrice").html(price);
			$('#CPUCOOLER').modal('hide');			
		}
	</script>
	
	
	
	
	
	
	
		<!-- SPEAKER 스피커  -->
	<div class="modal fade" id="SPEAKER" tabindex="-1" role="dialog" aria-labelledby="SPEAKER_TITLE" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-scrollable modal-xl" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="SPEAKER_TITLE"><b>SPEAKER COMPONENT</b></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
				<c:forEach items="${ coolerList }" var="coolList">
					<div>
						<span>
						<b><a href="javascript:coolerChoice('${coolList.coolerCode}','${coolList.coolerName}','${coolList.coolerCount}','${coolList.coolerPrice}')">${ coolList.coolerCode }</a></b> 
						/ ${ coolList.coolerNum } / ${ coolList.coolerName }
						/ ${ coolList.coolerPrice } / ${ coolList.coolerContent } 
						/ ${ coolList.coolerCount }
						 </span>
					</div>
				</c:forEach>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">CLOSE</button>
	        <button type="button" class="btn btn-primary">SELF</button>
	      </div>
	    </div>
	  </div>
	</div>
	<script>
		function coolerChoice(code, name, count, price){
			$("input[name='sendCooler']").val(code);
		 	$("#coolerName").html(name);
			$("#coolerCount").html(count);
			$("#coolerPrice").html(price);
			$('#CPUCOOLER').modal('hide');			
		}
	</script>
	
	
    <!-- 						모달끝               -->    
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
        <div id="empty_space2"></div>
    </footer>
</body>
</html>