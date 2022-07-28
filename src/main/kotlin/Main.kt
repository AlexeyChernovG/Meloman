fun main(args: Array<String>) {


    val itemPrice = 100.0
    val itemCount = 110
    val discount = 100
    val discountRangeStart = 1_000
    val discountRangeEnd = 10_000
    val isClientRegular = true

    val totalPrice = itemPrice * itemCount

    var result = if (totalPrice > discountRangeStart && totalPrice < discountRangeEnd) totalPrice - discount else
        totalPrice
    if (totalPrice > discountRangeEnd) result -= totalPrice * 0.05
    if (isClientRegular) result -= result * 0.01

    println(result)
}
