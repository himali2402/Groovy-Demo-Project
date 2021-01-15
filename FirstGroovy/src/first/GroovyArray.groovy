package first

class GroovyArray {
static main(args) {
    def birds = new String[3]
	birds[0] = "Parrot"
	birds[1] = "Koel"
	birds[2] = "Cuckoo"
    println birds
    /*Output
    [Parrot, Cockatiel, Pigeon]
    */
	
	//groovy style
	def birdArr = ["Parrot","Cuckoo","Pigeon"]
	println(birdArr)
	println birdArr[2]
	
	println birdArr.getAt(1)
	println birds.getAt(-3)
	
	def birdsWithoutKoel = birds - "Koel"
	println(birdsWithoutKoel)
	
	
	def numbers = [32,44,12,9,100,180]
	println numbers.max()
	println numbers.min()
	
	def birds2 =  ["Cockatiel","Pigeon", "Koel"]
	println birds2.max{it.size()}
	println birds2.min{it.size()}
	
	def birds3 = ["Parrot", "Cockatiel", "Pigeon"]
	
		println birds3[0] // Parrot
		println birds3[2] // Pigeon
		println birds3.getAt(1) // Cockatiel
	
		println birds3[-1] // Pigeon
		println birds3[-3] // Parrot
}
}
