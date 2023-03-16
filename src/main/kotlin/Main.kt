fun main() {
    num()
    var result=names(arrayOf("people","elephant","building","fruit","dance"))
    println(result)
    robot(0)
    digits()
}
fun num(){
    for (num in 1..100){
        if (num%2 !=0 ){
            println(num)
} } }
fun names(x :Array<String>):Int{
    var z= 0

    for (name in x){
        if (name.length>5){
            z++
        }
    }
   return z
}
fun robot(age:Int){
    when (age){
        in 0..6 -> println("milk")
        in 7..14 -> println("fanta orange")
        else-> println("cocacola")


    }

}
fun digits(){
    for (num in 1..100){
        if (num%3==0 && num %5==0){
            println("FizzBuzz")
            }
else if (num%3==0){
    println("Fizz")

        }
    else if (num%5==0){
        println("Buzz")
    }
        else{
            println(num)
        }
    } }