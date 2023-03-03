import jdk.jshell.SourceCodeAnalysis.QualifiedNames

fun main(){
    words("Titus","Juliana","Julius","Mariona")
    city()
    codes()
    func("super","jumbo","wen")
    println(func("super","jumbo","wen"))

}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun words(name1:String,name2:String,name3:String,name4:String){
    var group= arrayOf(name1,name2,name3,name4)
    println(group.contentToString())

}
//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun city(){
    var cities= arrayOf("harare","mumbai","dodoma","jarkarta")
    println(cities.map {it.capitalize()})

}
//Create one function that given the below array:
//
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order
fun codes(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[1]+ numbers[2]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())


}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.

fun func(name1:String, name2:String, name3:String,): String {
    var func= arrayOf("name1","name2","name3")
    return func.contentToString()

}