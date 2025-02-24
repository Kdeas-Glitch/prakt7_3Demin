fun main() {
    try {
        var x = readln().toDouble()
        var y = readln().toDouble()
        when{//a
            x>0->{
                var d1 = Math.sqrt((1 - x) * (1 - x) + (0 - y) * (0 - y))//prav
                var d2 = Math.sqrt((1 - y) * (1 - y) + (0 - x) * (0 - x))//verx
                var p = (d1 + d2 + Math.sqrt(2.0)) / 2
                var s = Math.sqrt(p * (p - d1) * (p - d2) * (p - Math.sqrt(2.0)))

                var d4 = Math.sqrt((0 - x) * (0 - x) + (-1 - y) * (-1 - y))//niz
                var p2 = (d2 + d4 + Math.sqrt(2.0)) / 2
                var s2 = Math.sqrt(p2 * (p2 - d2) * (p2 - d4) * (p2 - Math.sqrt(2.0)))

                var p3 = (d1 + d4 + 2) / 2
                var s3 = Math.sqrt(p3 * (p3 - d1) * (p3 - d4) * (p3 - 2.0))

                var S = s + s2 + s3
                println("Значение S: $p3 ")
                println("Значение S: $d4 $d1")
                println("Значение S: $S $s $s2 $s3")

                when{
                    S<=1.3-> println("Принадлежит a")
                }

            }
            else->{
                var d1 = Math.sqrt((-3 - x) * (-3 - x) + (0 - y) * (0 - y))//лево
                var d2 = Math.sqrt((1 - y) * (1 - y) + (0 - x) * (0 - x))//верх
                var p = (d1 + d2 + Math.sqrt(10.0)) / 2
                var s = Math.sqrt(p * (p - d1) * (p - d2) * (p - Math.sqrt(10.0)))

                var d4 = Math.sqrt((0 - x) * (0 - x) + (-1 - y) * (-1 - y))//из
                var p2 = (d2 + d4 + (2.0)) / 2
                var s2 = Math.sqrt(p2 * (p2 - d2) * (p2 - d4) * (p2 - (2.0)))

                var p3 = (d1 + d4 + Math.sqrt(10.0)) / 2
                var s3 = Math.sqrt(p3 * (p3 - d1) * (p3 - d4) * (p3 - Math.sqrt(10.0)))

                var S = s + s2 + s3
                when{
                    S<=3.2-> println("Принадлежит a")
                }
            }
        }
        when{//Б
            y>0->{
                var d1 = Math.sqrt((1 - x) * (1 - x) + (0 - y) * (0 - y))//prav
                var d2 = Math.sqrt((2 - y) * (2 - y) + (0 - x) * (0 - x))//verx
                var p = (d1 + d2 + Math.sqrt(5.0)) / 2
                var s = Math.sqrt(p * (p - d1) * (p - d2) * (p - Math.sqrt(5.0)))

                var d4 = Math.sqrt((-1 - x) * (-1 - x) + (0 - y) * (0 - y))//lev
                var p2 = (d2 + d4 + Math.sqrt(5.0)) / 2
                var s2 = Math.sqrt(p2 * (p2 - d2) * (p2 - d4) * (p2 - Math.sqrt(5.0)))

                var p3 = (d1 + d4 + 2) / 2
                var s3 = Math.sqrt(p3 * (p3 - d1) * (p3 - d4) * (p3 - 2.0))
                var S = s + s2 + s3

                when{
                    S<=2.2-> println("Принадлежит Б")
                }

            }
            else->{
                when{
                    x>=-1&&x<=1&&y>=-2-> println("Принадлежит Б")
                }
            }
        }
        when{//В
            x>=-1&&x<=1&&y<=2-> println("Принадлежит В")
            else->{
                var q = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y))
                when{
                    q<=1.2-> println("Принадлежит В")
                }
            }
        }
        when{//Г
            x>0->{
                var d1 = Math.sqrt((1 - x) * (1 - x) + (0 - y) * (0 - y))//prav
                var d2 = Math.sqrt((1 - y) * (1 - y) + (0 - x) * (0 - x))//verx
                var p = (d1 + d2 + Math.sqrt(2.0)) / 2
                var s = Math.sqrt(p * (p - d1) * (p - d2) * (p - Math.sqrt(2.0)))

                var d4 = Math.sqrt((0 - x) * (0 - x) + (-2 - y) * (-2 - y))//niz
                var p2 = (d2 + d4 + 3.0) / 2
                var s2 = Math.sqrt(p2 * (p2 - d2) * (p2 - d4) * (p2 - (3.0)))

                var p3 = (d1 + d4 + Math.sqrt(5.0)) / 2
                var s3 = Math.sqrt(p3 * (p3 - d2) * (p3 - d4) * (p3 - Math.sqrt(5.0)))

                var S = s + s2 + s3

                when{
                    S<=1.7-> println("Принадлежит Г")
                }

            }
            else->{
                var d1 = Math.sqrt((-2 - x) * (-2 - x) + (0 - y) * (0 - y))//лево
                var d2 = Math.sqrt((1 - y) * (1 - y) + (0 - x) * (0 - x))//верх
                var p = (d1 + d2 + Math.sqrt(5.0)) / 2
                var s = Math.sqrt(p * (p - d1) * (p - d2) * (p - Math.sqrt(5.0)))

                var d4 = Math.sqrt((0 - x) * (0 - x) + (-2 - y) * (-2 - y))//из
                var p2 = (d2 + d4 + (3.0)) / 2
                var s2 = Math.sqrt(p2 * (p2 - d2) * (p2 - d4) * (p2 - (3.0)))

                var p3 = (d1 + d4 + Math.sqrt(8.0)) / 2
                var s3 = Math.sqrt(p3 * (p3 - d1) * (p3 - d4) * (p3 - Math.sqrt(8.0)))

                var S = s + s2 + s3

                when{
                    S<=3.2-> println("Принадлежит Г")
                }
            }
        }

    }
    catch (e:Exception){
        println("Неверные данные")
    }


}