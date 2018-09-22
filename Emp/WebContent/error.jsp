<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
      <script type="text/javascript">
			setInterval(function(){
				var oldnum=btn.innerHTML;
				var newnum=oldnum-1;
				btn.innerHTML=newnum;
				if (newnum==0) {
					location.assign('http://localhost:8686/Emp/login.jsp')
				}
			},1000)
	  </script>
</head>
<body>
<h1>抱歉，您还没有登录，<span id="btn">5</span>秒后跳转到登录页面！</h1>
</body>
</html>