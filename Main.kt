fun main() {
    try {

        var a = readln().toDouble()
        var b = readln().toDouble()
        var c = readln().toDouble()
        when {
            (a > 0 && b > 0 && c > 0 && a + c > b && a + b > c && b + c > a) -> {
                var s = (a + b + c) / 2
                var area = Math.sqrt(s * (s - a) * (s - b) * (s - c))

                val height = (2 * area) / a
                println("Высота, опущенная на сторону a: $height")
            }
        }
    }
    catch (e:Exception){
        println("Неверные данные")
    }

}