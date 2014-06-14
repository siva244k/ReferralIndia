<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PostData</title>
<script
        src="resources/js/jquery-2.1.1.min.js"></script>

<script>
        function start() {
                $.ajax({
                        type : "POST",
                        url : "post",
                        data : $("#postdata").serialize(),
                        success : function(result) {
                                $("#div1").text(result.status+"--"+result.statusMessage)
                                $("#div1").fadeOut(5000)


                        },
                        error : function(e) {
                                $("#div1").text("not submitted")
                        }
                });

        }
</script>



<script>
        $(document).ready(function() {
                $("button").click(function() {
                        $.ajax({
                                url : "post/list",
                                success : function(data) {

                                        var tr;
                                        for ( var i = 0; i < data.length; i++) {
                                                tr = $('<tr/>');
                                                tr.append("<td>" + data[i].location + "</td>");
                                                tr.append("<td>" + data[i].position + "</td>");
                                                tr.append("<td>" + data[i].skill + "</td>");
                                                $('#div2').append(tr);

                                        }
                                },
                                error : function(e) {
                                }
                        });
                });
        });
</script>



</head>
<body>

        <center>


                <form id="postdata" name="postdata" method="POST">

                        <table border="2">
                        
                               <tr>
                                        <td>skill</td>
                                        <td><input type="text" name="skill" id="skill" /></td>
                                </tr>
                                <tr>
                                        <td>position</td>
                                        <td><input type="text" name="position" id="position" /></td>
                                </tr>
                               
                                <tr>
                                        <td>exp_to</td>
                                        <td><input type="text" name="expTo" id="expTo" /></td>
                                </tr>

                        </table>
                        <input type="button" value="enter" onclick="start()" />


                </form>

                <div id="div1">

                        <h2></h2>
                </div>

                <button>GET Refrral jobs</button>
                <div id="div2">
                        <h2></h2>
                </div>



        </center>
</body>
</html>