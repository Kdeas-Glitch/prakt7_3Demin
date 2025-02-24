fun main() {
    try {

        var x = readln().toDouble()
        var y = readln().toDouble()
        var z = readln().toDouble()
        var min = 0.0;
        var max = 0.0
        when {
            (x > y) -> {
                max = x
                min = y
            }

            else -> {
                max = y
                min = x
            }
        }
        when {
            y < 0 -> {
                when {
                    (z < max) -> {
                        println(z)
                    }

                    else -> {
                        println(max)
                    }
                }
            }

            else -> {
                when {
                    (z > min) -> println(z)
                    else -> println(min)
                }

            }
        }
    }
    catch (e:Exception){
        println("Неверные данные")
    }
}