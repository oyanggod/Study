<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>home page</title>
<script type="text/javascript" src="script/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
 	function getUserById(){
	 /* 	$.ajax({
		    url: "Hello/getUserById",
		    type:"GET", //GET
		    async:false,    //或false,是否异步
		    data:{
		    	userId:$("#userId").val()
		    }
		})  */
		$("#form1").submit();
	} 
</script>
</head>
<body>
	<div>
		<form id="form1" action="Hello/getUserById">
			<table>
				<tr>
					<td>用户id:</td>
					<td><input id="userId" name="userId" type="text" /></td>
					<td><input type="button" value="查询" onclick="getUserById();"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>