package first


class RegexExample {
	public static void main(String[] args) {
		// Defines a string with special signs
		def text = "John Jimbo jingeled happily ever after"

		// Every word must be followed by a non-word character
		// Match
		if (text==~/(\w*\W+)*/) {
			println "Match was successful"
		} else {
			println "Match was not successful"
		}

		// Every word must be followed by a non-word character
		// Find
		if (text=~/(\w*\W+)*/) {
			println "Find was successful"
		} else {
			println "Find was not successful"
		}
		
		//Find words starting with "J"
		if (text==~/^J.*/ ) {
			println "There was a match"
		} else {
			println "No match found"
		}
		
		//Replace all words with "hubba"
		def newText = text.replaceAll(/\w+/, "hubba")
		println newText
		
		def text1 = "John Jimbo jingeled happily ever after."
		
		//Store the result in a variable
		def x = text1 =~ /\S+er\b/
			
		//find() returns true/false
		println x.find() //true
			
		//findAll returns a list of all matches
		println x.findAll() //[ever, after]
	}
}