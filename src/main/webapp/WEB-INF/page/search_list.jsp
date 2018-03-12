<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<title>青鸟租房 - 首页</title>
	<link type="text/css" rel="stylesheet" href="css/style.css" />
	<script type="text/javascript" src="scripts/function.js"></script>
	<script type="text/javascript">
		function toUrl(url){
			window.location.href = url;
			return;
		}
		
		function doSearch(){
			//document.getElementById('number').value = num;
			var f = document.getElementById('sform');
			f.submit();
		}
		function init(){
			var price = '<s:property value="price"/>';
			var p = document.getElementById('price');
			if(price == '0-100'){
				p.selectedIndex = 1;
			}else if(price == '100-200'){
				p.selectedIndex = 2;
			}else if(price == '200-1000000'){
				p.selectedIndex = 3;
			}

			var street = '<s:property value="street_id"/>';
			var d = document.getElementById('street');
			if(street == '1000'){
				d.selectedIndex = 1;
			}else if(street == '1001'){
				d.selectedIndex = 2;
			}else if(street == '1002'){
				d.selectedIndex = 3;
			}else if(street == '1003'){
				d.selectedIndex = 4;
			}

			var housetype = '<s:property value="type_id"/>';
			var h = document.getElementById('housetype');
			if(housetype == '1000'){
				h.selectedIndex = 1;
			}else if(housetype == '1001'){
				h.selectedIndex = 2;
			}else if(housetype == '1002'){
				h.selectedIndex = 3;
			}else if(housetype == '1003'){
				h.selectedIndex = 4;
			}
			
			var floorage = '<s:property value="floorage"/>';
			var f = document.getElementById('floorage');
			if(floorage == '0-40'){
				f.selectedIndex = 1;
			}else if(floorage == '40-500'){
				f.selectedIndex = 2;
			}else if(floorage == '500-1000000'){
				f.selectedIndex = 3;
			}
		}
		
		
		function pageSearch(num){
		if(num=='1'){
		document.getElementById("number").value=1;
		}else if(num=='p'){
		document.getElementById("number").value=document.getElementById("prevPage").value;
		}else if(num=='n'){
		document.getElementById("number").value=document.getElementById("nextPage").value;
		}else{
		document.getElementById("number").value=document.getElementById("totalPage").value;
		}
		var f = document.getElementById('sform');
		f.submit();
			
		}
	</script>
</head>
<body onload='init()'>
<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>
</div>
<div id="navbar" class="wrap">

	<dl class="search clearfix">
		<form method="post" action="search.action" id='sform'>

		<input type='hidden' id='number' name='number' value='0'/>
			<dt>
				<ul>
					<li class="bold">房屋信息</li>
					<li>
						标题：<input type="text" class="text" value='<s:property value="title"/>' name="title" />
						<label class="ui-blue"><input type="button" onclick='doSearch()' name="search" value="搜索房屋" /></label>
					</li>
				</ul>
			</dt>
			<dd>
				<ul>
					<li class="first">
						价格
					</li>
					<li>
						<select name='price' id='price'>
							<option value=''>不限</option>
							<option value='0-100'>100元以下</option>
							<option value='100-200'>100元—200元</option>
							<option value='200-1000000'>200元以上</option>
						</select>
					</li>
				</ul>
			</dd>
			<dd>
				<ul>
					<li class="first">房屋位置</li>
					<li>
							<select name='street_id' id='street'>
								<option value=''>不限</option>
								<option value='1000'>知春路</option>
								<option value='1001'>中关村大街</option>
								<option value='1002'>学院路</option>
								<option value='1003'>朝阳路</option>								
							</select>
					</li>
				</ul>
			</dd>
			<dd>
				<ul>
					<li class="first">房型</li>
					<li>
							<select name='type_id' id='housetype'>
								<option value=''>不限</option>
								<option value='1000'>一室一厅</option>
								<option value='1001'>一室两厅</option>
								<option value='1002'>两室一厅</option>
								<option value='1003'>两室两厅</option>								
							</select>
					</li>
				</ul>
			</dd>
			<dd>
				<ul>
					<li class="first">
						面积
					</li>
					<li>
							<select name='floorage' id='floorage'>
								<option value=''>不限</option>
								<option value='0-40'>40以下</option>
								<option value='40-500'>40-500</option>
								<option value='500-1000000'>500以上</option>							
							</select>
					</li>
				</ul>
			</dd>
		</form>
	</dl>
</div>
<div class="main wrap">
	<table class="house-list">
	<s:if test="#result!=null">
	<s:iterator value="#result" status="status" >
		<tr>
			<td class="house-thumb"><span>
				<s:url value="show.action" id="show">
					<s:param name="id" value="id"></s:param>
				</s:url>
				<s:a href="%{show}"><img src="images/thumb_house.gif" /></s:a>
			</span>	</td>
			<td>
				<dl>
					<dt><s:url value="show.action" id="show">
					<s:param name="id" value="id"></s:param>
				</s:url>
				<s:a href="%{show}"><s:property value="title"/></s:a>
				</dt>
					<dd>
						<s:property value="street.district.name"/>区
						<s:property value="street.name"/>，
						<s:property value="floorage"/>平米<br/>
						联系方式<s:property value="contact"/>
					</dd>
				</dl>
			</td>
			<td class="house-type"><s:property value="type.name"/></td>
			<td class="house-price"><span><s:property value="price"/></span>元/月</td>
		</tr>
	</s:iterator>
	</s:if>   
	</table>
	<div class="pager">

		<s:hidden  name="prev" id="prevPage" />
		<s:hidden  name="next" id="nextPage" />
		<s:hidden  name="total" id="totalPage" />
		<ul>
			<li class="current">
<%-- 			<s:url id="first" value="search.action">
				<s:param name="number" value="1"></s:param>
			</s:url> --%>
			<s:a href="javascript:pageSearch('1')">首页</s:a>
			<!-- <a href="/HouseRent/index.action?number=1">首页</a> --></li>
			<li>
<%-- 			<s:url id="pre" value="search.action">
				<s:param name="number" value="prev"></s:param>
			</s:url> --%>
			<s:a href="javascript:pageSearch('p')">上一页</s:a>
			<%-- <a href='/HouseRent/index.action?number=<s:property value="prev"/>'>上一页</a> --%></li>
			<li>
<%-- 			<s:url id="nex" value="search.action">
				<s:param name="number" value="next"></s:param>
			</s:url> --%>
			<s:a href="javascript:pageSearch('n')">下一页</s:a>
			<%-- <a href='/HouseRent/index.action?number=<s:property value="next"/>'>下一页</a> --%></li>
			<li>
<%-- 			<s:url id="last" value="search.action">
				<s:param name="number" value="total"></s:param>
			</s:url> --%>
			<s:a href="javascript:pageSearch('t')">末页</s:a>
			<%-- <a href='/HouseRent/index.action?number=<s:property value="total"/>'>末页</a> --%></li>
		</ul>
		<span class="total"><s:property value="curPage"/>/<s:property value="total"/>页</span>
	</div><s:debug></s:debug>
</div>
<div id="footer" class="wrap">
	<dl>
    	<dt>青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号</dt>
        <dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>
    </dl>
</div>
</body>
</html>