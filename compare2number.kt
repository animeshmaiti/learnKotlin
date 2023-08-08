fun main() {
    println("Have I spent more time using my phone today: ${compare(300, 250)}")
    println("Have I spent more time using my phone today: ${compare(300, 300)}")
    println("Have I spent more time using my phone today: ${compare(200, 220)}")
}

fun compare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
