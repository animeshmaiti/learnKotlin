fun main() {
    // val numberOfAdults = "20"
    // val numberOfKids = "30"
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    val baseSalary = 5000
    val bonusAmount = 1000
    // $ is used to refer to a variable in a string template (string interpolation)
    // val totalSalary = "$baseSalary + $bonusAmount"
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}