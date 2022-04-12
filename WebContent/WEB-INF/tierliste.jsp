<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/style.css">
<style type="text/css"></style>
<script>
function allowDrop(ev) {
  ev.preventDefault();
}

function drag(ev) {
  ev.dataTransfer.setData("Text", ev.target.id);
}

function drop(ev) {
  var data = ev.dataTransfer.getData("Text");
  ev.target.appendChild(document.getElementById(data));
  ev.preventDefault();
}
</script>
<title>Tier List Animé</title>
</head>
<body>
    <div>
        <form action="">
            <h1 class="center">Tier liste d'animé</h1>
            <fieldset>
                <label for="tgoat">GOAT</label>
                <label for="tgoat">plop</label>
                <div class="div1" ondrop="drop(event)" ondragover="allowDrop(event)">                <img id="drag1" draggable="true" ondragstart="drag(event)" alt="GOKU" src="/WEB-INF/index.jpg"></div>

            
            </fieldset>
                <div class="div1" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
                <img id="drag2" draggable="true" ondragstart="drag(event)" alt="Bulma" src="/WEB-INF/index.jpg">
            
    
    
        </form> 
        <div class="div1" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
                <img id="drag3" draggable="true" ondragstart="drag(event)" alt="BUU" src="/WEB-INF/index.jpg">
               
    </div>

</body>
</html>