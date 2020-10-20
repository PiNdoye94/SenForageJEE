<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Sen-Forage</title>
<link href="static/css/Styles.css" type="text/css" rel="stylesheet">
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<!-- <h1>Bienvenue sur la plateforme de gestion des clients de Sen-forage</h1> -->
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
					<li><a href="#" class="active">
						<span class="icon"><i class="fas fa-home"></i></span>
						<span class="text">Accueil</span>
					</a></li>
					<li><a href="NouveauClient">
						<span class="icon"><i class="fas fa-user"></i></span>
						<span class="text">Nouveau Client</span>
					</a></li>
					<li><a href="GestionClient">
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
					ACCUEIL <span></span>
				</div>
			</div>

			<div class="container">
				<div class="content">
					<div class="item">
		                <div class="donneesClient" style="text-align: center;">
		                    <input type="search" name="svillage" class="btn_search" placeholder="Nom village..."/>
		                    <input type="button" name="search_village" class="btn_search" value="Rechercher"/>
		                    <form method="post" action="AccueilServlet">
			                    <input type="text" name="nvillage" class="btn_add" placeholder=""/>
			                    <input type="button" name="new_village" class="btn_add" value="Ajouter"/>
		                    </form>
		                </div>
		                
		             
					</div>
				</div>
			</div>
		</div>
		</div>
	</div>
</body>
</html>