package first

class Ex5_ListOps {
    static void main(args) {
        //The full combined list
        def fullList = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
        
        //Portion out the Strings
        def strList = fullList.minus([11, 2, 19, 5])
        //Portion out the Integers
        def intList = fullList.minus(["Mango", "Apple", "Watermelon"])
        
        //Sort both lists and print them
       println "Sorted strlist : ${strList.sort()}"
	   println "Sorted intList : ${intList.sort()}"
    }
}
