<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
 <form action="editUser.htm" method="post">
    <table>
       <tr>
         <td>Username:</td>
         <td><input type="text" name="name"/></td>
         <td><form:errors path="user.name" /></td>
       </tr>
       <tr>
         <td>Email:</td>
         <td><input type="text" name="email"/></td>
         <td><form:errors path="user.email" /></td>
       </tr>
    </table>
    <input type="submit" />
 </form>
</body>
</html>