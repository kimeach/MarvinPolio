/**
 * 2020년 04월 29일 최초 생성
 */

			$(function(){
				$('#sidebarBtnCover').click(function(){
					console.log("sidebarBtnCover 누름")
					$('#sidebarBtn').html('<i class="fa fa-angle-double-left fa-lg" aria-hidden="true"></i>')
					$('.iconName').css("display","block");
					
					if(parseInt($('#sidebarCover').css("width")) === parseInt((innerWidth*0.07)*0.5)){
						console.log("50일 때 들어옴")
						$('.iconName').css("display","block");
						$('#sidebarCover').animate({
							width : '70%'
						},
						200);
					}else if(parseInt($('#sidebarCover').css("width")) === parseInt((innerWidth*0.07)*0.7)){
						console.log("70일 때 들어옴")
						$('.iconName').css("display","none");
						$('#sidebarCover').animate({
							width : '50%'
						},
						200);
						$('#sidebarBtn').html('<i class="fa fa-angle-double-right fa-lg" aria-hidden="true"></i>')
					}
				})
			});	