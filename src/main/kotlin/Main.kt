fun main() {

   println(Numbers(23))
    println(Numbers(81))
    println(Numbers(2))
    removeduplicates(arrayOf(1,7,8,9,5))
}
//Write a Kotlin function that takes an integer as input and
// returns true if the integer is a prime number, and false otherwise.
fun Numbers(num1:Int):Boolean{
    if(num1 <=1){
        return false
    }
    for (num in 2..Math.sqrt(num1.toDouble()).toInt()){
        if (num1 % num == 0) {
            return false
        }
    }
    return true


}
//Write a Kotlin function that takes an array of integers as input and
// returns a new array with all the duplicate values removed.
fun removeduplicates(mynumbers:Array<Int>): IntArray {
    val set= mutableSetOf<Int>()
    for(element in mynumbers){
        set.add(element)
    }
    return set.toIntArray()
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 character
fun names (number:Array<String>):Int{
    var numberLonger =0
    for (z in number){
        if(z.length>5){
            numberLonger++
        }

    }
    return numberLonger
}