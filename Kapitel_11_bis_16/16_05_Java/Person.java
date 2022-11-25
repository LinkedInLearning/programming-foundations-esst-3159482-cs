// Definieren der Klasse "Person"

package project;

// Pakete einbinden
import java.time.*;  
import java.util.*;

// Definiere Klasse Person
public class Person
{               
    // Die Klasse Person enthaelt Variable mit Gebursdatum 
    private Date geburtsDatum;
        
    // Konstruktor anlegen
    public Person(Date geburtsDatum)
    {
        this.geburtsDatum = geburtsDatum;            
    }
        
    // Zugriffsmethode getAlter public setzen
    public int getAlter()
    {
        // Alter berechnen und zurueckgeben
    	return  LocalDate.now().getYear() - (this.geburtsDatum.getYear() + 1900);
	}
}