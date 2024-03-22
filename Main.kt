fun main() {

    // page 9
    simplePrintFunction()
    printSeparatorDashes()

    //page 10
    val hMI: Double = findHeightMassIndex(1.76, 74.0)
    printSeparatorDashes()

    // page 11
    simpleVariablesFunction()
    printSeparatorDashes()

    // page 12-13
    println("This is an example for pages 12-13")
    val firstCar = ModelA(150.0, 6)
    val secondCar = ModelB(150.0, 5)
    println("Max distance that first car which has ${firstCar.numberOfGears} gears can go is: ${firstCar.distanceToGo} km")
    println("Max distance that second car which has ${secondCar.numberOfGears} gears can go is: ${secondCar.distanceToGo} km")
    printSeparatorDashes()

    // page 14
    basicStringFunction()
    printSeparatorDashes()

    // page 15
    println("This is an example for page 15")
    println(simpleIfFunctionMultipleLines(16))
    println(simpleIfFunctionSingleLine(9))
    printSeparatorDashes()

    // page 16
    println("This is an example for page 16")
    simpleForLoopFunction(listOf(1, 2, 3, 4, 5, 6, 7, 8), true)
    val tempList = simpleForLoopReturnFunction(listOf(1, 2, 3, 4, 5, 6, 7, 8), false)
    println(tempList)
    printSeparatorDashes()
    
    // page 17
    println("This is an example for page 17")
    var isPrime = simpleWhileLoopFunction(17)
    println("Is 17 a prime number: $isPrime")
    isPrime = simpleWhileLoopFunction(35)
    println("Is 35 a prime number: $isPrime")
    printSeparatorDashes()
    
    // page 18
    println("This is an example for page 18")
    println(simpleWhenFunction(1.76, 75.0))
    printSeparatorDashes()
    
    // page 19
    simpleRangeFunction(21)
    println("Is 41 prime: ${simpleRangeReturnFunction(41)}")
    printSeparatorDashes()
    
    // page 20
    simpleCollectionFunction()
    printSeparatorDashes()
    
    // page 21
    println("This is an example for page 21")
    simpleNullableFunction(null)
    simpleNullableFunction("Egemen Atik")
    printSeparatorDashes()
    
    // page 22
    println("This is an example for page 22")
    simpleTypeCheckFunction(3.14)
    simpleTypeCheckFunction("Egemen Atik")
    simpleTypeCheckFunction(true)
    simpleTypeCheckFunction(24)
    printSeparatorDashes()
}

// page 9
fun simplePrintFunction() {
    print("This is first example for page ")
    println(9)
    println("And this is " + 2 + "nd example for page 9")
}

// related to page 10 but mainly used for separating examples
fun printSeparatorDashes(): Unit {
    println("-----------------------------------------------------------")
}

// page 10
fun findHeightMassIndex(height: Double, weight: Double): Double {
    println("This is an example for page 10")
    val heightMassIndex = weight / (height * height)
    println("Entered height is $height")
    println("Entered weight is $weight")
    println("Calculated height mass index is: $heightMassIndex")
    return heightMassIndex
}

// page 11
fun simpleVariablesFunction() {
    println("This is an example for page 11")
    val firstVariable = "My name is Egemen"
    val secondVariable: Boolean = true
    var thirdVariable = 35.0
    val fourthVariable: Int
    fourthVariable = 13

    println("First variable type: ${firstVariable::class.simpleName} and value: $firstVariable")
    println("Second variable type: ${secondVariable::class.simpleName} and value: $secondVariable")
    println("Third variable type: ${thirdVariable::class.simpleName} and value: $thirdVariable")
    println("Fourth variable type: ${fourthVariable::class.simpleName} and value: $fourthVariable")

    /* erroneous cases
    thirdVariable = 1245
    secondVariable = false
    firstVariable = ""
    val fourthVariable
    fourthVariable = 13
    */

    thirdVariable--
    println("Third variable type: ${thirdVariable::class.simpleName} and value: $thirdVariable")
}

// page 12-13
open class Car(open val numberOfGears: Int)

class ModelA(val amountOfFuel: Double, override val numberOfGears: Int): Car(numberOfGears) {
    val distanceToGo = amountOfFuel / 5
}

class ModelB(val amountOfFuel: Double, override val numberOfGears: Int): Car(numberOfGears) {
    val distanceToGo = amountOfFuel / 3
}

// page 14
fun basicStringFunction() {
    println("This is an example for page 14")
    val s1 = "17 - 8 = ${17 - 8}"
    val s2 = "${s1.replace("-", "+")}"
    val s3 = "${s2.replace("${17 - 8}", "${17 + 8}")}"
    val s4 = "${s3.substring(9)}"
    println(s1)
    println(s2)
    println(s3)
    println(s4)
}

// page 15
fun simpleIfFunctionMultipleLines(age: Int): String {
    if (age < 18) return "There are ${18 - age} more years until you can get a driver's license"
    else return "You can get a driver's license anytime you want"
}

fun simpleIfFunctionSingleLine(number: Int) = if (number < 0) true else false

// page 16
fun simpleForLoopFunction(list: List<Int>, isEven: Boolean): Unit {
    for (index in list.indices) {
        if (isEven && list[index] % 2 == 0) println("Even number ${list[index]} is found at index $index")
        else if (!isEven && list[index] % 2 == 1) println("Odd number ${list[index]} is found at index $index")
    }
}

fun simpleForLoopReturnFunction(list: List<Int>, isEven: Boolean): List<Int> {
    val returnList = mutableListOf<Int>()
    for (element in list) {
        if (isEven && element % 2 == 0) returnList.add(element)
        else if (!isEven && element % 2 == 1) returnList.add(element)
    }
    return returnList
}

// page 17
fun simpleWhileLoopFunction(number: Int): Boolean {
    if (number < 2) return false
    var index = 2
    while (index < number) {
        if (number % index == 0) return false
        index++
    }
    return true
}

// page 18
fun simpleWhenFunction(height: Double, weight: Double): String {
    val hMI = weight / (height * height)
    return when {
        hMI !is Double	-> "Wrong inputs"
        hMI < 0	-> "Wrong inputs"
        hMI < 18.5 	-> "Underweight"
        hMI < 24.9	-> "Healthy Weight"
        hMI < 29.9	-> "Overweight"
        else -> "Obese"
    }
}

// page 19
fun simpleRangeReturnFunction(number: Int): Boolean {
    for (divider in 2 until number) {
        if (number % divider == 0) return false
    }
    return true
}

fun simpleRangeFunction(number: Int) {
    println("This is an example for page 19")
    print("Even numbers between 0 and $number are as follows: ")
    var startNumber = number
    if (number % 2 == 1) startNumber--
    for (num in startNumber downTo 0 step 2) {
        print("$num ")
    }
    println()
}

// page 20
fun simpleCollectionFunction() {
    println("This is an example for page 20")
    val names = listOf(
        "Emma", "Liam", "Olivia", "Noah", "Ava","William",
        "Sophia", "James", "Isabella", "Benjamin"
    )
    
    names
    	.filter { startsWithVowel(it) }
        .forEach { print("$it ") }
    
    println()
    
    val lengths = names
    	.filter { startsWithVowel(it) }
        .map { it.length }
        
   	lengths.forEach { print("$it ") }
    
    println()
    println("Each name length is bigger than 5: ${lengths.all { it > 5 }}")
    println("Sum of lengths: ${lengths.reduce { acc, i -> acc + i }}")
}

fun startsWithVowel(str: String): Boolean {
    val lowercaseStr = str.lowercase()
    return lowercaseStr.startsWith("a") || lowercaseStr.startsWith("e") || lowercaseStr.startsWith("i") 
    		|| lowercaseStr.startsWith("o") || lowercaseStr.startsWith("u")
}

// page 21
fun simpleNullableFunction(name: String?) {
    if (name == null) {
        println("Hello, my name is John Doe")
    } else {
        println("Hello, my name is $name")
    }
}

// page 22
fun simpleTypeCheckFunction(obj: Any) {
    when (obj) {
        is String	-> println("Passed object is a String")
        is Double	-> println("Passed object is a Double")
        is Int		-> println("Passed object is a Int")
        is Boolean	-> println("Passed object is a Boolean")
        is String	-> println("Passed object is another type")
    }
}