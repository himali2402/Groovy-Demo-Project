package first

class Example1_PrgExcercise {
	static void main(args) {
		def x
		int y
		
		def arr = [1,2,0,3.0,"saahil", x, y]
		arr.each { println it + " Class is : " + it.getClass()}
		
		
				
		
				//Array
		
				def arr1 = [1, 2.0, "Saahil", true, x, y]
		
				
		
				arr1.each { println "Value is: " + it +". Data type is: " + it.getClass() }
		
			
	}
	
}
