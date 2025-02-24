fun main() {
    try {
        var a = readln().toDouble()
        var b = readln().toDouble()
        var c = readln().toDouble()
        var discriminant = b * b - 4 * a * c

        // Шаг 2: Обрабатываем результаты с помощью when
        when {
            discriminant < 0 -> {
                println("Уравнение не имеет корней.")
            }

            discriminant == 0.0 -> {
                var y = -b / (2 * a)
                var x = Math.sqrt(y)
                println("Уравнение имеет два кореня: x = ${-x} $x")
            }

            else -> {
                var y1 = (-b + Math.sqrt(discriminant)) / (2 * a)
                var y2 = (-b - Math.sqrt(discriminant)) / (2 * a)
                var x1 = Math.sqrt(y1)
                var x2 = Math.sqrt(y2)
                println("Уравнение имеет два корня: x1 = ${-x1} ${x1}, x2 = ${-x2} ${x2}")
            }
        }
    }
    catch (e:Exception){
        println("Неверные данные")
    }
}