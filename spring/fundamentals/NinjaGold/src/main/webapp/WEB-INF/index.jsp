<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Ninja Gold</title>
    <style type="text/css">
    * {
        vertical-align: baseline;
        font-weight: inherit;
        font-family: inherit;
        font-style: inherit;
        font-size: 100%;
        border: 0 none;
        outline: 0;
        padding: 0;
        margin: 0;
    }
    body {
        background-color: lightblue;
    }
    #wrapper {
        width: 100%;
        display: flex;
        flex-flow: row wrap;
        justify-content: center;
        font-family: sans-serif;
        font-size: 10pt;
        color: grey;
    }
    .location {
        width: 15%;
        height: 150px;
        min-width: 150px;
        text-align: center;
        background-color: whitesmoke;
        padding: 2%;
        margin: 1%;
        text-align: center;
        display: flex;
        flex-flow: column nowrap;
        justify-content: space-between;
    }
    span.subhead {
        font-size: 18pt;
        display: block;
    }
    span.header {
        font-size: 30pt;
        width: 100%;
        text-align: center;
        display: block;
        margin-top: 10px;
    }
    .places input, button {
        background-color: darkgray;
        padding: 5px;
        text-align: center;
    }
    #activities {
        width: 94%;
        min-width: 450px;
        height: 300px;
        overflow: auto;
        padding: 2%;
        margin: 1%;
        background-color: whitesmoke;
    }
    ul {
        list-style: none;
    }
    li {
        padding: 5px 0;
    }
    .red {
      color: red;
    }
    .green {
      color: green;
    }
    input[type=submit] {
      padding: 5px;
    }
    </style>
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