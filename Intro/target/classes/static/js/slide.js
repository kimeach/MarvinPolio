	//추후 자동 슬라이드 할때 사용
		var count =0;
		$(".Mainslide").first().attr("data-start","true");
		$(".Mainslide").last().attr("data-end","true");
		for(var i=0;i<$('.Mainslide').length;i++){
			if($(".Mainslide").eq(i).attr("data-slideShow") === "start"){
				$('#slideShow-Cover').append(''
					+'<div id="slideShow_item'+i+'" class="slideShow_item">' 
						+'<i class="far fa-circle"></i>' 
					+'</div>')
			}else{
				$('#slideShow-Cover').append(''
					+'<div id="slideShow_item'+i+'" class="slideShow_item">' 
						+'<i class="fa fa-circle"></i>' 
					+'</div>')
			}
		}
		setInterval(function(){
			for(var i=0;i<$('.Mainslide').length;i++){
					
				if($(".Mainslide").eq(i).attr("data-slideShow") === "start"){
					
					var slide = $(".Mainslide").eq(i);
					var next = $(".Mainslide").eq(i).next();
					
					if(slide.attr("data-end") === "true"){ //마지막 슬라이드 일 때
						$(".Mainslide").last().animate({
							width : "0%"
						},1000,function(){
					})
					$(".Mainslide").first().css("left", "100%");
					$(".Mainslide").first().css("display","block");
					//next
					$(".Mainslide").first().animate({
						width : "100%",
						left : "0"
					},1000,
					function(){
						$(".Mainslide").last().attr("data-slideShow","prev");
						$(".Mainslide").last().css("display","none");
						$(".Mainslide").last().css("left", "100%");
						
						$(".Mainslide").first().attr("data-slideShow","start");
					})
				}else{ //마지막 슬라이드가 아닐 때
					$(".Mainslide").eq(i).animate({
						 width : "0%"
					},1000,function(){
						
					})
					next.css("display","block");
					//next
					next.animate({
						width : "100%",
						left : "0"
					},1000,
					function(){
						slide.attr("data-slideShow","prev");
						slide.css("display","none");
						slide.css("left","100%");
						next.attr("data-slideShow","start");
					})
				}
			}
		}
	}, 6000);
				 
					// 슬라이드 < 눌렀을 때 실행
//					$("#slideShow_left").click(function(){
//						for(var i=0;i<$('.Mainslide').length;i++){
//							if($(".Mainslide").eq(i).attr("data-slideShow") === "start"){
//								var slide = $(".Mainslide").eq(i);
//								var next = $(".Mainslide").eq(i).next();
//								if(slide.attr("data-end") === "true"){ //마지막
//									 $(".Mainslide").last().animate({ // start인거
//										width : "0%"
//									},1000,function(){
//									})
//									$(".Mainslide").first().css("left", "100%");
//									$(".Mainslide").first().css("display","block");
//									//next
//									$(".Mainslide").first().animate({
//										width : "100%",
//										left : "0"
//									},1000,
//									function(){
//										$(".Mainslide").last().attr("data-slideShow","prev");
//										$(".Mainslide").last().css("display","none");
//										$(".Mainslide").last().css("left", "100%");
//										$(".Mainslide").first().attr("data-slideShow","start");
//									})
//								}else{
//									$(".Mainslide").eq(i).animate({ // start인거
//										 width : "0%"
//									},1000,function(){
//									})
//									next.css("display","block");
//									//next
//									next.animate({
//										width : "100%",
//										left : "0"
//									},1000,
//									function(){
//										slide.attr("data-slideShow","prev");
//										slide.css("display","none");
//										slide.css("left","100%");
//										next.attr("data-slideShow","start");
//									})
//								}
//							}
//						}
//					})
					
					
				 // 슬라이드 > 눌렀을 때 실행
//				$("#slideShow_right").click(function(){
//					for(var i=1;i<=$("#Main").find('.Mainslide').length;i++){
//						if(parseInt($('#Main').find("#Mainslide"+i).attr("data-slide")) === 0){
//							alert("0이다")
//						}
//						if($('#Main').find("#Mainslide"+i).attr("data-slideShow") === "start"){
//							var vals = parseInt(i);
//							$('#Mainslide'+vals).animate({ // start인거
//								 width : "0%"
//							},"slow")
//							$('#Mainslide'+(vals+1)).css("display","block");
//							
//							//next
//							$('#Mainslide'+(vals+1)).animate({
//								width : "100%",
//								left : "0"
//							},"slow",
//							function(){
//								$('#Main').find("#Mainslide"+vals).attr("data-slideShow","prev");
//								$('#Main').find("#Mainslide"+vals).css("display","none");
//								$('#Main').find("#Mainslide"+(vals+1)).attr("data-slideShow","start");
//								$('#Main').find("#Mainslide"+(vals+2)).attr("data-slideShow","next");
//							})
//						}
//					}
//				})