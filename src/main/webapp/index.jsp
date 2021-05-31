<html>
<body>
    <center>
         <h2>Welcome!</h2>
    </center>

    <form action="/newServlet/login" method="GET">
        <div align="center">
            <a href="cars">cars list</a>

        </div>

        <div class="form-group row">

    		<label for="login" class="col-sm-2 col-form-label">Login</label>
    			<div class="col-sm-10">
    				<input id="login" class="form-control" type="text" name="login">
    			</div>
    	</div>

    	<div class="form-group row">
        	<label for="password" class="col-sm-2 col-form-label">Password</label>
        		<div class="col-sm-10">
        			<input id="password" class="form-control" type="password" name="password" />
        		</div>
        </div>

        <input class="btn btn-primary" type="submit" value="Join" />
        <form action="/newServlet/registration"method="GET"
        </form>

    </form>
        <input class="btn btn-primary" type="submit" value="Registration" />
</body>
</html>
