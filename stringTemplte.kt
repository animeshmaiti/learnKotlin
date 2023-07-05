fun main() {
    // val can't be reassigned
    val discountPercentage: Int = 20
    val item= "Google Chromecast"
    val offer: String = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    // those two lines are not valid
    // discountPercentage = 20
    // offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
}