<script type="text/javascript">


	$(document).ready(function() {  // 지금 이 소스에서는 현재문서(document)를 // ready(function(){}); -> 항상 준비해놓겠다.
									
		$("#start_dh").val('${data.start_dh}');
		$("#end_dh").val('${data.end_dh}');
		$("#").val('${data.}');
		$("#").val('${data.}');
		
		$('#start_dh').mask('9999-99-99');
		$('#end_dh').mask('9999-99-99');
		$('input[name=search_max_date]').mask('9999-99-99');
		
		 $("#start_dh").datepicker({
//         	endDate : $('#end_dh').val(),
				format : 'yyyy-mm-dd',
                language : 'kr',
                todayHighlight : true,
                todayBtn : true,
                autoclose : true
	        }).on("changeDate", function(e) {
//        
            });
			$("#end_dh").datepicker({
//				startDate : $('#start_dh').val(),
				format : 'yyyy-mm-dd',
                language : 'kr',
                todayHighlight : true,
                todayBtn : true,
                autoclose : true
	        }).on("changeDate", function(e) {
//          
         });
		
          
          
       $(document).on("click", ".pagination a", function(e) {
           // 현재 페이지는 리턴한다.
           if ($(this).parent().hasClass('active'))
               return;
           $("input[name=start_dh]").val($('#start_dh').val().replace(/-/g, ""));
           $("input[name=end_dh]").val($('#end_dh').val().replace(/-/g, ""));
          
		
           $('input[name=page]').val($(this).attr("page"));
           $('#searchForm').submit();
       });
       
      
       $(document).on("click", ".btn-submit", function(e){	

   	   
          	if(date_check(30)){
          		$('input[name=page]').val('');
          	    $("input[name=start_dh]").val($('#start_dh').val().replace(/-/g, ""));
          	    $("input[name=end_dh]").val($('#end_dh').val().replace(/-/g, ""));
          	  
          	   
          	    $('#search_AA').val();
          	    $('#search_BB').val();
          	    
          	    $("#searchForm").submit();
          	}
			});
       
       
       $("#btn-excelDownload2").click(function(e) {
    	   var exceldown = '어떤경로' + $.urlConstant.URL_EXCEL_DOWNLOAD;
			if(date_check(30)){
				$("#e_start_dh").val($('#start_dh').val().replace(/-/g, ""));
				$("#e_end_dh").val($('#end_dh').val().replace(/-/g, ""));
				
				/*엑셀 추가 사항 start*/
				var header_name = '엑셀헤더1, 엑셀헤더2, 엑셀헤더3';
				
				if(header_check(header_name)){
					$("#e_header_name").val(header_name);	
				}

				var dbcol_name = '칼럼1(엑셀헤더1), 칼럼2(엑셀헤더2), 칼럼3(엑셀헤더3)'; 
				
				$("#e_dbcol_name").val(dbcol_name);	
				
				$("#excelForm").attr('action', exceldown);
				$("#excelForm").submit();
			}
		});
  
</script>       
       
