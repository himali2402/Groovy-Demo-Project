package first

class GroovyRange {
	
	public static void main (String[] args) {
	
	//An example of an inclusive Range
	def rint = 1..10 
	
	//contains 
	println (rint.contains(2))
	println (rint.contains(11))
	//An example of an exclusive Range
	def ran = 1..<10
	
	println(ran.get(3))
	println(rint.get(9)) //10
	//Ranges can also consist of characters
	def charran = 'a'..'x'
	println (charran.getFrom())
	//Ranges can also be in descending order
	def desran = 10..20
	println (desran.getTo())
	//Ranges can also consist of characters and be in descending order
	def chardesc = 'x'..'a'
	//size()
	println(chardesc.size()) //10
	
	}
}
