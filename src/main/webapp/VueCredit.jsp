<%@page import="web.model.CreditModel" %>
<%
	CreditModel creditModel =(CreditModel) request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<!--<link rel="stylesheet" type="text/css" href="css/style.css">-->
	<!--<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<title>Credit Bancaire</title>
</head>
<body>

	<div class="container" style=" margin-top:2%">
		<div class="panel panel-primary">
			  <div class="panel-heading">
			  		<h1 class="text-center">Traitement de demande de Credit</h1>
			  </div>
			  <div class="panel-body">
			  		<form action="calculateMensualite.do" method="post">
			  			<div class="form-group">
			  				<label  for="MontantInModel"
			  						class="control-label">
			  						Montant: (en DH)
			  				</label>
			  				<input class="form-control"
			  					   id="MontantInModel"
			  					   type="text"
								   name="montant"
								   value="<%= creditModel.getMontant() %>">
			  			</div>
			  			<div class="form-group">
			  				<label  for="TauxInModel"
			  						class="control-label">
			  						Taux: (en %)
			  				</label>
			  				<input class="form-control"
			  					   id="TauxInModel"
			  					   type="text"
								   name="taux"
								   value="<%= creditModel.getTaux() %>">
			  			</div>
			  			<div class="form-group">
			  				<label  for="DureeInModel"
			  						class="control-label">
			  						Durée: (en mois)
			  				</label>
			  				<input id="DureeInModel"
			  					   class="form-control"
			  					   type="text"
								   name="duree"
								   value="<%= creditModel.getDuree() %>">
			  			</div>
			  			
			  			<button class="btn btn-danger" type="submit">Calculer</button>
			  		</form>
			  </div>
			  
			  <div class="panel-footer">
			  		Mensulité calculé : <%= creditModel.getMensulatite() %>
			  </div>
		</div>
	</div>

</body>
</html>