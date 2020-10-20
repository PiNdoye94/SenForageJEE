<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Gestion Clients</title>
	<link rel="stylesheet" href="static/css/Styles.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="wrapper">
		<div class="wrapper_inner">
			<div class="vertical_wrap">
			<div class="backdrop"></div>
			<div class="vertical_bar">
				<div class="profile_info">
					<div class="img_holder">
						<img src="static/image/lol.png" alt="profile_pic">
					</div>
					<p class="title">Responsable Clientèle</p>
					<p class="sub_title">papisndoye218@gmail.com</p>
				</div>
				<ul class="menu">
					<li><a href="Accueil">
						<span class="icon"><i class="fas fa-home"></i></span>
						<span class="text">Accueil</span>
					</a></li>
					<li><a href="NouveauClient">
						<span class="icon"><i class="fas fa-user"></i></span>
						<span class="text">Nouveau Client</span>
					</a></li>
					<li><a href="#" class="active">
						<span class="icon"><i class="fas fa-cog"></i></span>
						<span class="text">Gestion Clients</span>
					</a></li>
				</ul>
				<h3 class="out"><a href="" >Deconnexion</a></h3>
			</div>
		</div>
		<div class="main_container">
			<div class="top_bar">
				<div class="hamburger">
					<i class="fas fa-bars"></i>
				</div>
				<div class="logo">
					GESTION <span>CLIENTS</span>
				</div>
			</div>

			<div class="container">
				<div class="content">
					<div class="item">
						<div class="searchcommpte" style="text-align: center;">
		                    <input type="search" name="recherche_client" class="btn_search"placeholder="N° Compte"/>
		                    <input type="button" name="bouton_de_recherche" class="btn_search" value="Rechercher"/>
		                </div>
						
								<table>
									<tr>
										<th>ID client</th>
										<th>Type client</th>
										<th>Nom</th>
										<th>Prenom</th>
										<th>N° Compte</th>
										<th>Etat Compte</th>
									</tr>
										
										<tr>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td><a href="">Supprimer</a></td>
											
											<td><a href="">Mise à jour</a></td>
										</tr>
								</table>
					</div>
				</div>
			</div>
		</div>
		</div>
	</div>

</body>
</html>