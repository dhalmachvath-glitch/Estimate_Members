fun main() {
    val foodFor = 500
    val totalPeople = 800
    // Calculate extra people
    val extraPeople = totalPeople - foodFor

    val foodPerPersonKg = 0.5
    // Calculate extra food amount
    val extraFoodNeeded = extraPeople * foodPerPersonKg


    println("Food prepared for: $foodFor people")
    println("Total people coming: $totalPeople")

    println("Extra people: $extraPeople")
    println("Extra food needed (kg): $extraFoodNeeded")
}
