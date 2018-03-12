<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>房屋信息列表</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>  
  <body>
	<table class="house-list">
	<c:if test="${sessionScope.result ne null}">	
	<c:forEach items="${sessionScope.result}" var="house" varStatus="status">
		<c:if test="${status.count%2 != 0}">
		<tr>
			<td class="house-thumb"><span><a href="show?id=${house.id}"><img src="images/thumb_house.gif" /></a></span></td>
			<td>
				<dl>
					<dt><a href="show?id=${house.id}">${house.title}</a></dt>
					<dd>
						${house.street.district.name}区${house.street.name},${house.floorage }平米<br />
						联系方式：${house.contact }	
					</dd>
				</dl>
			</td>
			<td class="house-type"><label class="ui-green"><input type="button" onclick='update(${house.id})' name="search" value="修    改" /></label></td>
			<td class="house-price"><label class="ui-green"><input type="button" name="search" value="删    除" /></label></td>
		</tr>
		</c:if>
		<c:if test="${status.count%2 == 0}">
		<tr class="odd">
			<td class="house-thumb"><span><a href="view.html"><img src="images/thumb_house.gif" /></a></span></td>
			<td>
				<dl>
					<dt><a href="show?id=${house.id}">${house.title}</a></dt>
					<dd>
						${house.street.district.name}区${house.street.name},${house.floorage }平米<br />
						联系方式：${house.contact }				
					</dd>
				</dl>
			</td>
			<td class="house-type"><label class="ui-green"><input type="button" onclick='update(${house.id})' name="search" value="修    改" /></label></td>
			<td class="house-price"><label class="ui-green"><input type="button" name="search" value="删    除" /></label></td>
		</tr> 
		</c:if>
		
    </c:forEach>
    </c:if>   
  	<c:if test="${empty sessionScope.result}">
    	<tr><c:out value="无租房信息"></c:out></tr> 
    </c:if>
	</table>
  </body>
</html>
