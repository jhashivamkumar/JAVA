<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Time Display</title>
	</head>
	<body>
		<a href="/">Back</a><br>
		<span id="time"><fmt:formatDate value="${now}" pattern="h:mm a" /></span>
	</body>
</html>