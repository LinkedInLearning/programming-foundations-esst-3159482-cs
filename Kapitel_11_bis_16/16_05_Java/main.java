// Paket in dem unser Programm organsiert ist
package project;

// Importieren der Funktionen fuer Datumsverarbeitung und Ein-/Ausgabe
import java.time.*;  
import java.util.Scanner;
import java.text.*;
import java.util.*;

// Hauptklasse die bei Programmstart aufgerufen wird
public class Main  
{     
    // Methode die nach Programmstart aufgerufen wird
	public static void main(String args[])   
	{  
        // Ausgabe an den Nutzer
		System.out.print("Bitte geben Sie das Geburtsdatum ein.");  
				
        // Eingabe der Nutzerin lesen
        Scanner scanner = new Scanner(System.in);  
		String eingabe = scanner.nextLine();  
		scanner.close();  
        
        // Festlegung des Datumsformats und der Zielvariable
        SimpleDateFormat datumsFormatierung = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMANY);
        Date geburtsDatum;
        
        try 
        {
            // Konvertierung der Zeichenkette in ein Datum, basierend auf der Formatvorlage
            geburtsDatum = datumsFormatierung.parse(eingabe);
        }
        // Programmabbruch als Fehlerbehandlung
        catch(Exception ex) { return; }
		
        // Anlegen eines Personenobjekts mit Geburtsdatum
        Person person = new Person(geburtsDatum);

        // Ermittlung und Ausgabe des Alters
        System.out.println("Die Person ist " + person.getAlter() +" Jahre alt.");  
	} 
} 
