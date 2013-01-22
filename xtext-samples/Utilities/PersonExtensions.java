package com.senacor.mdsd.greeter;

import com.senacor.mdsd.greeter.greeterDsl.Person;

/**
 * Diese Klasse definiert "static extensions" für die Klasse Person. Ziel ist es, in einem
 * Template p.overview aufzurufen und damit das Konstrukt der Extension zu zeigen.
 *
 * Sie sollte im gleichen Projekt wie das xtend-Template liegen, aus dem es benutzt werden soll.
 */
public class PersonExtensions {
	public static String overview(Person p) {
		return ((p.getGender().equalsIgnoreCase("w")?"Frau ":"Herr ")+p.getLastname()+", "+p.getFirstname());
	}
}
