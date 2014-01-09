// ###########################################
// Variante 1
//
// Eine Liste von beliebig vielen Gruessen
// 'Hello' und '!' werden als Keywords betrachtet
// Als Name wird ein String (in Anfuehrungszeichen) erwartet
//
// Model:
//	greetings+=Greeting*
// ;
//	
// Greeting:
//	'Hello' name=STRING '!'
// ;

/*
Hello "Mickey"!
Hello "Mouse"!
*/


// ###########################################
// Variante 1b 
//
// Analog 1, allerdings wird als Name eine Id erwartet (Zeichenkette ohne Anfuehrungszeichen)
//
// Model:
//	greetings+=Greeting*
// ;
//	
// Greeting:
//	'Hello' name=ID '!'
// ;

/*
Hello Mickey!
Hello Mouse!
*/

// ###########################################
// Variante 2
//
// Das Grusswort ist in eine eigene Regel ausgelagert, akzeptiert werden
// zwei verschiedene Keywords
//  
// Model:
//	greetings+=Greeting*
// ;
//	
// Greeting:
//	Word name=STRING '!'
// ;
//	
// Word:
//	'Hello'|'Hallo'
//;

/*
Hello "Mickey"!
Hallo "Mouse"!
*/

// ###########################################
// Variante 3
//
// Das Grusswort ist kein Keyword mehr, sondern eine Enum. Enums sind
// "Platzhalter" liefern Datentypen und keine Keywords. Deshalb muss eine
// Zuweisung an eine Variable erfolgen. Mehrere symbolische Werte koennen
// auf eine Enum-Id abgebildet werden.
// 
// Model:
//	greetings+=Greeting*
// ;	
// Greeting:
//	word=Word name=STRING '!'
// ;
//	
// enum Word:
//  DE='Hallo' | DE='Huhu' | 
//  EN='Hello' | 
//  FR='Bonjour'
// ;

/*
Hallo "Mickey"!
Bonjour "Mouse"!
Huhu "Dagobert"!
*/

// ###########################################
// Variante 4
// 
// Gruss und Person werden nun getrennt voneinander definiert, der Gruss
// referenziert die Person. Als Name der Referenz wird immer die interne
// Variable 'name' verwendet. Es kann ueber Dateigrenzen hinweg referenziert
// werden - AA ist in einer anderen Datei definiert.
//
// Model:
//	persons+=Person*
//	greetings+=Greeting*
// ;
//	
// Person:
// 	'Person' name=ID 'firstname' fn=STRING 'lastname' ln=STRING
// ;
//
// Greeting:
//	greetword=Greetword person=[Person] '!'
// ;
//
// enum Word:
//  DE='Hallo' | DE='Huhu' | 
//  EN='Hello' | 
//  FR='Bonjour'
// ;

Person MM firstname "Mickey" lastname "Mouse"
Person DD firstname "Dagobert" lastname "Duck"
Person GG firstname "Gustav" lastname "Gans"

Hallo MM!
Huhu DD!
Bonjour GG!
Hello AA!