<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<!-- bootstrap -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<h1>
	JOIN
</h1>
	<div class="wrapper">
		<main>
			<section>
				<form method="post" action="${pageContext.request.contextPath}/join">
					<div class="m-2">
						<label></label>
						<input class="form-control" name="username" placeholder="username">
					</div>
					
					<div class="m-2">
						<label></label>
						<input class="form-control" name="password" placeholder="password">
					</div>
					
					<div class="m-2">
						<label></label>
						<input class="form-control" name="repassword" placeholder="repassword">
					</div>
					
					<div class="m-2">
						<label></label>
						<input class="form-control" name="nickname" placeholder="nickname">
					</div>
					
					<div class="m-2">
						<label></label>
						<input class="form-control" name="phone" placeholder="phone">
					</div>
					
					<div class="m-2">
						<label></label>
						<input class="form-control" name="address" placeholder="address">
					</div>
					
					<div class="m-2">
						<label></label>
						<input class="form-control" name="birthday" placeholder="birthday">
					</div>
					
					<div class="m-2">
						<label>취미 : </label>
						<div class="row">
							<div class="col">
								<input type="checkbox" class="form-check-input" name="hobbies" value="reading">
								<label class="form-check-label">독서</label>
							</div>
							<div class="col">
								<input type="checkbox" class="form-check-input" name="hobbies" value="climing">
								<label class="form-check-label">등산</label>
							</div>
							<div class="col">
								<input type="checkbox" class="form-check-input" name="hobbies" value="swimming">
								<label class="form-check-label">수영</label>
							</div>
						</div>
					</div>
					<div class="m-2">
						<label></label>
						<input class="form-control" name="hobbies2"  placeholder="hobbies2">
					</div>
					<div class="m-2">
						<button class="btn btn-success w-100">가입하기</button>
					</div>
				</form>
			</section>
		</main>
	</div>
</body>
</html>
