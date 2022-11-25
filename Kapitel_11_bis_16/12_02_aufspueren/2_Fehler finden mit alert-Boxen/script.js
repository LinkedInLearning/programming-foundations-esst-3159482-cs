// Definiere die Funktionen
function firstFunction() {
	alert("1");
	secondFunction();
}
function secondFunction() { 
	alert("2");
	thirdFunction();
}
function thirdFunction() {
	alert("3");
	fourthfunction();
}
function fourthFunction() {
	alert("4");
	headline.innerHTML = "Sie haben auf die Headline geklickt. ";
}

alert("Ja, ich bin in der richtigen Script-Datei.");

// hole das Headline-Element
let headline = document.getElementById("mainHeading");


// füge Eventlistener hinzu
headline.onclick = function() {
	alert("(2) Ich bin im Eventlistener.");
	firstFunction();
	alert("(1) Ich bin im Eventlistener.");
	
};





