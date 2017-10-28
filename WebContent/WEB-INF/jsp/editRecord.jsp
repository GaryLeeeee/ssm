<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r"%>
 
 <div style="width:500px;margin:0px auto;text-align:center;border:solid;">
	
	
	<div style="text-align:center;margin-top:40px">
		
		<form method="post" action="updateRecord" >
			便签名称： <input name="piece" value="${c.piece}" type="text"> <br><br>
			<input type="hidden" value="${c.id}" name="id">
			<input type="submit" value="修改便签" style="width:200px;height:40px;">
		</form>
		<form method="post" action="deleteRecord">
			<input type="hidden" value="${c.id}" name="id">
			<input type="submit" value="删除便签" style="width:200px;height:40px;">
		</form>
	</div>	
 </div>