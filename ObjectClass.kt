package com.example.test


//class와 다른 점 : CarFactory는 생성할 때 딱 한 번 생성된다
//Singleton Pattern
object CarFactory{
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}
data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)
    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}