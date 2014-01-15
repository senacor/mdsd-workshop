package foo.bar

class StringExtensions {
	def static void main(String[] args) {
		System.out.println("Guten Tag".toUpperCase)
		System.out.println("Guten Tag".toFraenkisch)
	}
	
	
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
}