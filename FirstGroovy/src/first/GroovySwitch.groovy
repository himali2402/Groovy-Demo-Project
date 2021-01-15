package first

class GroovySwitch {
	static void main(String[] args) {
		def a= 2
		
		//Evaluating the expression value
		
		switch(a){
			case 1:
			println("The value of a is One");
			break;
			
			case 2:
			println("The value of a is 2");
			break;
			
			case 3:
			println("The value of a is Three");
			break;
			
			default:
			println("The value is unknown");
			break;
		}
		
	}
}

