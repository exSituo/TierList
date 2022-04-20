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
            <fieldset class="tierliste">
                <div class="bleu">                

                    <div class="rouge">

                        <div class="orange"></div>
                        <div class="rose" ondrop="drop(event)" ondragover="allowDrop(event)"></div>


                    </div>
                    <div class="rouge">

                        <div class="orange"></div>
                        <div class="rose" ondrop="drop(event)" ondragover="allowDrop(event)"></div>

                    </div>
                    <div class="rouge">

                        <div class="orange"></div>
                        <div class="rose" ondrop="drop(event)" ondragover="allowDrop(event)"></div>

                    </div>
                    
                    <div class="rouge">

                        <div class="orange" ></div>
                        <div class="rose" ondrop="drop(event)" ondragover="allowDrop(event)"></div>

                    </div>
                    <div class="rouge">

                        <div class="orange" ></div>
                        <div class="rose" ondrop="drop(event)" ondragover="allowDrop(event)"></div>

                    </div>

                </div>
                <div class="lime" ondrop="drop(event)" ondragover="allowDrop(event)">
                    <p id="drag1" draggable="true" ondragstart="drag(event)" >1</p>
                    <p id="drag2" draggable="true" ondragstart="drag(event)" >4</p>
                    <p id="drag3" draggable="true" ondragstart="drag(event)" >45</p>
                    <p id="drag4" draggable="true" ondragstart="drag(event)" >69</p>
                </div>
                  <br><br>
          <input type="submit" value="Submit">
            
            </fieldset>
                
            
    
    
        </form> 

</body>
</html>