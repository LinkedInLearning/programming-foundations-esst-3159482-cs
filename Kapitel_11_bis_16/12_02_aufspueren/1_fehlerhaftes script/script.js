// Definiere die Funktionen
function firstFunction() {
	secondFunction();
}
function secondFunction() { 
	thirdFunction();
}
function thirdFunction() {
	fourthfunction();
}
function fourthFunction() {
	headline.innerHTML = "Sie haben auf die Headline geklickt. ";
}

// hole das Headline-Element
let headline = document.getElementById("mainHeading");


// füge Eventlistener hinzu
headline.onclick = function() {
	firstFunction();
	
};





