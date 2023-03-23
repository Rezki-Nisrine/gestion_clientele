<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action = "ajout" method = "GET">
 <table style="border:solid 4px">
 <tr> <td>id produit</td>
      <td><input type = "number" name = "id"></td>
  </tr>
  
   <tr> <td>nom produit</td>
      <td><input type = "text" name = "name"></td>
  </tr>
   <tr> <td>type produit</td>
      <td><input type = "text" name = "type"></td>
  </tr>
  <tr> 
      <td><input type = "submit" value = "ajouter" /></td>
  </tr>
        
         
      </form>
  </table>
</body>
</html>