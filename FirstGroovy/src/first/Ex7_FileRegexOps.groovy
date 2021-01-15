package first

class Ex7_FileRegexOps {
	
  static void main (args) {
	
	//File filex = new File("C:\\Users\\HimaliAgarwal\\Documents\\fileexample.txt")
	
	File filet = new File("C:\\Users\\HimaliAgarwal\\Documents\\sample1.txt");
		
	filet.createNewFile();
	
	filet.write "Hello\n"
	
	filet.append "Testing\n"
	
	filet << "more appending ... \n"
	
	filet.write "A quick brown Fox jumped over the lazy Cow\n"
	
	filet.append("John Jimbo jingeled happily ever after\n")
	
	filet.append("Th1\$ 1\$ v3ry c0nfus1ng  \n")
	
	println "Match Operations"
	
	filet.eachLine { line ->
				if(line ==~ /^A.*Cow$/) {
						println "Line that ends with 'Cow' is: $line"
				}
			}	
	

	
	
	filet.eachLine {line ->
		if(line ==~ /^J.*/) {
			println "Line that starts with J is : $line"
		}
			
	}
	
	
	//Print the line has two number one after the other
	
			filet.eachLine { line ->
	
				if(line ==~ /.*\d\d.*/){
	
					println "Line that has two adjacent numbers: $line"
	
				}
	
			}
			
			println"Findoperaions/n/n"
			
			def match1 = filet.getText()=~/\S+er/
			
			println "String(s) match ' /\\S+er\' are : ${match1.findAll()} "
	
			
			def match2 = filet.getText() =~ /\S*\d\W/
			
					println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
	
		
		   
  }
	
}
