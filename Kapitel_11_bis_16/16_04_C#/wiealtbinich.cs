// Laden von Standardfunktionalität
using System;
using System.Globalization;

// Hauptklasse die bei Programmstart aufgerufen wird
public class MainClass 
{	
	// Hauptmethode, die bei Programmstart aufgerufen wird
	public static void Main() 
	{
		// Einlesen der Nutzereingabe und speichern als Zeichenkette
		Console.WriteLine("Bitte geben Sie das Geburtsdatum ein.");
		string geburtstagAlsZeichenkette = Console.ReadLine();
		
		// Konvertierung der Zeichenkette in ein gültiges Datum
		var deutschesFormat = new CultureInfo("de-DE");
		var geburtstagAlsDatum = DateTime.Parse(geburtstagAlsZeichenkette, deutschesFormat);
		
		// Anlegen eines Personenobjets
		var person = new Person(geburtstagAlsDatum);
		
		// Ausgeben des Alters auf Basis der Person
		Console.WriteLine($"Die Person ist {person.Alter} Jahre jung.");		
	}
	
}

// Personenklasse hält alle Daten und Berechnungen zu einer Person
public class Person
{	
	// Eigenschaften können von außen gelesen aber nur innerhalb der Klasse gesetzt werden
	public DateTime Geburstag { get; private set; }		
	public int Alter { get; private set; }
	
	// Setzen aller Daten und Berechnungen des Alters sobald ein Personenobjekt erzeugt wird
	public Person(DateTime geburtstag)
	{
		Geburstag = geburtstag;
		BerechneAlter(geburtstag);
	}
	
	// Eigentliche Berechnung (stark vereinfacht)
	private void BerechneAlter(DateTime geburtstag)
	{
		Alter = DateTime.Now.Year - geburtstag.Year;
		// korrekte Berechnung: Alter = Convert.ToInt32((DateTime.Now - geburtstag).TotalDays / 365.2425);
	}
}