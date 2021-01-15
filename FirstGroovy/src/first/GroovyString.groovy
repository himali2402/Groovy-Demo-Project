package first

class GroovyString {
	public static void main(String[] args) {
	
		def name = "John"
		def s1 = "Hello $name" // $name will be replaced
		def s2 = 'Hello $name' // $name will not be replaced
		println s1
		println s2
		
		//print type of variable
		println s1.getClass()
		println s2.getClass()
		
		// demonstrates object references and method calls
		def date = new Date()
		println "We met at $date"
		
		println 'ABCDEF'.length()            // output: 6
		println 'ABCDEF'.substring(1)           // output: BCDEF
		println 'ABCDEF'.substring(2,6)
		println 'ABCDEF'.indexOf('D')       // output: 2
		println 'ABCDEF'.replace("CD", "XX")   // output: ABXXEF
		println 'ABCDEF'.toLowerCase()
		
		println 'ABBC' -'B'
		println 'ABBC' -'BB'
		println 'ABC' -'B'
		println 'ABC' *2
		println 'ABC' * 3
		
		def str1 = """#1 Hello
		This is a multi line
		string example
		"""
		 println str1
		 
		def str2 = '''#2
		This is
		Another multi line
		string sammple
		'''
		 println str2
		 
		def str3 = '#3 This is\
		a sample with\
		backslash'
		 println str3
		 
		def str4 = '\n#4 Another example\n\
		with backslash\n\
		and next line'
		println str4
		
	}
}
