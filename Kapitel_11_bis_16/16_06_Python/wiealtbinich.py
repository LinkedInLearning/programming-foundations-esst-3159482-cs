# Laden der Standardfunktionen zu Datumsberechnung
from time import *

# Anlegen einer neuen Funktion
def berechnen():
	# Ermitteln der aktuellen Jahreszahl
	heute = gmtime().tm_year

	# Einlesen der Eingabe
	eingabe = input("In welchem Jahr wurden Sie geboren?\n")

    # Konvertieren der Eingabe in eine Zahl
	jahr = int(eingabe)

    # Berechnung des Datums
	alter = heute - jahr

    # Validierung
	if alter < 0 or alter > 120:
		print("Bitte geben Sie Ihr Geburtsjahr korrekt ein.")
		berechnen()
	else:
		# Ausgabe des Datums
		print("Sie sind",alter,"Jahre jung.")

#Aufruf der Methode sobald das Script gelesen wird
berechnen()