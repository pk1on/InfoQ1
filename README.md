# Informatik Lernzettel Q1 
> Klausur Nr. 2 - von Jonas M. - code kommt größtenteils von w3schools.com 
> Bitte beachtet, dass nicht jedes Konzept, das implementiert werden muss, auch in Java Code angegeben ist
## Objektorientierte Programmierung
### Was sind Klassen, Methoden und Attribute?
- Klassen in Java sind Blaupausen für Objekte
- Objekte übernehmen die Attribute und Methoden ihrer Klasse
- Attribute sind Variablen der Klasse(z.B. int y = 7;)
- Methoden sind ein Äquivalent zu Funktionen. Sog. Parameter, also z.B. ein Integer können der Methode beim aufrufen mitgegeben werden
- Beispiel: Klasse = Bauanleitung Auto, Objekt = gebautes Auto, Attribut = Farbe des Autos, Methode = lenken
### UML-Klassendiagramme

| Klasse   | Auto | 
| :--------: | :--------: | 
| Attribute| -y:int = 7
|Methoden  | +lenken(winkel:double) |
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
### Assoziation & Aggregation und Multiplizitäten
- http://www.iim.maschinenbau.tu-darmstadt.de/kursunterlagen_archiv/ikt_ws1415/05/Theorie/assoziation_aggregation_komposition.html
## Such- und Sortieralgorithmen
### Arrays
- Arrays speichern mehrere Werte des selben Datentyps in einer einzigen Variablen
- Deklaration:
  `String[] autos;` Deklariert den Array "cars" des Datentyps String
  `int[] meineZahlen;` Deklariert den Array "meineZahlen" des Datentyps Integer
- Initialisierung:
  `String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};` Werte werden dem Array übergeben (gleichzeitige Deklaration und Initialisierung)
  `meineZahlen[0] = 7;` An der Index stelle 0 wird der Wert 7 eingesetzt
### for-Schleifen mit Arrays
- for-Schleifen:  
	+ `
		for (statement 1; statement 2; statement 3) {
	  // code, der ausgeführt wird
		}`
	+ s1: einmal beim erstmaligen Aufrufen der Schleife ausgeführt
	+ s2: die Bedingung für die Schleife
	+ s3: wird nach jedem Durchlauf des Codes ausgeführt
	+ `for (i = 0;i < 9;i++) {
	  //code
	  }`
- Array ausgeben lassen:
  `String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};`
  `for (int i = cars.length - 1;i >= 0;i--) {`
	  `System.out.println(cars[i]);`
  `}`
  Output: Mazda Ford BMW Volvo

  `String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};`
  `for (int i = 0;i < cars.length;i++) {`
	  `System.out.println(cars[i]);`
  `}`
  Output: Volvo BMW Ford Mazda
- Array anlegen:
  `int[] numb = new int[10];` Gibt dem Array den Wert 0 an den Stellen 0-9
  `for (int i = 0;i < 10;i++) {`
	  `numb[i] = i * 2;`
  `}`
  numb = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18}
### Zweidimensionale Arrays
- Array im Array oder Tabelle
- zwei Indizes
- `int[][] numb2 = { {1, 2, 3, 4}, {5, 6, 7} };`
  `numb2[0][2] == 3`
- Hinweis: Arrays beginnen mit dem Index 0
### Objekte in Arrays
- `Fahrrad[] listeFahrraeder = new Fahrrad[5];` 5 = länge des Arrays aka. Anzahl möglicher Objekte
  `listeFahrraeder[0] = new Fahrrad("grün", "cube");` 
### Länge eines Arrays
- Array.length 
- listeFahrraeder.length == 5
### Linearer Suchalgorithmus
- der Array wird ein Element nach dem anderen durchsucht
- langsam, aber funktioniert immer
### Binärer Suchalgorithmus
- kann bei einem geordnetem Array genutzt werden
- Wert in der Mitte des Arrays wird mit Suchwert verglichen, wenn kleiner, wird die Hälfte der Hälfte abgezogen, wenn größer hinzugefügt, dann wird wiederholt
- log2(n) + 1 = Wiederholungen bis zur Lösung
- deutlich schneller, benötigt aber eine Sortierte Liste
### Struktogramme
- https://unterrichten.zum.de/images/3/3d/Struktogramm-Mustererkennung.svg#
### Sortieralgorithmen
- Selection Sort
	+ ganzes Array wird durchlaufen, um den kleinsten Wert zu finden
	+ kleinste Wert wird mit Wert an erster Stelle getauscht
	+ verfahren wird wiederholt, nur ohne den ersten Wert
- Insertion Sort
	+ Erster Wert sortierter Bereich
	+ zweiter Wert wird hinzugefügt, je nachdem, ob er größer oder kleiner ist vor oder nach dem ersten Wert
	+ Sortierter Bereich ist nun der erste und zweite Wert
- Bubble Sort
	+ Erster und zweiter Wert werden verglichen, wenn nötig getauscht, dann der zweite und dritte usw.
	+ Nach einem Durchlauf ist die größte Zahl am richtigen Ort und das verfahren kann ohne sie wiederholt werden
