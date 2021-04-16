<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Start!</title>
</head>
<body>
    <h1>
        !First application!
    </h1>
    <h1>
        Go to:
    </h1>
    <h2>
        <a href="hello">
            hello.jsp
        </a>
    </h2>
    <h2>
        <a href="bye">
            bye.jsp
        </a>
    </h2>
    <form action="bye" method="post">
        <input type="submit" value="Press bye Button"/>
    </form>
    <form action="hello" method="post">
        <input type="submit" value="Press hello Button"/>
    </form>
    <form action="FrontController" method="post">
        <input type="submit" value="Press FrontController Button"/>
    </form>
</body>
</html>