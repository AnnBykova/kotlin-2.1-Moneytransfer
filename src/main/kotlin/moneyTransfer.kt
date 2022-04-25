val feeRate: Double = 0.75
val feeMin: Int = 3_500

fun main() {
    feeCalculation(900.00)
    feeCalculation(10_900.50)

}

fun feeCalculation(sumOfTransfer: Double) {
    val sum: Int = moneyToCent(sumOfTransfer)
    val feeCalc: Int = (sum * feeRate / 100).toInt()
    val feeResult: Int = if (feeCalc <= feeMin) feeMin else feeCalc
    printResult(sumOfTransfer, feeResult)
}

fun moneyToCent(sumOfTransfer: Double): Int {
    val amount: Double = sumOfTransfer * 100
    return amount.toInt()
}

fun printResult(sumOfTransfer: Double, feeCalc: Int) {
    println("Сумма перевода : $sumOfTransfer  рублей Сумма комиссии: $feeCalc копеек")
}

