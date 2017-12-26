<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>

<h2>提交的book信息如下 - </h2>
   <table>
    <tr>
        <td>名称：</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>数量：</td>
        <td>${number}</td>
    </tr>
    <tr>
        <td>编号：</td>
        <td>${book_id}</td>
    </tr>
</table>  
</body>
</html>