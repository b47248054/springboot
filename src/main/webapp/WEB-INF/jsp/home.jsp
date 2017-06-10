<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>jsp</title>
</head>
<body>
jsp1111
<table>
    <%
        String[] strs = new String[]{"a","b","c","d"};
        for(int i = 0; i < strs.length;i++){
    %>

    <tr>
        <td><%=strs[i].toString()%></td>
    </tr>

    <%
        }
    %>

</table>
</body>
</html>