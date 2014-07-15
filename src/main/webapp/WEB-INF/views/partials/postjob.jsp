<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Referral Job</title>





<link
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
	rel="stylesheet" type="text/css" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js"
	type="text/javascript"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"
	type="text/javascript"></script>
<script
	src="http://ajax.microsoft.com/ajax/jquery.validate/1.7/jquery.validate.js"
	type="text/javascript"></script>


<script type="text/javascript">
	$(document).ready(
			function() {

				var myCounter = 1;
				$(".myDate").datepicker();

				$("#moreDates").click(
						function() {

							$('.myTemplate').clone().removeClass("myTemplate")
									.addClass("additionalDate").show()
									.appendTo('#importantDates');

							myCounter++;
							$('.additionalDate input[name=inputDate]').each(
									function(index) {
										$(this).addClass("myDate");
										$(this).attr(
												"name",
												$(this).attr("name")
														+ myCounter);
									});

							$(".myDate").on('focus', function() {
								var $this = $(this);
								if (!$this.data('datepicker')) {
									$this.removeClass("hasDatepicker");
									$this.datepicker();
									$this.datepicker("show");
								}
							});

						});

			});
</script>













</head>
<body>
	<center>
		<h1>Referral Job</h1>

		<sf:form method="POST" action="postajob" commandName="rfjob">
			<table>




				<tr>
					<td>EXP FROM</td>
					<td><sf:select path="exp_from">
							<sf:option value="0" label="0" />
							<sf:option value="1" label="1" />
							<sf:option value="2" label="2" />
							<sf:option value="3" label="3" />
							<sf:option value="4" label="4" />
							<sf:option value="5" label="5" />
							<sf:option value="6" label="6" />
							<sf:option value="7" label="7" />
							<sf:option value="8" label="8" />
							<sf:option value="9" label="9" />
							<sf:option value="10" label="10" />

						</sf:select></td>
					<td><sf:errors path="exp_from" /></td>
					<td>TO</td>
					<td><sf:select path="exp_to">
							<sf:option value="0" label="0" />
							<sf:option value="1" label="1" />
							<sf:option value="2" label="2" />
							<sf:option value="3" label="3" />
							<sf:option value="4" label="4" />
							<sf:option value="5" label="5" />
							<sf:option value="6" label="6" />
							<sf:option value="7" label="7" />
							<sf:option value="8" label="8" />
							<sf:option value="9" label="9" />
							<sf:option value="10" label="10" />

						</sf:select></td>
					<td><sf:errors path="exp_to" /></td>
				</tr>



				<tr>
					<td>EXPIRE_DATE</td>
					<td>
						<div id="myContent">

							<sf:input path="expire_date" class="myDate" type="text"
								name="inputDate1" size="10" value="" />
						</div>

					</td>
					<td><sf:errors path="expire_date" /></td>
				</tr>


				<tr>
					<td>LOCATION</td>
					<td><sf:select path="location">
							<sf:option value="0" label="SELECT" />
							<sf:option value="1" label="Banglore" />
							<sf:option value="2" label="Hyderabad" />
							<sf:option value="3" label="Chennai" />
							<sf:option value="4" label="Mumbai" />

						</sf:select></td>
					<td><sf:errors path="location" /></td>
				</tr>


				<tr>
					<td>OPEN_POSITION</td>
					<td><sf:input path="open_position" /></td>
					<td><sf:errors path="open_position" /></td>
				</tr>




				<tr>
					<td>SKILL</td>
					<td><sf:input path="skill" /></td>
					<td><sf:errors path="skill" /></td>
				</tr>



				<tr>
					<td>COMPANY</td>
					<td><sf:input path="company" /></td>
					<td><sf:errors path="company" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="POSTJOB"></td>
					<td></td>
				</tr>

			</table>

		</sf:form>

		<div></div>
	</center>

</body>
</html>