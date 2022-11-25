// Definiere die Funktionen
function firstFunction() {
	let a = 5;
	let b = 10;
	secondFunction();
	let c = a + b;
}
function secondFunction() { 
	var message;
	message = "Hello World!";
	thirdFunction();
}
function thirdFunction() {
	var i = 0;
	var total = 0;

	while ( i < 100 ) {
		total = total + 100;
		i++;
	}   
	fourthfunction();
}
function fourthFunction() {
	headline.innerHTML = "Sie haben auf die Headline geklickt. ";
}



// hole das Headline-Element
var headline = document.getElementById("mainHeading");


// füge Eventlistener hinzu
headline.onclick = function() {
	//alert("im Eventlistener");
	firstFunction();
	
};





