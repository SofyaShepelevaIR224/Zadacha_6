fun main() {
    println("Введите первую цифру:")
    val digit1 = readLine()!!.toInt()

    println("Введите вторую цифру:")
    val digit2 = readLine()!!.toInt()

    if (digit1 == digit2) { //Проверяет, равны ли введенные цифры
        println("Создать нечетное число невозможно")
    } else {
        val number1 = digit1 * 10 + digit2
        val number2 = digit2 * 10 + digit1

        if (number1 % 2 != 0) { //Проверяет, является ли первое число нечетным (остаток от деления на 2 не равен 0).
            println("Нечетное число: $number1")
        } else if (number2 % 2 != 0) {
            println("Нечетное число: $number2")
        } else {
            println("Создать нечетное число невозможно")
        }
    }
}