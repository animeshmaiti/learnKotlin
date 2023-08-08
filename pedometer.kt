// fun main() {
//     val Steps = 4000
//     val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
//     println("Walking $Steps steps burns $caloriesBurned calories") 
// }

// fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
//     val CaloriesBURNEDforEachStep = 0.04
//     val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
//     return TotalCALORIESburned
// }

fun main() {
    val Steps = 4000
    val caloriesBurned = PedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
}

fun PedometerStepsToCalories(NumberOFStepS: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = NumberOFStepS * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
