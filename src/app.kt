import kotlin.random.Random;
fun main()
{
    val stroka = 5
    val stolbec = 6
    var count = 0;
    val mas = Array(stroka) { IntArray(stolbec)  }
    for (i in 0 until stroka)
    {
        for (j in 0 until stolbec)
        {
            mas[i][j] = (Random.nextInt(-500, 500))
            print(" ${mas[i][j]} ")
        }
        println()
    }

    for (i in 0 until stroka)
    {
        for (j in 0 until stolbec)
        {
            if (mas[0][0] <  mas[i][j]) count++;
        }

    }
    println("количество элементов, значение которых больше первого элемента = $count")
}