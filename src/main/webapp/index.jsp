<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>

	<form:form modelAttribute="person" action="addPersonn" method="post">
		<form:input path="name"/>
		<input type="submit" />
	</form:form>
</body>
</html>
