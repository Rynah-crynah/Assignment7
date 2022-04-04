fun main() {
    oddNum()
    println( characters(arrayOf("Shamun","Suhaila","Suheil","Swabrina","Zulekha")))
    robotServingDrinks(5)
    robotServingDrinks(13)
    robotServingDrinks(26)

    multiplication()
}
fun oddNum() {
    for ( w in 1..100) {
        if (w % 2 !== 0) {
            println(w)
        }
    }
}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun characters(names:Array<String>):Int{
    var num=0
    names.forEach{n->
        if (n.length>5){
            num++
        }
    }
    return num
}
/*You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of coca cola. Create a function that will make these
decisions, printing out the name of the drink each person gets according to
their age. (2pts)*/
fun robotServingDrinks(age:Int){
    if (age<=6){
        println("glass of milk")
    }
    else if(age>6 && age<15){
        println("Fanta Orange")
    }
    else{
        println("cocacola")
    }
}
/* Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number.*/
fun multiplication() {
    for (f in 1..100) {
        if (f % 3 == 0) {
            println("Fizz")
        } else if (f % 5 == 0) {
            println("Buzz")
        }
        if(f%3==0 && f%5==0){
            println("FizzBuzz")

        }
    }
}