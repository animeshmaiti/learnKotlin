fun main(){
    val firstUserEmailId = "user_one@gmail.com"
    // when we are giving param like this we have to give param name same as in function
    println(displayAlertMessage(email = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem,secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))

    val operatingSystem = "Chrome OS"
    val emailID="sample@gmail.com"
    println(displayAlertMessage(operatingSystem,emailID))
}
fun displayAlertMessage(system:String="Unknown OS",email:String):String{
    val alertMassege="There's a new sign-in request on $system for your Google Account $email."
    return alertMassege
}