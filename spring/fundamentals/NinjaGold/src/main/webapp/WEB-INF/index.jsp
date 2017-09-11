<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Ninja Gold</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
  </head>
  <body>
    <div id="wrapper">
      <span class="header">
        Your Gold: <%= session.getAttribute("gold") %>
      </span>
      <div class="location">
      	<form action="/" method="post">
			<span class="subhead">Farm</span>
			<p>(earns 10-20 golds)</p>
			<input type="hidden" name="place" value="farm">
			<input type="submit" value="Find Gold!">
		</form>
	</div>
	<div class="location">
      	<form action="/" method="post">
			<span class="subhead">Cave</span>
			<p>(earns 5-10 golds)</p>
			<input type="hidden" name="place" value="cave">
			<input type="submit" value="Find Gold!">
		</form>
	</div>
	<div class="location">
      	<form action="/" method="post">
			<span class="subhead">House</span>
			<p>(earns 2-5 golds)</p>
			<input type="hidden" name="place" value="house">
			<input type="submit" value="Find Gold!">
		</form>
	</div>
	<div class="location">
      	<form action="/" method="post">
			<span class="subhead">Casino</span>
			<p>(earns/takes 0-50 golds)</p>
			<input type="hidden" name="place" value="casino">
			<input type="submit" value="Find Gold!">
		</form>
	</div>
      <div id="activities">
        <span class="subhead">Activities</span>
          <ul>
          <% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			Collections.reverse(activities);
          for(String activity : activities) {
			if(activity.toLowerCase().contains("lost".toLowerCase())) {%>
				<li class="red"><%= activity %></li>
			<% }else{ %>
				<li class="green"><%= activity %></li>
			<% }
		} %>
          </ul>
      </div>
      <form action="/" method="post">
		<input type="hidden" name="place" value="reset">
		<input type="submit" value="Reset">
	</form>
    </div>
  </body>
</html>