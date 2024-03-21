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