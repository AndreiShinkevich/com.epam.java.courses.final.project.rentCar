<html>
<body>
<h2>Welcome!</h2>

<c:if test="${userNotFound != null}">User not found, try again!<br>
	</c:if>

	<form action="/registration" method="GET">
		<div class="form-group row">

			<label for="login" class="col-sm-2 col-form-label">Login</label>
			<div class="col-sm-10">
				<input id="login" class="form-control" type="text" name="login">
			</div>
		</div>

        <div class="form-group row">

			<label for="firstName" class="col-sm-2 col-form-label">firstName</label>
			<div class="col-sm-10">
				<input id="firstName" class="form-control" type="text" name="firstName">
			</div>
		</div>

		<div class="form-group row">

        			<label for="email" class="col-sm-2 col-form-label">email</label>
        			<div class="col-sm-10">
        				<input id="email" class="form-control" type="text" name="email">
        			</div>
        		</div>

		<div class="form-group row">
			<label for="password" class="col-sm-2 col-form-label">Password</label>
			<div class="col-sm-10">
				<input id="password" class="form-control" type="password"
					name="password" />
			</div>
		</div>

    <input class="btn btn-primary" type="submit" value="registration" />
		</form>
    <form action="registration" method="GET">


    </form>
</body>
</html>
