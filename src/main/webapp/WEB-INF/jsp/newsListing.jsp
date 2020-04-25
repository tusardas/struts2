<%@ include file="includes/inc.taglibs.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<title>News</title>
		<link rel="stylesheet" href="static/main.css" />
	</head>
	<body>
		<h2>Top news today</h2>
		<s:if test="%{newsList.size > 0}">
			<div class="listing">
				<s:iterator value="newsList" var="news" status="index">
					<div class="news">
						<div>
							${news.headline}
						</div>
						<div>
							${news.content}
						</div>
					</div>
				</s:iterator>
			</div>
		</s:if>
	</body>
</html>