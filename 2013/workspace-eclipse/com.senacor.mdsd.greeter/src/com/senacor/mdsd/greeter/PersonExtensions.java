package com.senacor.mdsd.greeter;

import com.senacor.mdsd.greeter.greeterDsl.Person;

public class PersonExtensions {
	public static String overview(Person p) {
		return ((p.getGender().equalsIgnoreCase("w")?"Frau ":"Herr ")+p.getLastname()+", "+p.getFirstname());
	}
}
