<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
pageContext.setAttribute("result", "hello");
%>

 <!-- request 에서는 담아진 내용을 꺼내 쓰는것-->
	<%=request.getAttribute("result") %>입니다.
 <%--   ${result} <br> --%><!--   pageContext.setAttribute("result", "hello");  쓰기 전에는 값이 짝수로 출력외었었음 -->
   ${names[0]} <br> <!-- 배열에서 0번째 값을 꺼내와라  -->
   ${notice.title}  <br> <!-- 컨트롤러에서 담았던 속성을 쓸수가 있다 -->
<!-- //---- -->
   ${requestScope.result} <br> <!-- 짝수나 홀수 로 값이 출력됨 -->
   ${result} <br> <!-- hello 가 출력될것. pageContext로 값을 담아줬고 page라는 내장객체가 숨어있어서 page 내의 값을 먼저 인식함 -->
   ${param.n < 3} <br>
   ${header.accept}
   
</body>
</html>