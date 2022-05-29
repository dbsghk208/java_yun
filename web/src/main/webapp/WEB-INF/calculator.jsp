<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
input {
	width: 50px;
	height : 50px;
}
.output {
	height : 50px;
	background : #e9e9e9;
	font-size : 24px;
	font-weight: bold;
	text-align: right;
	text-align: right;
	padding:0px 5px;

}
</style>
</head>
<body>
	<form action="calc33" method ="post">
		<table>
			<tr>							<!-- html이라면 아래 ${3+4} 이 그대로 출력되고 jsp는 이결과물을 출력하게 된다. -->
				<td class="output" colspan="4">${3+4}</td>  
			</tr>
			<tr>
				<td><input type="submit" name="operator" value="CE" /></td>
				<td><input type="submit" name="operator" value="C" /></td>
				<td><input type="submit" name="operator" value="BS" /></td>
				<td><input type="submit" name="operator" value="/" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="value" value="7" /></td>
				<td><input type="submit" name="value" value="8" /></td>
				<td><input type="submit" name="value" value="9" /></td>
				<td><input type="submit" name="operator" value="*" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="value" value="4" /></td>
				<td><input type="submit" name="value" value="5" /></td>
				<td><input type="submit" name="value" value="6" /></td>
				<td><input type="submit" name="operator" value="-" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="value" value="1" /></td>
				<td><input type="submit" name="value" value="2" /></td>
				<td><input type="submit" name="value" value="3" /></td>
				<td><input type="submit" name="operator" value="+" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="value" value="0" /></td>
				<td><input type="submit" name="dot" value="." /></td>
				<td><input type="submit" name="operator" value="=" /></td>
			</tr>
			
		</table>
		
	</form>
</body>
</html>