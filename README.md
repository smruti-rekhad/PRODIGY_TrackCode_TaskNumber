# PRODIGY_TrackCode_TaskNumber
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
font-family: Arial, Helvetica, sans-serif;
}

* {
box-sizing: border-box;
}

/* Create a column layout with Flexbox */
.row {
display: flex;
}

/* Left column (menu) */
.left {
flex: 35%;
padding: 15px 0;
}

.left h2 {
padding-left: 8px;
}

/* Right column (page content) */
.right {
flex: 65%;
padding: 15px;
}

/* Style the search box */
#mySearch {
width: 100%;
font-size: 18px;
padding: 11px;
border: 1px solid #ddd;
}

/* Style the navigation menu inside the left column */
#myMenu {
list-style-type: none;
padding: 0;
margin: 0;
}

#myMenu li a {
padding: 12px;
text-decoration: none;
color: black;
display: block
}

#myMenu li a:hover {
background-color: blue;
}
</style>
</head>
<body>

<h2>WEB DEVELOPMENT INTERNSHIP</h2>


<div class="row">
<div class="left" style="background-color:#bbb;">
<h2>Menu</h2>
<input type="text" id="mySearch" onkeyup="myFunction()" placeholder="Search.." title="Type in a category">
<ul id="myMenu">

<li><a href="#">HTML</a></li>
<li><a href="#">CSS</a></li>
<li><a href="#">JavaScript</a></li>
<li><a href="#">PHP</a></li>
<li><a href="#">Python</a></li>
<li><a href="#">jQuery</a></li>
<li><a href="#">SQL</a></li>
<li><a href="#">Bootstrap</a></li>
<li><a href="#">Node.js</a></li>
</ul>
</div>

<div class="right" style="background-color:#ddd;">

<h2>PRODIGY web page</h2>
<p>welcome to the prodigy infotech page </p>
</div>
</div>

<script>
function myFunction() {
var input, filter, ul, li, a, i;
input = document.getElementById("mySearch");
filter = input.value.toUpperCase();
ul = document.getElementById("myMenu");
li = ul.getElementsByTagName("li");
for (i = 0; i < li.length; i++) {
a = li[i].getElementsByTagName("a")[0];
if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
li[i].style.display = "";
} else {
li[i].style.display = "none";
}
}
}
</script>

</body>
</html>

