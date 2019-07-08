<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>welcome to ssm1!</h2>
<form action="/addFood" method="post">
    <input type="text" id="id" hidden="true"/>
    NAME:<input type="text" id="name" name="name"/>
    </br>
    PROTIME:<input type="text" id="proTime" name="proTime"/>
    </br>
    EXPDATE:<input type="text" id="expDate" name="expDate"/>
    </br>
    <input type="submit" value="SUBMIT"/>
</form>

<a href="/queryAllFood">查询所有食物！</a>
</body>
</html>
