fun main() {

    // Appetizer
    val caesarSalad = 8.50

    // Entree
    val beefStroganoff = 18.0

    // Dessert
    val cheesecake = 6.0

    // Tip percentage
    val tip = 0.15

    // Calculate total bill before tip
    val total = caesarSalad + beefStroganoff + cheesecake

    // Calculate final amount including tip
    val finalAmount = total * tip + total

    // Output total and final amount
    println("Total (before tip): $$total")
    println("Final Amount (including tip): $$finalAmount")
}
