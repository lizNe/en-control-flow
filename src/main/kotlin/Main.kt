//TODO INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments - follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
// Hint: the week 2 syntax labs are a good support for completing this project

fun main(args: Array<String>) {
    minimumOf(5,7)
    rangeOf(4)
    inferredTypeOf(0.0F)
    stringContains("bad")

}

// 2 Parameters are passed into the function each with type Long
// If num1 is less than num2 print statement else if num1 is bigger or equal to num2 print other statement
fun minimumOf(number1: Long, number2: Long){
    if(number1<number2) {
        println("Number 1 is less than Number2 ")
    }else if (number1>=number2){
        println("Number 2 is greater than Number 1 ")
    }

}

// Int.MIN_VALUE goes below 0, goes for minus values if entered as the parameter in the function rangeOf()
// Int.MAX_VALUE goes over as far as INT goes
fun rangeOf(number: Int){
    when(number){
        in Int.MIN_VALUE..0-> println("The number falls into the range is 0 or below")
        in 1..5->println("The number falls into the range is 1 to 5")
        in 6..10->println("The number falls into the range is 6 to 10")
        in 11..20->println("The number falls into the range is 11 to 20")
        in 21..Int.MAX_VALUE->println("The number falls into the range is 21 and over")
        else->println("The number is: $number")
    }
}

// Has the parameter names variable with the variable type being any.
// The variable is (0.0F) so when this variable is either of the variable types the appropriate statement will print

fun inferredTypeOf(variable: Any) {
    when (variable) {
        is Int -> println("The inferred type is Int")
        is Long -> println("The inferred type is Long")
        is Double -> println("The inferred type is Double")
        is Float -> println("The inferred type is Float")
        is Boolean -> println("The inferred type is Boolean")
        else -> {
            println("The inferred type is none of the above")

        }
    }
}

// myString will turn into uppercase so when the word passed contains a lowercase letter
// one of the println statements will print saying it contains the letter regardless of case.
// Char ' ' String " " ----!!!!!! REMEMBER
// Will always execute the first statement A regardless if the first letter was b (bad). Can change to .first()
fun stringContains(myString : String) = when {
        myString.uppercase().contains('A') -> println("The string $myString contains the letter A")
        myString.uppercase().contains('B') -> println("The string $myString contains the letter B")
        myString.uppercase().contains('C') -> println("The string $myString contains the letter C")
        myString.isEmpty() -> println("Empty String..no word displayed")
        else -> println("The string $myString contains none of the above letters ")
    }