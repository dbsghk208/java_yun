<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String cnt_ = request.getParameter("cnt"); 
    
int cnt = 100;
if(cnt_ !=null && !cnt_.equals(""))
    cnt = Integer.parseInt(cnt_);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for(int i=0; i<cnt; i++){ %>  
<!-- 반복되어야 할 내용이 어디서부터 어디까지인지 중괄호로 꼭 표시해줘야 하고 
그 범위는 자바코드이므로 코드블럭으로 중괄호도 코드블럭 안에 있어야 한다. -->
		안녕 Servlet!!<br>
	<%} %>	
</body>
</html>