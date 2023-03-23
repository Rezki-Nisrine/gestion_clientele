<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action = "ajout" method = "GET">
 <table style="border:solid 4px">
 <tr> <td>id</td>
      <td><input type = "number" name = "id"></td>
  </tr>
  
   <tr> <td> Nom</td>
      <td><input type = "text" name = "nom"></td>
  </tr>
   <tr> <td>prenom</td>
      <td><input type = "text" name = "prenom"></td>
  </tr>
   <tr> <td>email</td>
      <td><input type = "text" name = "email"></td>
  </tr>
   <tr> <td>categorie</td>
      <td><input type = "number" name = "idcategorie"></td>
  </tr>
  <tr> 
      <td><input type = "submit" value = "ajouter" /></td>
  </tr>
        
</body>
</html>