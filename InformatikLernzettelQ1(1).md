# Informatik Lernzettel Q1 
> Klausur Nr. 2 - von Jonas M.
## Objektorientierte Programmierung
### Was sind Klassen, Methoden und Attribute?
- Klassen in Java sind Blaupausen für Objekte
- Objekte übernehmen die Attribute und Methoden ihrer Klasse
- Attribute sind Variablen der Klasse(z.B. int y = 7;)
- Methoden sind ein Äquivalent zu Funktionen. Sog. Parameter, also z.B. ein Integer können der Methode beim aufrufen mitgegeben werden
- Beispiel: Klasse = Bauanleitung Auto, Objekt = gebautes Auto, Attribut = Farbe des Autos, Methode = lenken
### UML-Klassendiagramme

| Klasse   | Auto | 
| -------- | -------- | 
| Attribute| -y:int = 7
|Methoden  | +lenken(winkel:double)
- UnifiedModelingLanguarge 
- visuelle Darstellungsart einer Klasse
- Aufbau in die drei Bereiche: Name der Klasse, Attribute der Klasse, Methoden der Klasse

### Sichtbarkeit von Attributen & Methoden in UML-Diagrammen
- \+ =>  public
-  \- => private
-  \# => protected

	|  #  |  Klasse | Paket |  Unterklasse(selbes Paket) |  Unterklasse(anderes Paket) | Welt |
	| -------- | -------- | -------- | -------- | -------- | -------- | 
	| public | ✓ | ✓ | ✓ | ✓ | ✓ |
	| protected | ✓ | ✓ | ✓ | ✓ |  |
	| kein Indikator oder package | ✓ | ✓ | ✓ |  |  |
	| private | ✓ |  |  |  |  |

### Geheimnisprinzip
- Der Zugriff auf die Daten wird aus Sicherheitsgründen und um ungewollte Manipulation zu vermeiden in ihrem Bereich/ in ihrer Sichtbarkeit beschränkt
- Stichwort Datenkapselung
### get/set-Methoden
- Methoden, die einen privaten Datentyp ausgeben oder überschreiben
- Beispiel:
`public class Klasse {`
`private String name; // private = restricted access`

	 ` // get-Methode`
	  `public String getName() {`
	   ` return name;`
	  `}`
	
	 ` // set-Methode`
	  `public void setName(String newName) {`
	   ` Klasse.name = newName;`
	  `}`
	  `}`
- Vorteile:
	+ Bessere Kontrolle von Attributen und Methoden
	+ Option für "read-only" oder "write-only" 
	+ Flexibler
	+ höhere Sicherheit der Daten
### Konstruktoren
- Methode in einer Klasse, die genau so heißt wie sie, und ist public
- Bsp.: public Main() { ...
- Wird beim erstellen eines Objekts der Klasse ausgeführt
- Kann z.B. zum initialisieren von Variablen genutzt werden
- Kann genutzt werden, wenn gewisse Parameter für das Objekt immer benötigt werden
### Assoziation & Aggregation
- http://www.iim.maschinenbau.tu-darmstadt.de/kursunterlagen_archiv/ikt_ws1415/05/Theorie/assoziation_aggregation_komposition.html
