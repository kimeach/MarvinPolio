/**
 * 2020년 04월 29일 최초 생성
 */

			$(function(){
				$('#sidebarBtnCover').click(function(e){
					et = e.target;
					$('#sidebarBtn').html('<i class="fa fa-angle-double-left fa-lg" aria-hidden="true"></i>')
					$('.iconName').css("display","block");
					
					if(parseInt($('#sidebar').css("width")) === parseInt(innerWidth*0.04)){
						$('#sidebar').animate({
							width : '7%'
						},
						200);
					}else{
						$('.iconName').css("display","none");
						$('#sidebar').animate({
							width : '4%'
						},
						200);
						$('#sidebarBtn').html('<i class="fa fa-angle-double-right fa-lg" aria-hidden="true"></i>')
					}
				})
			});	