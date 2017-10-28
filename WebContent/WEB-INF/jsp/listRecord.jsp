<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>
/* 	table tr td { */
/*     overflow:hidden; */
/*     white-space:nowrap; */
/*     text-overflow:ellipsis; */
/*     -o-text-overflow:ellipsis; */
/*     -moz-text-overflow: ellipsis; */
/*     -webkit-text-overflow: ellipsis; */
/* } */
</style>
<title>便签</title>
<div style="width:360px;margin:0px auto;text-align: center; margin-top: 10px;border:solid">

	<form method="post" action="addRecord">
		<input name="piece" value="" type="text"> <input type="submit"
			value="添加">
	</form>


<table align='center' border='1' cellspacing='0'>
	<tr>
<!-- 		<td>id</td> -->
		<td><p style="text-align:center">内容</p></td>
	</tr>
	<c:forEach items="${cs}" var="c" varStatus="st">
		<tr>
<%-- 			<td>${c.id}</td> --%>
			<td><div style='width:200px;  overflow:hidden; white-space:nowrap; text-overflow:ellipsis;'>${c.piece}</div></td>
<%-- 			<td><a href="editRecord?id=${c.id}">编辑</a></td> --%>
<%-- 			<td><a href="deleteRecord?id=${c.id}">删除</a></td> --%>
			<td><a href="editRecord?id=${c.id}">查看</a></td>
		</tr>
	</c:forEach>
</table>
<!-- <div style="width:200px;  overflow:hidden; white-space:nowrap; text-overflow:ellipsis;">测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试</div> -->
</div>
</html>