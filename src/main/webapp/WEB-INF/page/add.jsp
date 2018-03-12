<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>青鸟租房 -发布房屋信息</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js"></script>
	<script type="text/javascript" src="scripts/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="scripts/add.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>

</div>
<div id="regLogin" class="wrap">
	<div class="dialog">
		<dl class="clearfix">
			<dt>新房屋信息发布</dt>
			<dd class="past">填写房屋信息</dd>

		</dl>
		<div class="box">
			<form action="addHouse.action" method="post">
				<hidden name="house.id"/>
				<div class="infos">
					<table class="field">
						<tr>
							<td class="field">标　　题：</td>
							<td>
							<input type="text" name="house.title"/>
							</td>
						</tr>
						<tr>
							<td class="field">户　　型：</td>
							<td><select  class="text" id="type" name="house.type.id">

								</select>
							</td>
						</tr>
						<tr>
							<td class="field">面　　积：</td>
							<td><input type="text" name="house.floorage"/></td>
						</tr>
						<tr>
							<td class="field">价　　格：</td>
							<td>
							<input type="text" name="house.price"/>
							</td>
						</tr>
						 
						<tr>
							<td class="field">房产证日期：</td>
							<td><input type="text"  name="house.pubdate"/></td>
						</tr>
						
                        <tr>
							<td class="field">位　　置：</td>
							<td>
							区：<select  class="text" id="district" name="house.district.id">

							</select>
                            	街：<select  class="text" id="street" name="house.street.id">
                            	
                            	</select>
                            
                            </td>
						</tr>
                        <tr>
							<td class="field">联系方式：</td>
							<td>
							<input type="text"name="house.contact"/>
							</td>
						</tr>
                        <tr>
							<td class="field">详细信息：</td>
							<td><textarea name="house.description"></textarea></td>
						</tr>
					</table>
					<div class="buttons">
					<input type="submit" value="立即发布"/>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<div id="footer" class="wrap">
	<dl>
    	<dt>青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号</dt>
        <dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>
    </dl>
</div>
</body>
</html>