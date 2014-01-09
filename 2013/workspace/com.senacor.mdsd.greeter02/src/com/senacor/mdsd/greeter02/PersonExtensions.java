package com.senacor.mdsd.greeter02;

import com.senacor.mdsd.greeter02.greeterDsl02.Person;

public class PersonExtensions {
	public static String overview(Person p) {
		return ((p.getGender().equalsIgnoreCase("w")?"Frau ":"Herr ")+p.getLastname()+", "+p.getFirstname());
	}
}
