// Enthaelt Funktionen um auf die Konsole zu schreiben und von ihr zu lesen
#include <stdio.h>

// Funktionen um das Datum zu ermitteln
#include <time.h>


void berechnen()
{		
	// Ermittlung der aktuellen Systemzeit
	time_t rohZeit = time(NULL);
	
	// Umrechnung in ein konkretes Datumsformat
	struct tm *formatiertesDatum = localtime(&rohZeit);
	
	// Ausgabe an den Nutzer
	printf("In welchem Jahr wurden Sie geboren?\n");
		
	// Eingabe des Nutzers in Variable speichern
	int jahresanzahl;	
	scanf("%d", &jahresanzahl);
		
	// Jahre errechnen
	int alter = formatiertesDatum->tm_year - jahresanzahl + 1900;	

	// Validierung der Berechnung
	if (alter < 0 || alter > 120)
	{
		printf ("Bitte geben Sie Ihr Geburtsjahr korrekt ein.");
		// Erneuter Aufruf falls ein Fehler vorliegt
    	berechnen();
	}    	
  	else
	{		
		// Ausgabe des Alters
		printf("Sie sind %d Jahre jung.", alter);
	}    
}

// Aufruf der Berechnung nach Programmstart
int main(int argc, char* argv[]) {
	
	berechnen();
	
	return 0;
}