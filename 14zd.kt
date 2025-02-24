fun main() {
    try {

    println("Введите четырехзначное число.")
    var number = readln().toInt()
    var sum = 0
    when{
        (1000<=number&&number<=9999)->{
            sum += number % 10
            number /= 10
            sum += number % 10
            number /= 10
            sum += number % 10
            number /= 10
            sum += number % 10
            number /= 10
            println("Сумма цифр $sum")
        }
        else->{
            println("Введенно не четырехзначное число.")
        }
    }
    }catch (e:Exception){
        println("Неверные данные")
    }
}