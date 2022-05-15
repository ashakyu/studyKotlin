package com.example.test

//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명 함수이다.
//1)메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a : Int)
//2)return 값으로 사용할 수가 있다.

//람다의 기본 정의
//val lamdaName : Type = {argumentList -> codeBody}

//type을 선언했기 때문에..
val square: (Int) -> (Int) = { number -> number * number }
val nameAge =  {name : String, age : Int -> "My name is ${name} I'm ${age}"}

fun main() {
    println(nameAge("EunJi", 27))
    val a =  "EunJi said"
    val b =  "Jaeman said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("eunji",27))
    println(calculateGrade(975))

    val lamda =  {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))
    //function의 마지막 return 값이 람다식일 때는 생략 가능하다.
                    //it은 파라미터가 하나일 때 그 파라미터 값을 나타난다.
    println(invokeLamda { it > 3.22 })






}

//확장함수(있는 클래스를 더 추가하고 싶을 때 확장 함수 사용한다)

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}
fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = { "I am ${this } and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 return

//마지막 한줄이 return 값을 의미
                            //String을 항상 return을 해줘야한다.
                                //1000을 입력했을때..?
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        //else 지정해줘야한다.
        else -> "ERROR!"
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}