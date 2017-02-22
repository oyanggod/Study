<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
    <h2>Hello World!</h2>

    <form action="login">
        姓名<s:property value="PersonShana.Name" />
        年龄<s:property value="PersonShana.Age" />
    </form>
</body>
</html>