<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Sistema Escolar</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container">
  <br>
<!--    <br><br><br> -->
<!-- 	<div class="row-fluid"> -->
<!--       <h1 class="pull-center"><strong>SISTEMA ESCOLAR</strong></h1> -->
<!--       <p class="lead pull-center">Seu sistema escolar</p> -->
<!-- 	</div>	 -->
<!--   <br><br> -->
  <div class="row">
  <div class="col-md-8">
  	<h1 class="pull-center">SISTEMA ESCOLAR</h1>
  	<p class="lead">Seu sistema escolar</p>	  
  </div>
  <div class="col-md-4 login">
  	<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#login" data-whatever="@mdo">Login</button>
  </div>
</div>
  <div class="row-fluid">
    
      	<div class="block block-sm">
          <div class="pull-center">
            <h1><i class="icon-beaker icon-4x"></i></h1>
            <button class="btn btn-primary btn-flat">Cadastre-se<i class="pull-right icon-chevron-right icon-large"></i></button>
          </div>
      	</div>
  </div> 
 <br/><br/>

</div>

<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="exampleModalLabel">New message</h4>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <label for="recipient-name" class="control-label">Recipient:</label>
            <input type="text" class="form-control" id="recipient-name" placeholder="Login">
          </div>
          <div class="form-group">
            <label for="senha" class="control-label">Message:</label>
            <input type="password" class="form-control" id="senha" placeholder="Senha"/>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
        <button type="button" class="btn btn-primary">Logar</button>
      </div>
    </div>
  </div>
</div>



</body>
</html>                                		