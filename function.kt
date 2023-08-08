fun main() {
    printWeatherForCity("Ankara",27,31,82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity(city="Cape Town", lowTemp=59, highTemp=64, rain=2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}
fun printWeatherForCity(city:String,lowTemp:Int,highTemp:Int,rain:Int){
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rain%")
    println()
}