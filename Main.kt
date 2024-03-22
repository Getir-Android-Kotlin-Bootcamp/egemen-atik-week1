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