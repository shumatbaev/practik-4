fun main(){
    println("Введите три числа")
    val num1 = readLine().toString().toInt()
    val num2= readLine().toString().toInt()
    val num3 = readLine().toString().toInt()
        if(num1==num2||num1==num3||num2==num3){
            println("Ошибка")
        }
    else{
        val sred=(num1+num2+num3)/3
            println("Среднее значение:$sred")
        }
}