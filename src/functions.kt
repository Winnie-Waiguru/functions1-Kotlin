fun main(){
    greetings("Waiguru")
    remainder(100, 3)
    add(23, 58,78, 90)
    interesting("that I love doing DIY projects.")
}

fun greetings(name: String){

    println("Hello " +name)

}

fun remainder(x: Int, y: Int){

    var subtraction= x/y
    println(subtraction)
}

fun add(p:Int, q: Int, r: Int, s:Int){

    var sum= p + q + r +q
    println(sum)
}

fun interesting(statement: String){
    var aboutYou=("What is so interesting about me is " + statement)
    println(aboutYou)
}