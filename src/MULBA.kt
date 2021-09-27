import kotlin.system.exitProcess

fun main() {
cacal()
}


fun cacal() {
    var tru = true
    try {
        println("Вас приветстыует Dungeon master!")
        while (tru == true) {
            println("Введите кол-во желаемых CUM SHOTов!")
            var number1 = readLine()!!.toDouble()
            println("Вы получили первый CUM SHOT, сколько хотите получить ещё?")
            var number2 = readLine()!!.toDouble()
            println("Что вы собираетесь делать с этими CUM SHOTми?")
            var operation = readLine()
            when (operation) {
                "*" -> println("Результат CUM SHOTов $number1 и $number2 = ${number1 * number2}")
                "/" -> println("Результат CUM SHOTов $number1 и $number2 = ${number1 / number2}")
                "-" -> println("Результат CUM SHOTов $number1 и $number2 = ${number1 - number2}")
                "+" -> println("Результат CUM SHOTов $number1 и $number2 = ${number1 + number2}")
                else -> {println("Ах ты FUCKING SALVE!!!")}
            }
            println("Продолжить? [y/n]")
            var a = readLine()
            when (a) {
                "y" -> {println("Продолжаем...")}
                "n" -> {
                    println("Пока  /(._.)/"); tru == false
                }
                else -> {
                    println("Ты даун...")
                }
            }
        }
    } catch (e: Exception){
        print("FUCKING SLAVE, ")
        print("Удаляем ваш ПК.")
        print("."); Thread.sleep(333)
        print("."); Thread.sleep(333)
        print("\\");Thread.sleep(300)
        print("\b|");Thread.sleep(300)
        print("\b/");Thread.sleep(300)
        print("\b-");Thread.sleep(300)
        print("\b\\");Thread.sleep(300)
        print("\b|");Thread.sleep(300)
        print("\b/");Thread.sleep(300)
        print("\b-");Thread.sleep(300)
        print("\b\\");Thread.sleep(300)
        print("\b|");Thread.sleep(300)
        print("\b/");Thread.sleep(300)
        print("\b-");Thread.sleep(300)
        print("\b\\");Thread.sleep(300)
        print("\b|");Thread.sleep(300)
        print("\b/");Thread.sleep(300)
        print("\b-");Thread.sleep(300); print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b")
    } finally {
        print("Заново?[y]/[n]")

    }
}
