<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Emp, you are welcome!</h2>

<br>
<br>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">

        <li>${lang}</li>

    </c:forEach>
</ul>

Phone number: ${employee.phoneNumber}

</body>

</html>