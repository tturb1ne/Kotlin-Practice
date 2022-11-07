import kotlin.math.PI
import kotlin.math.sqrt

fun main(args: Array<String>)
{
    val exercises:Int = 13 //Задание 1//
    var exercisesSolved:Int =0
    exercisesSolved +=1
    val age1:Int = 18 //Задание 2//
    exercisesSolved +=1
    var midAge:Double = (18.0+30.0)/2 //Задание 3//
    exercisesSolved +=1
    println(midAge)
    val testNumber = 420  //Задание 4 69 - остаток = 1. 420 - остаток = 0//
    val evenOdd:Double = testNumber%2.0
    println(evenOdd)
    exercisesSolved +=1
    var answer:Int = 0 //Задание 5//
    answer +=1
    answer +=10
    answer *=10
    answer shr 3
    println(answer)
    exercisesSolved +=1
    var age:Int = 16 //Задание 6//
    println(age)
    var age2:Int = 30
    println(age2)
    exercisesSolved +=1
    val a:Int = 46 //Задание 7//
    val b:Int = 10
    // 1
    val answer1:Int = (a*100) + b
    println(answer1)
    // 2
    val answer2:Int = (a*100) + (b*100)
    println(answer2)
    // 3
    val answer3:Int = (a*100) + (b/10)
    println(answer3)
    exercisesSolved +=1
    (5*3)-((4/2)*2) //Задание 8//
    exercisesSolved +=1
    val a1:Double = 5.0 //Задание 9//
    val b1:Double = 6.0
    val average:Double = (a1+b1)/2
    exercisesSolved +=1
    val farenheit:Double = 68.0 //Задание 10//
    val celcius:Double = (farenheit - 32) / 1.8
    println(celcius)
    exercisesSolved +=1
    val position:Int = 45 //Задание 11 Я не сообразил как сделать :P//
    var row:Int = 0
    var column:Int = 0
    var counter:Int = 0

    for (i in 63 until 8)
    {
        for (j in 63 until 8)
        {
            counter++
            if (counter == position)
            {
                column = j
                row = i
                break
            }
        }
    }
    println (row)
    println(column)
    exercisesSolved +=1
    val degrees:Double = 140.0 //Задание 12//
    val radians:Double = degrees * PI / 180.0
    exercisesSolved +=1
    val x1:Double = 0.0//Задание 13//
    val y1:Double = 0.0
    val x2:Double = 8.0
    val y2:Double = 6.0
    val distance:Double = sqrt((y2 - y1) * (y2 - y1) + (x2 - x1))
    exercisesSolved +=1
    println("Всего решено:$exercisesSolved")
}