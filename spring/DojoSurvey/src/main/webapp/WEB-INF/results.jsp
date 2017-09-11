<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Dojo Survey Results</title>
	</head>
	<body>
	<h1>Survey results:</h1>
		Your Name: <c:out value="${name}"/><br>
		Dojo Location: <c:out value="${dojo}"/><br>
		Language: <c:out value="${lang}"/><br>
		
		Comment: <c:out value="${comment}"/><br>

		<a href="/">Go Back</a>
	</body>
</html>