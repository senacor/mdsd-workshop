package com.senacor.mdsd.hh.xtend.test2

class Extension {
	def static toFraenkisch(String s) {
		var i=0
		var newS = ""
		
		while (i<s.length()) {
			var char nextChar = s.charAt(i)
			if (nextChar.equals(new Character('t'))) {
				nextChar = 'd'
			} else if (nextChar.equals(new Character('p'))) {
				nextChar = 'b'
			}
			newS = newS+nextChar;
			i = i+1
		}
		
		return newS
	}
	
	def static dispatch dump(Object o) {
		"I'm an Object: "+o
	}
	
	def static dispatch dump(String s) {
		"I'm a String: "+s
	}
	
	def static dispatch dump(Number n) {
		"I'm a Number: "+n
	}
}