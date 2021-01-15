package first

class Ex6_MapsOps {
	
	static void main(args) {
	
	//New map
	
	def mp=  ["1" :"Donkey" , "2":"Dog" ,"3" : "Cat"]
	
	def map = [:]
	
	map.put(1, "Lion")
	
	map.put(2, "Dogs")
	
	map.put(3, "Wolves")
	
	println(map.values())
	println(mp.get("1"))
	
	for(def item : map) {
		println item
	}
	
	
	def newMap = map.plus([4 : "Deer",5: "Horses",])
	println newMap
	println newMap.values().sort()
	println newMap.values().sort{it.length()}

	}
	
}
