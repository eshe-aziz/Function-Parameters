//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    add(24, 87)
    add(75, 865)
    add(-673, 89)
    printFullName("Arthur", "Holland")
    printFullName("Eshe", "Aziz")
    getStringLength("AkiraChix")
    getStringLength("Lovelace")
    getStringLength("Software Developer")
}
fun add(num1: Int, num2: Int){
    var result = num1+num2
    println(result)
}

fun printFullName(firstName: String, lastName: String){
    var fullName = firstName + " " +lastName
    println(fullName)
}

fun getStringLength(word: String){
    println(word.length)
}


