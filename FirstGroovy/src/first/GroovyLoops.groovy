package first

class GroovyLoops {
	
	public static void main(String[] args) {
	
	def list = ["Lars", "Ben", "Jack"]
	
	//using a variable assignment
	list.each { lastname -> println lastname }
	
	//uisng the it variable
	list.each { println it }
	
	
	//prints 0 to 4
	5.times{println "Times + $it"}

	//print 1 to 3
	1.upto(3) { println "Upto + $it" }
	//print downto
	4.downto(1){println "downto + $it"}
	
	//Sm of 100 numbers
	
	def sum = 0
	1.upto(100) { sum += it }
	println "sum = " + sum
	
	
	
}

}

