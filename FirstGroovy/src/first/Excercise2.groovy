package first

class Excercise2 {
	public static void main(String[] args) {
		//initialize marks 
		def marks =  [50,100,20,65,90,0]
		def sum = 0 , avg = 0
		def grade= 'F'
		
		marks.each{sum+=it}
		avg = sum/marks.size() as Integer
		//Get grade
		
		switch(avg ) {
			case 90..100 :
			grade = "A"
			println grade
			break
			case 80..90:
			
			grade = "B"
			println grade
			break
			
			
			case 70..79:
			
			grade = "C"
			
			break
			
			case 50..69:
			
			grade = "D"
			println grade
			break
			
			case 0..49:
			
			grade = "F"
			
			break
				
			default:
			
			println "Invaid value"
							
			
		}
		
		println "Maximum Marks :" + marks.max()
		println " Minium marks :" + marks.min()
		
		println "Average Grade: " + avg
		
				println "Grade: " + grade
	}
}
